package com.codingproject.recyclercardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CardViewActivity extends AppCompatActivity {

//    private  recyclerView02;
//    private  familyDataModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        RecyclerView recycle02 = findViewById(R.id.recyclerView3);
        ArrayList<FamilyMemCardModel> familyDataModelList = new ArrayList<>();

        // Data Source
        familyDataModelList.add(new FamilyMemCardModel("Chinmay Rele", R.drawable.garden));
        familyDataModelList.add(new FamilyMemCardModel("Bhairavi Rele", R.drawable.city));
        familyDataModelList.add(new FamilyMemCardModel("Sanksruti Rele", R.drawable.flowers));
        familyDataModelList.add(new FamilyMemCardModel("Samruddhi Rele", R.drawable.animals));


        // Adapter
        MyAdapterCardView adapter = new MyAdapterCardView(this ,familyDataModelList);
//        RecyclerView.LayoutManager linearlayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        recyclerView02.setLayoutManager(linearlayoutManager);
        recycle02.setLayoutManager(new LinearLayoutManager(this));
        recycle02.setAdapter(adapter);

    }
}