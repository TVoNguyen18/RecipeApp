package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Desserts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ArrayList<CategoryItem> dessertsArrayList = new ArrayList<>();
        dessertsArrayList.add(new CategoryItem("Bánh Trung Thu Ngàn Lớp", R.drawable.banhtrungthunganlop));
        dessertsArrayList.add(new CategoryItem("Chè Troi Nước", R.drawable.chetroinuoc));
        dessertsArrayList.add(new CategoryItem("Bánh Khoai Mì Nướng", R.drawable.banhkhoaiminuong));


        ListView dessertsLV = findViewById(R.id.dessertsRecipes);
        CategoryAdapter dessertsAdapter = new CategoryAdapter(this, dessertsArrayList);
        dessertsLV.setAdapter(dessertsAdapter);

        dessertsLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String foodValue = "";
                Intent intent = new Intent(Desserts.this, RecipePlaceholder.class);
                if (position == 0) {
                    foodValue = "Bánh Trung Thu Ngàn Lớp";
                } else if (position == 1) {
                    foodValue = "Chè Troi Nước";
                } else {
                    foodValue = "Bánh Khoai Mì Nướng";
                }
                intent.putExtra("foodName", foodValue);
                startActivity(intent);
            }
        });
    }
}
