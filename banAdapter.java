package com.example.TAB_App;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class banAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Ban> lBan;

    public banAdapter(Context context, int layout, List<Ban> lBan) {
        this.context = context;
        this.layout = layout;
        this.lBan = lBan;
    }

    @Override
    public int getCount() {
        return lBan.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       convertView=inflater.inflate(layout,null);
        TextView tvTenBan=(TextView) convertView.findViewById(R.id.tvtenBan);
        TextView tvTrangThai=(TextView) convertView.findViewById(R.id.tvtrangThai);
        ImageView imgban=(ImageView) convertView.findViewById(R.id.imgban);
        tvTenBan.setText(lBan.get(position).banSo);
        tvTrangThai.setText(lBan.get(position).trangThai);
        imgban.setImageResource(lBan.get(position).iconBan);
        return convertView;
    }
}
