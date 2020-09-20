package com.team.navigationbottom.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.team.navigationbottom.Activity_Register;
import com.team.navigationbottom.R;
import com.team.navigationbottom.Server.Server;
import com.team.navigationbottom.thongtinchitiet;

import java.util.ArrayList;

public class SanphamAdapter extends RecyclerView.Adapter<SanphamAdapter.KHUNGNHIN> {
    Context context;
    ArrayList<Sanpham> dulieu;

    public SanphamAdapter(Context context, ArrayList<Sanpham> dulieu) {
        this.context = context;
        this.dulieu = dulieu;
    }

    @NonNull
    @Override
    public KHUNGNHIN onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View khungnhin = LayoutInflater.from(context).inflate(R.layout.view_1dong, null);
        KHUNGNHIN k = new KHUNGNHIN(khungnhin);
        return k;
    }

    @Override
    public void onBindViewHolder(@NonNull KHUNGNHIN holder, int position) {
        Sanpham cd = dulieu.get(position);
        holder.masanpham = cd.masanpham;

        holder.tvsanpham.setText(cd.tensanpam);
        holder.tvgia.setText(cd.gia);
        //String url = "http://192.168.9.150:8080/Doan_android/hinh/" + cd.hinhsanpham;
        Picasso.with(context).load(Server.HinhSanPham + cd.hinhsanpham).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return dulieu.size();
    }

    public class KHUNGNHIN extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView img;
        TextView tvsanpham, tvgia;
        String masanpham;

        ImageView hinh;

        public KHUNGNHIN(@NonNull View itemView) {
            super(itemView);
            //ánh xạ
            img = itemView.findViewById(R.id.imgsanpham);
            tvsanpham = itemView.findViewById(R.id.tvsanpham);
            tvgia = itemView.findViewById(R.id.tvgia);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int vitri = getLayoutPosition();
            Sanpham sanpham = dulieu.get(vitri);
            Intent intent = new Intent(context, thongtinchitiet.class);
            intent.putExtra("masanpham", masanpham);
            context.startActivity(intent);

            //Toast.makeText(context, " " + sanpham, Toast.LENGTH_SHORT).show();

        }
    }

    public void TimKiem(ArrayList<Sanpham> filteredList) {
        this.dulieu = filteredList;
        notifyDataSetChanged();
    }
}