package com.example.spinner.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.spinner.R;

public class SpinnerAdapter extends BaseAdapter {

    Context context;
    String s[];

    public SpinnerAdapter(Context context, String[] s) {
        this.context = context;
        this.s = s;
    }

    @Override
    public int getCount() {
        return s.length;
    }

    @Override
    public Object getItem(int i) {
        return s[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // inflate the layout for each list row
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.items, parent, false);
        }

        TextView text = convertView.findViewById(R.id.text);
        text.setText(s[position]);

        return convertView;
    }



}
