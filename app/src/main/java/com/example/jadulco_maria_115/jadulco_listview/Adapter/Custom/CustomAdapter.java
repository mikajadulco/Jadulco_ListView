package com.example.jadulco_maria_115.jadulco_listview.Adapter.Custom;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jadulco_maria_115.jadulco_listview.Model.College;
import com.example.jadulco_maria_115.jadulco_listview.R;

import java.util.List;

/**
 * Created by JADULCO_MARIA_115 on 9/7/2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context c;
    List<College> colleges;
    ImageView iv_Logo;
    TextView tv_name;
    TextView tv_Year;

    public CustomAdapter(Context c, List<College> colleges) {
        this.c = c;
        this.colleges = colleges;
    }


    @Override
    public int getCount() {
        return colleges.size();
    }

    @Override
    public Object getItem(int i) {
        return colleges.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(c, R.layout.row_layout, null);
        iv_Logo = (ImageView) v.findViewById(R.id.ivLogo);
        tv_name = (TextView) v.findViewById(R.id.tvCollege);
        tv_Year = (TextView) v.findViewById(R.id.tvYear);
        tv_name.setText(colleges.get(i).getName());

        return null;
    }
}
