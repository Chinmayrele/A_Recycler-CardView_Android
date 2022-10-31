package com.codingproject.recyclercardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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




//        RecyclerView recyclerView = findViewById(R.id.recyclerView);
//
//        // DATA
//        DataModel[] myListData = new DataModel[] {
//                new DataModel("Master Coding App", R.drawable.animals),
//                new DataModel("Chinmay Rele", R.drawable.flowers),
//                new DataModel("Bhairavi Rele", R.drawable.city),
//                new DataModel("Flutter App", R.drawable.garden),
//        };
//
//        //ADAPTER
//        MyAdapter adapter = new MyAdapter(myListData);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));


//
//        //Button
//        Button btn = findViewById(R.id.buttonCardView);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(), CardViewActivity.class);
//                startActivity(i);
//            }
//        });



    }
}