package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Drinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        ArrayList<CategoryItem> drinksArrayList = new ArrayList<>();
        drinksArrayList.add(new CategoryItem("Cà Phê Sữa Đá", R.drawable.caphesuada));
        drinksArrayList.add(new CategoryItem("Nước Sâm", R.drawable.nuocssam));
        drinksArrayList.add(new CategoryItem("Sinh Tố Bơ", R.drawable.sinhtobo));

        ListView drinksLV = findViewById(R.id.drinksRecipes);
        CategoryAdapter drinksAdapter = new CategoryAdapter(this, drinksArrayList);
        drinksLV.setAdapter(drinksAdapter);

        drinksLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String foodValue = "";
                Intent intent = new Intent(Drinks.this, RecipePlaceholder.class);
                if (position == 0) {
                    foodValue = "Cà Phê Sữa Đá";
                } else if (position == 1) {
                    foodValue = "Nước Sâm";
                } else {
                    foodValue = "Sinh Tố Bơ";
                }
                intent.putExtra("foodName", foodValue);
                startActivity(intent);
            }
        });
    }
}
