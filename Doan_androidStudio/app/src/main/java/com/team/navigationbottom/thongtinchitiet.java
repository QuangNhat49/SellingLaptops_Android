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

public class thongtinchitiet extends AppCompatActivity {
    TextView tv_gia, tv_thongtin, tv_tensp;
    ImageView img_ttchitiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtinchitiet);

        tv_gia = findViewById(R.id.tv_gia);
        tv_tensp = findViewById(R.id.tv_tensp);
        tv_thongtin = findViewById(R.id.tv_thongtin);
        img_ttchitiet = findViewById(R.id.img_ttchitiet);

        Intent intent = getIntent();
        String masanpham = intent.getStringExtra("masanpham");
        //String url = "http://192.168.9.150:8080/Doan_android/DL_TTchitietsanpham.php";

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        Response.Listener<JSONArray> thanhcong = new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject object = response.getJSONObject(i);
                        //img_ttchitiet.setImageResource(img_ttchitiet.getId() + object.getInt("hinhsanpham"));
                        tv_tensp.setText(tv_tensp.getText() + object.getString("tensanpham"));
                        tv_gia.setText(tv_gia.getText() + object.getString("gia"));
                        tv_thongtin.setText(tv_thongtin.getText() + object.getString("thongtinsanpham"));

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

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, Server.TTChiTietSanPham + masanpham, null, thanhcong, loi);
        requestQueue.add(jsonArrayRequest);
    }


}