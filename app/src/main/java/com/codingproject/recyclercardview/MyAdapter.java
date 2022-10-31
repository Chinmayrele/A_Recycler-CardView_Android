package com.codingproject.recyclercardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    // 1 - DATA SOURCE
    private DataModel[] listData;

    public MyAdapter(DataModel[] listData) {
        this.listData = listData;
    }


    // 2 - VIEW HOLDER CLASS
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageViewRecycle);
            this.textView = itemView.findViewById(R.id.textViewRecycle);
        }
    }

    // 3 - IMPLEMENTING OVER-RIDDEN METHODS
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.item_recycler_design, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataModel myListData = listData[position];
        holder.imageView.setImageResource(listData[position].getImageFile());
        holder.textView.setText(listData[position].getMainTitle());

        //HANDLING CLICK LISTENER
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

}
