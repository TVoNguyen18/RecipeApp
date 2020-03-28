package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Recipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        ArrayList<CategoryItem> recipesTypesArrayList = new ArrayList<>();
        recipesTypesArrayList.add(new CategoryItem("Drinks", R.drawable.caphesuada));
        recipesTypesArrayList.add(new CategoryItem("Dishes", R.drawable.chagio));
        recipesTypesArrayList.add(new CategoryItem("Desserts", R.drawable.banhtrungthunganlop));

        ListView recipesTypesListView = findViewById(R.id.recipesTypesList);
        CategoryAdapter typesAdapter = new CategoryAdapter(this, recipesTypesArrayList);
        recipesTypesListView.setAdapter(typesAdapter);

        recipesTypesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(Recipes.this, Drinks.class));
                } else if (position == 1) {
                    startActivity(new Intent(Recipes.this, Dishes.class));
                } else {
                    startActivity(new Intent(Recipes.this, Desserts.class));
                }
            }
        });
    }
}
