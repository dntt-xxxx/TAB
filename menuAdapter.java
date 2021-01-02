package com.example.TAB_App;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class menuAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<menu> arrList;

    public menuAdapter(Context context, int layout, List<menu> arrList) {
        this.context = context;
        this.layout = layout;
        this.arrList = arrList;
    }

    @Override
    public int getCount() {
        return arrList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder{
        TextView tvTen;
        ImageView imgAnh;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(layout,null);
            viewHolder=new ViewHolder();

            viewHolder.tvTen= (TextView) convertView.findViewById(R.id.tvcafe);
            viewHolder.imgAnh=(ImageView) convertView.findViewById(R.id.imgmenu);
            convertView.setTag(viewHolder);
        }
        else{viewHolder=(ViewHolder) convertView.getTag();}

        viewHolder.tvTen.setText(arrList.get(position).tenCafe);
        viewHolder.imgAnh.setImageResource(arrList.get(position).anhCafe);

        return convertView;

    }
}
