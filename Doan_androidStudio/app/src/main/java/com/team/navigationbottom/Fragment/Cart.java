package com.team.navigationbottom.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.team.navigationbottom.R;
import com.team.navigationbottom.Adapter.Sanpham;
import com.team.navigationbottom.Adapter.SanphamAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Cart extends Fragment {
    View v;
//    RecyclerView rvsanphambanchay;
//    ArrayList<Sanpham> dulieu = new ArrayList<>();
//    SanphamAdapter adapter;


//    String url = "http://192.168.9.150:8080/Doan_android/sanpham.php";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.cart, container, false);
//        rvsanphambanchay=v.findViewById(R.id.rvsanphambanchay);
//
//        adapter = new SanphamAdapter(getContext(),dulieu);
//        rvsanphambanchay.setAdapter(adapter);
//        rvsanphambanchay.setLayoutManager(new GridLayoutManager(getContext(), 1));
//        laydulieu(url);

        return v;
    }

//    //lấy dữ liệu
//    void laydulieu(String url) {
//        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
//        //Nếu lấy dữ liệu thành công
//        Response.Listener<JSONArray> thanhcong = new Response.Listener<JSONArray>() {
//            @Override
//            public void onResponse(JSONArray response) {
//                for (int i = 0; i < response.length(); i++) {
//                    try {
//                        JSONObject object = response.getJSONObject(i);
//                        dulieu.add(new Sanpham(object.getString("masanpham"), object.getString("tensanpham"), object.getString("gia"), object.getString("hinhsanpham")));
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                }
//                adapter.notifyDataSetChanged();
//            }
//        };
//
//        //Nếu lấy dữ liệu không thành công
//        Response.ErrorListener loi = new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse( VolleyError error) {
////                Toast.makeText(getContext(), "loi : " +error.toString(), Toast.LENGTH_SHORT).show();
//            }
//        };
//        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, thanhcong, loi);
//        requestQueue.add(jsonArrayRequest);
//    }
}
