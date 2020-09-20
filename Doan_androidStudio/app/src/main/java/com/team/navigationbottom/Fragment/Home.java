package com.team.navigationbottom.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;


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
import com.squareup.picasso.Picasso;
import com.team.navigationbottom.Adapter.DanhmucAdapter;
import com.team.navigationbottom.R;
import com.team.navigationbottom.Adapter.danhmuc;
import com.team.navigationbottom.Server.Server;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class Home extends Fragment {

    View v;
    ViewFlipper vfquangcao;
    RecyclerView rvdanhmuc;
    //String url = "http://192.168.9.150:8080/Doan_android/danhmuc.php";
    ArrayList<danhmuc> dulieu = new ArrayList<>();
    DanhmucAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.home, container, false);
        rvdanhmuc = v.findViewById(R.id.rvdanhmuc);
        vfquangcao = v.findViewById(R.id.vfquangcao);

        adapter = new DanhmucAdapter(getContext(), dulieu);
        rvdanhmuc.setAdapter(adapter);
        rvdanhmuc.setLayoutManager(new GridLayoutManager(getContext(), 2));
        laydulieu(Server.DanhMucSanPham);
        ViewFlipper();
        return v;
    }

    void laydulieu(String url) {
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        //Nếu lấy dữ liệu thành công
        Response.Listener<JSONArray> thanhcong = new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject object = response.getJSONObject(i);
                        dulieu.add(new danhmuc(object.getString("madanhmuc"), object.getString("tendanhmuc"), object.getString("hinhdanhmuc")));
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
                Toast.makeText(getContext(), "loi : " + error.toString(), Toast.LENGTH_SHORT).show();
            }
        };
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, thanhcong, loi);
        requestQueue.add(jsonArrayRequest);
    }

    private void ViewFlipper() {
        ArrayList<String> mangquangcao = new ArrayList<>();
//        mangquangcao.add("https://product.hstatic.net/1000026716/product/gearvn-laptop-dell-inspiron-g7-7590-n7590z-78878_1e567b59f19a4132991e7ea5c185227b.jpg");
//        mangquangcao.add("https://product.hstatic.net/1000026716/product/fa706ii-h7125t_e2928fcc61d44b98a4b709bf3035bbf4.png");
//        mangquangcao.add("https://product.hstatic.net/1000026716/product/msi-ge66-raider-10sf_4bdb2df016a14866a9414b9468682edf.jpg");


        mangquangcao.add("https://file.hstatic.net/1000026716/file/1920_-_1080_cf14987285ca4911be2ca4b7900e4dff.jpg");
        mangquangcao.add("https://theme.hstatic.net/1000026716/1000440777/14/slideshow_3.jpg?v=14068");
        mangquangcao.add("https://theme.hstatic.net/1000026716/1000440777/14/slideshow_5.jpg?v=14068");


        for (int i = 0; i < mangquangcao.size(); i++) {
            ImageView imageView = new ImageView(getActivity());
            Picasso.with(getActivity()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            vfquangcao.addView(imageView);
        }
        vfquangcao.setFlipInterval(3000);
        vfquangcao.setAutoStart(true);
        Animation animation_slide_in_right = AnimationUtils.loadAnimation(getActivity(), R.anim.anim_in_right);
        Animation animation_slide_out_right = AnimationUtils.loadAnimation(getActivity(), R.anim.anim_out_right);
        Animation animation_slide_in_left = AnimationUtils.loadAnimation(getActivity(), R.anim.anim_in_left);
        Animation animation_slide_out_left = AnimationUtils.loadAnimation(getActivity(), R.anim.anim_out_left);

        vfquangcao.setInAnimation(animation_slide_in_right);
        vfquangcao.setOutAnimation(animation_slide_out_right);
        vfquangcao.setOutAnimation(animation_slide_in_left);
        vfquangcao.setOutAnimation(animation_slide_out_left);

    }

}
