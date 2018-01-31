package com.example.per6.jsontest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by per6 on 1/19/18.
 */

public class StrikeAdapter extends RecyclerView.Adapter<StrikeAdapter.MyViewHolder> {

    Context context;
    List<Strike> strikes;

    public StrikeAdapter(Context context, List<Strike> strike) {
        this.context = context;
        this.strikes = strike;
    }

    public void setStrikes(List<Strike> strikes) {
        this.strikes = strikes;
    }

    @Override
    public StrikeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.word_item, parent, false);


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(StrikeAdapter.MyViewHolder holder, int position) {
        Strike strike = strikes.get(position);
        holder.idText.setText(strike.getId());
        holder.deathsWord.setText(strike.getDeaths());
        holder.number.setText(strike.getNumber());
    }

    @Override
    public int getItemCount() {
        return strikes.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView idText, deathsWord, number;

        public MyViewHolder(View itemView) {
            super(itemView);
            idText = (TextView) itemView.findViewById(R.id.id);
            deathsWord = (TextView) itemView.findViewById(R.id.deaths);
        }
    }

}
