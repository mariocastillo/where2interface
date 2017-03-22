package com.example.mario.navigationdrawerexample;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mario on 22/03/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Restaurant> mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public CardView mCard;
        public ViewHolder(CardView v) {
            super(v);
            mCard = v;
        }
    }

    public MyAdapter(List<Restaurant> mDataset) {
        this.mDataset = mDataset;
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
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        ImageView logo= (ImageView) holder.mCard.findViewById(R.id.logorest);
        TextView nombre= (TextView) holder.mCard.findViewById(R.id.nombrerest);
        TextView tipo= (TextView) holder.mCard.findViewById(R.id.tiporest);
        TextView distancia= (TextView) holder.mCard.findViewById(R.id.distanciarest);
        logo.setImageResource(R.mipmap.platillosvoladores);
        nombre.setText(mDataset.get(position).getNombre());
        tipo.setText(mDataset.get(position).getTipo());
        distancia.setText(String.valueOf(mDataset.get(position).getDistancia())+"km");

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
