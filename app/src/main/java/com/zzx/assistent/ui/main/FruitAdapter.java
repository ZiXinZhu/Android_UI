package com.zzx.assistent.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zzx.assistent.R;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<FruitDO> {

    private int resourceId;

    public FruitAdapter(Context context, int resource,List<FruitDO> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        FruitDO fruitDO=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView fruitimages=view.findViewById(R.id.fruit_image);
        TextView fruitname=view.findViewById(R.id.fruit_name);
        fruitimages.setImageResource(fruitDO.getImageId());
        fruitname.setText(fruitDO.getName());
        return view;
    }
}
