package com.team.navigationbottom.Fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.team.navigationbottom.Activity_Register;
import com.team.navigationbottom.MainActivity;
import com.team.navigationbottom.R;
import com.team.navigationbottom.Server.Server;

import java.util.HashMap;
import java.util.Map;

public class Person extends Fragment {

    View v;
    Button ButtonRegistration, ButtonLogin;
    EditText edemail, edmatkhau;

    String str_email, str_matkhau;
    //String url = "http://192.168.9.150:8080/Doan_android/login.php";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //v = inflater.inflate(R.layout.activity__login, container, false);
        v = inflater.inflate(R.layout.person, container, false);

        //Ánh xạ

        edemail = v.findViewById(R.id.editTextUserName);
        edmatkhau = v.findViewById(R.id.editTextPassword);

        ButtonRegistration = v.findViewById(R.id.ButtonRegistration);
        ButtonRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextScreen = new Intent(getActivity(), Activity_Register.class);
                startActivity(nextScreen);
            }
        });

        ButtonLogin = v.findViewById(R.id.ButtonLogin);
        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edemail.getText().toString().equals("")) {
                    //Toast.makeText(this, "Nhập Email", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getActivity(), "Nhập Email", Toast.LENGTH_SHORT).show();

                } else if (edmatkhau.getText().toString().equals("")) {
                    Toast.makeText(getActivity(), "Nhập Mật Khẩu", Toast.LENGTH_SHORT).show();

                } else {
                    final ProgressDialog progressDialog = new ProgressDialog(getActivity());

                    progressDialog.setMessage("Vui Lòng Chờ . . .");

                    progressDialog.show();

                    str_email = edemail.getText().toString().trim();
                    str_matkhau = edmatkhau.getText().toString().trim();

                    StringRequest request = new StringRequest(Request.Method.POST, Server.DangNhap, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            progressDialog.dismiss();

                            if (response.equalsIgnoreCase("Đăng Nhập Thành Công")) {

                                edemail.setText("");
                                edmatkhau.setText("");
                                startActivity(new Intent(getContext(), MainActivity.class));

                                Toast.makeText(getActivity(), response, Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(getActivity(), response, Toast.LENGTH_SHORT).show();
                            }

                        }
                    }, new Response.ErrorListener() {

                        @Override
                        public void onErrorResponse(VolleyError error) {
                            progressDialog.dismiss();
                            Toast.makeText(getActivity(), error.getMessage().toString(), Toast.LENGTH_SHORT).show();

                        }
                    }
                    ) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> params = new HashMap<String, String>();
                            params.put("Email", str_email);
                            params.put("MatKhau", str_matkhau);
                            return params;
                        }
                    };
                    RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
                    requestQueue.add(request);
                }
            }
        });

        return v;
    }
}