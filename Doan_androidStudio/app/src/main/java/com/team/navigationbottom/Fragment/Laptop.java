package com.team.navigationbottom.Fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.team.navigationbottom.Adapter.Sanpham;
import com.team.navigationbottom.Adapter.SanphamAdapter;
import com.team.navigationbottom.Adapter.TimKIemAdapter;
import com.team.navigationbottom.R;
import com.team.navigationbottom.Server.Server;
import com.team.navigationbottom.TimKiemItem;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Laptop extends Fragment {

    View v;
    RecyclerView rvsanphambanchay;
    ArrayList<Sanpham> dulieu = new ArrayList<>();
    SanphamAdapter adapter;
    EditText action_search;

    //String url = "http://192.168.9.150:8080/Doan_android/sanpham.php";

    //tk
    private ArrayList<TimKiemItem> mExampleList;
    private RecyclerView mRecyclerView;
    private TimKIemAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    //tk

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.laptop, container, false);

        rvsanphambanchay = v.findViewById(R.id.rvsanphambanchay);


        adapter = new SanphamAdapter(getContext(), dulieu);
        rvsanphambanchay.setAdapter(adapter);
        rvsanphambanchay.setLayoutManager(new GridLayoutManager(getContext(), 2));
        laydulieu(Server.SanPham);

//        tk
        action_search = v.findViewById(R.id.action_search);

        action_search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filter(editable.toString());
            }
        });
        buildRecyclerView();
//        end tk

        return v;
    }

    //    lấy dữ liệu

    void laydulieu(String url) {
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        //Nếu lấy dữ liệu thành công
        Response.Listener<JSONArray> thanhcong = new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject object = response.getJSONObject(i);
                        dulieu.add(new Sanpham(object.getString("masanpham"), object.getString("tensanpham"), object.getString("gia"), object.getString("hinhsanpham")));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                adapter.notifyDataSetChanged();
            }
        };

        //Nếu lấy dữ liệu không thành công
        Response.ErrorListener loi = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(), "Lỗi : " + error.toString(), Toast.LENGTH_SHORT).show();
            }
        };
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, thanhcong, loi);
        requestQueue.add(jsonArrayRequest);
    }

    //        tk
    private void filter(String text) {
        ArrayList<TimKiemItem> filteredList = new ArrayList<>();
        for (TimKiemItem item : mExampleList) {
            if (item.getmText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void buildRecyclerView() {
//        mRecyclerView = v.findViewById(R.id.recyclerView);
//        mRecyclerView.setHasFixedSize(true);
//        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new TimKIemAdapter(mExampleList);
//        mRecyclerView.setLayoutManager(mLayoutManager);
//        mRecyclerView.setAdapter(mAdapter);
    }
//    END TK
}
