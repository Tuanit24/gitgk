package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class doctors_adapter extends BaseAdapter {
    Context mycontext;
    int myLayout;
    List<doctors> arraydoctor;

    public doctors_adapter(Context context, int layout, List<doctors> doctorsList){
        mycontext = context;
        myLayout = layout;
        arraydoctor = doctorsList;

    }

    @Override
    public int getCount() {
        return arraydoctor.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(myLayout, null);

        TextView txtname= (TextView) view.findViewById(R.id.tvname);
        txtname.setText(arraydoctor.get(i).name);
        TextView txtfield = (TextView) view.findViewById(R.id.tvfield);
        txtfield.setText(arraydoctor.get(i).field);
        ImageView txthinh = (ImageView) view.findViewById(R.id.imageviewHinh);
        txthinh.setImageResource(arraydoctor.get(i).hinh);



        return view;
    }
}
