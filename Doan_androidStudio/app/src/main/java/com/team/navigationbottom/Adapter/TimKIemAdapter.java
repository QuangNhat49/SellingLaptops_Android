package com.team.navigationbottom.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.team.navigationbottom.R;
import com.team.navigationbottom.TimKiemItem;

import java.util.ArrayList;

public class TimKIemAdapter extends RecyclerView.Adapter<TimKIemAdapter.ExampleViewHolder> {
    private ArrayList<TimKiemItem> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imgsanpham);
            mTextView1 = itemView.findViewById(R.id.tvsanpham);
            mTextView2 = itemView.findViewById(R.id.tvgia);

        }
    }

    public TimKIemAdapter(ArrayList<TimKiemItem> exampleList) {
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_1dong,
                parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        TimKiemItem currentItem = mExampleList.get(position);

        holder.mImageView.setImageResource(currentItem.getmImageResource());
        holder.mTextView1.setText(currentItem.getmText1());
        holder.mTextView2.setText(currentItem.getmText2());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public void filterList(ArrayList<TimKiemItem> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}