package com.team.navigationbottom.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.team.navigationbottom.Danhmucsanpham;
import com.team.navigationbottom.R;
import com.team.navigationbottom.Server.Server;
import com.team.navigationbottom.thongtinchitiet;

import java.util.ArrayList;

public class DanhmucAdapter extends RecyclerView.Adapter<DanhmucAdapter.KHUNGNHIN> {
    Context context;
    ArrayList<danhmuc> dulieu;

    public DanhmucAdapter(Context context, ArrayList<danhmuc> dulieu) {
        this.context = context;
        this.dulieu = dulieu;
    }

    @NonNull
    @Override
    public DanhmucAdapter.KHUNGNHIN onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View khungnhin = LayoutInflater.from(context).inflate(R.layout.danhmuc_1dong, null);
        DanhmucAdapter.KHUNGNHIN k = new DanhmucAdapter.KHUNGNHIN(khungnhin);
        return k;
    }

    @Override
    public void onBindViewHolder(@NonNull DanhmucAdapter.KHUNGNHIN holder, int position) {
        danhmuc cd = dulieu.get(position);
        holder.madanhmuc = cd.madanhmuc;
        holder.tvdanhmuc.setText(cd.tendanhmuc);
        //String url = "http://192.168.9.150:8080/Doan_android/logo/" + cd.hinhdanhmuc;
        //LogoDanhMuc
        Picasso.with(context).load(Server.LogoDanhMuc + cd.hinhdanhmuc).into(holder.imgdanhmuc);
    }

    @Override
    public int getItemCount() {
        return dulieu.size();
    }

    public class KHUNGNHIN extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgdanhmuc;
        TextView tvdanhmuc;
        String madanhmuc;

        public KHUNGNHIN(@NonNull View itemView) {
            super(itemView);
            //ánh xạ
            imgdanhmuc = itemView.findViewById(R.id.imgdanhmuc);
            tvdanhmuc = itemView.findViewById(R.id.tvdanhmuc);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, Danhmucsanpham.class);
            intent.putExtra("madanhmuc", madanhmuc);
            context.startActivity(intent);
        }
    }
}
