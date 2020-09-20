package com.team.navigationbottom;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.team.navigationbottom.Server.Server;

import java.util.HashMap;
import java.util.Map;

public class Activity_Register extends AppCompatActivity {

    EditText edhoten, eddiachi, edsodienthoai, edemail, edmatkhau;
    String str_hoten, str_diachi, str_sodienthoai, str_email, str_matkhau;
    //String url = "http://192.168.9.150:8080/Doan_android/register.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__register);

        edhoten = findViewById(R.id.hoten);
        eddiachi = findViewById(R.id.diachi);
        edsodienthoai = findViewById(R.id.sodienthoai);
        edemail = findViewById(R.id.email);
        edmatkhau = findViewById(R.id.matkhau);
    }

    public void Register(View view) {

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Vui lòng chờ ... ");


        if (edhoten.getText().toString().equals("")) {
            Toast.makeText(this, "Nhập họ tên", Toast.LENGTH_SHORT).show();
        } else if (eddiachi.getText().toString().equals("")) {
            Toast.makeText(this, "Nhập địa chỉ", Toast.LENGTH_SHORT).show();
        } else if (edsodienthoai.getText().toString().equals("")) {
            Toast.makeText(this, "Nhập số điện thoại", Toast.LENGTH_SHORT).show();
        } else if (edemail.getText().toString().equals("")) {
            Toast.makeText(this, "Nhập Email", Toast.LENGTH_SHORT).show();
        } else if (edmatkhau.getText().toString().equals("")) {
            Toast.makeText(this, "Nhập mật khẩu", Toast.LENGTH_SHORT).show();
        } else {

            progressDialog.show();
            str_hoten = edhoten.getText().toString().trim();
            str_diachi = eddiachi.getText().toString().trim();
            str_sodienthoai = edsodienthoai.getText().toString().trim();
            str_email = edemail.getText().toString().trim();
            str_matkhau = edmatkhau.getText().toString().trim();

            StringRequest request = new StringRequest(Request.Method.POST, Server.DangKy, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    progressDialog.dismiss();
                    edhoten.setText("");
                    eddiachi.setText("");
                    edsodienthoai.setText("");
                    edemail.setText("");
                    edmatkhau.setText("");

                    Toast.makeText(Activity_Register.this, response, Toast.LENGTH_SHORT).show();
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {
                    progressDialog.dismiss();
                    //Toast.makeText(Activity_register.this, error.getMessage().toString(), Toast.LENGTH_SHORT).show();
                    Toast.makeText(Activity_Register.this, "Lỗi đăng ký", Toast.LENGTH_SHORT).show();
                }
            }
            ) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> params = new HashMap<String, String>();

                    params.put("HoTen", str_hoten);
                    params.put("DiaChi", str_diachi);
                    params.put("SDT", str_sodienthoai);
                    params.put("Email", str_email);
                    params.put("MatKhau", str_matkhau);
                    return params;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(Activity_Register.this);
            requestQueue.add(request);
        }
    }
}