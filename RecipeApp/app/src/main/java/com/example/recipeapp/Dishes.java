
package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Dishes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishes);

        ArrayList<CategoryItem> dishesArrayList = new ArrayList<>();
        dishesArrayList.add(new CategoryItem("Chả Giò", R.drawable.chagio));
        dishesArrayList.add(new CategoryItem("Bì Cuốn Chay", R.drawable.bicuonchay));
        dishesArrayList.add(new CategoryItem("Cháo Gà", R.drawable.chaoga));

        ListView dishesLV = findViewById(R.id.dishesRecipes);
        CategoryAdapter dishesAdapter = new CategoryAdapter(this, dishesArrayList);
        dishesLV.setAdapter(dishesAdapter);

        dishesLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String foodValue = "Say something.";
                Intent intent = new Intent(Dishes.this, RecipePlaceholder.class);
                if (position == 0) {
                    foodValue = "Chả Giò";
                } else if (position == 1) {
                    foodValue = "Bì Cuốn Chay";
                } else {
                    foodValue = "Cháo Gà";
                }
                intent.putExtra("foodName", foodValue);
                startActivity(intent);
            }
        });
    }
}
