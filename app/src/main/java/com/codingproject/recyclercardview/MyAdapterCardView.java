package com.codingproject.recyclercardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyAdapterCardView extends RecyclerView.Adapter<MyAdapterCardView.ViewHolder> {

    // 1 - Data Source
    private Context context;
    private ArrayList<FamilyMemCardModel> familyCardModelList;

    // 2 - Constructors


    public MyAdapterCardView(Context context, ArrayList<FamilyMemCardModel> familyCardModel) {
        this.context = context;
        this.familyCardModelList = familyCardModel;
    }


    // 3 - View-Holding Class
    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView familyImage;
        private TextView familyName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.familyImage = itemView.findViewById(R.id.imageViewCard);
            this.familyName = itemView.findViewById(R.id.textViewCard);
        }
    }

    // 4 - Implementing the Methods
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.activity_card_view, parent, false);
        return new MyAdapterCardView.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        FamilyMemCardModel familyData = familyCardModelList.get(position);
        holder.familyName.setText(familyData.getFamilyName());
        holder.familyImage.setImageResource(familyData.getImageFile());

    }

    @Override
    public int getItemCount() {
        return familyCardModelList.size();
    }
}
