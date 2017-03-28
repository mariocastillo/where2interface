package com.example.mario.navigationdrawerexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mario.navigationdrawerexample.modules.Restaurant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by mario on 22/03/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private ArrayList<Restaurant> mDataset=new ArrayList<Restaurant>();
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public CardView mCard;
        public ViewHolder(CardView v) {
            super(v);
            mCard = v;
        }
    }

    public MyAdapter(ArrayList<Restaurant> mDataset,Context context) {
        this.mDataset = mDataset;
        this.context=context;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        CardView v = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_restaurants_item, parent, false);
        // set the view's size, margins, paddings and layout parameters


        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, final int position) {
        ImageView logo= (ImageView) holder.mCard.findViewById(R.id.logorest);
        TextView nombre= (TextView) holder.mCard.findViewById(R.id.nombrerest);
        TextView tipo= (TextView) holder.mCard.findViewById(R.id.tiporest);
        TextView distancia= (TextView) holder.mCard.findViewById(R.id.distanciarest);
        logo.setImageResource(R.mipmap.platillosvoladores);
        nombre.setText(mDataset.get(position).getName());
        tipo.setText(mDataset.get(position).getTypes().get(0));
        distancia.setText(String.valueOf(mDataset.get(position).getRating()));
        holder.mCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //context.startActivity(new Intent(context,RestaurantActivity.class));
                context.startActivity(new Intent(context,RestaurantActivity.class));
                Toast.makeText(context,"item"+position+" nombre: "+mDataset.get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
