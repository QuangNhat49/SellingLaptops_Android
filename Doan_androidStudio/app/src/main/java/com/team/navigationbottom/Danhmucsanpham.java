package com.team.navigationbottom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.team.navigationbottom.Server.Server;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Danhmucsanpham extends AppCompatActivity {
    TextView tv_gia_sanpham, tv_danhmuc_sanpham;
    ImageView img_danhmuc_sanpham;
    //String url = "http://192.168.9.150:8080/Doan_android/ttdanhmuc.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhmucsanpham);
        tv_gia_sanpham = findViewById(R.id.tv_gia_sanpham);
        tv_danhmuc_sanpham = findViewById(R.id.tv_danhmuc_sanpham);
        img_danhmuc_sanpham = findViewById(R.id.img_danhmuc_sanpham);

        Intent intent = getIntent();
        String madanhmuc = intent.getStringExtra("madanhmuc");
        //String url = "http://192.168.9.150:8080/Doan_android/ttdanhmuc.php?madm=" + madanhmuc;


        //String url = "http://192.168.9.150:8080/Doan_android/danhmuc.php" + madanhmuc;
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        Response.Listener<JSONArray> thanhcong = new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject object = response.getJSONObject(i);
                        tv_danhmuc_sanpham.setText(tv_danhmuc_sanpham.getText() + object.getString("tensanpham"));
                        tv_gia_sanpham.setText(tv_gia_sanpham.getText() + object.getString("gia"));
                        //img_danhmuc_sanpham.setImageResource(img_danhmuc_sanpham.getId() + object.getInt("hinhsanpham"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

            }


        };

        //Nếu lấy dữ liệu không thành công
        Response.ErrorListener loi = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "loi : " + error.toString(), Toast.LENGTH_SHORT).show();
            }
        };

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, Server.MaDanhMuc + madanhmuc, null, thanhcong, loi);
        requestQueue.add(jsonArrayRequest);
    }
}