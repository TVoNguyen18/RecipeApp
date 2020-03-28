package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecipePlaceholder extends AppCompatActivity {
    private ImageView photo;
    private TextView name;
    private TextView ingredients;
    private TextView directions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_placeholder);
        Bundle newBundle = getIntent().getExtras();
        String newBundleData = newBundle.getString("foodName");

        ArrayList<String> ingredientLists = new ArrayList<String>();
        ArrayList<String> directionsList = new ArrayList<String>();
        int[] myImageList = new int[]{R.drawable.caphesuada, R.drawable.nuocssam, R.drawable.sinhtobo,
                                      R.drawable.chagio, R.drawable.bicuonchay, R.drawable.chaoga,
                                      R.drawable.banhtrungthunganlop, R.drawable.chetroinuoc, R.drawable.banhkhoaiminuong};
        int i;

        ingredientLists.add("4 tsp Cafe Du Monde\n2 tsp condensed milk\n1 cup boiling water");
        directionsList.add("1. Boil the water.\n\n2. Preheat the filter and cup by pouring some boiling water through it.\n" +
                "\n3. Remove the metal filter and pour in 1 tablespoon of ground coffee.\n" +
                "\n4. Twist the filter on gently until it just starts to stop, then turn it a little less than 1/8th of a turn.\n" +
                "\n5. Pour a tiny bit of water in the filter just to wet the grind and to let it expand a bit. Toss out any small grinds that made it through the filter.\n"+
                "\n6. Fill the filter all the way and let it drip for 3 to 5 minutes. Adjust the filter accordingly: not too loose or too tight!\n" +
                "\n7. Add 1-2 teaspoons of condensed milk and slowly add more to taste. Stir to dissolve.\n" +
                "\n8. For iced coffee, let it cool off and then pour the brew into a glass filled with ice.");

        ingredientLists.add("2 lbs winter melon\n1.5 oz pandan leaves\n1/3 oz Chinese foxglove root\n0.5 oz rock sugar\n1/3 tsp salt");
        directionsList.add("1. Keep the skin on the winter melon and wash it clean. Then cut the melon into circles.\n"+
                "\n2.Add the winter melon circles, salt, Chinese foxglove root, and enough water to cover everything into a pot. Cook for 2 hours on medium heat, and do not cover with a lid to avoid overflowing.\n" +
                "\n3.When the winter melon is very soft (about 10 minutes before turning off the heat), wash the pandan leaves and tie them together. Add them into the pot for five minutes.\n" +
                "\n4.Turn off the heat. Strain the contents of the pot into a container and throw away the solids. When the liquid is still hot, add in the rock sugar. Stir to dissolve.");

        ingredientLists.add("1 medium ripe avocado, peeled and pitted\n1 cup ice cubes\n1/3 cup sweetened condensed milk\n1/2 cup whole milk");
        directionsList.add("1. Add all ingredients into a blender and purée until smooth. Pour contents of the blender into two glasses and serve immediately.");

        ingredientLists.add("1 package Menlo brand wrappers\n1 lb ground pork\n1 medium jícama\n2/3 cup onion\n1/2 cup Chinese vermicelli noodles (cut into 1\"-1.5\" threads)\n1/8 cup wood ear mushrooms (chopped)\n1 tsp salt\n1 tsp pepper\n1 tsp sugar\n1/4 cup water\n1 tbsp flour");
        directionsList.add("1. Soak vermicelli noodles in hot tap water and mushrooms in 40 second microwaved hot tap water until soft for 30 minutes.\n" +
                "\n2. Shred or finely chop onion and squeeze excess moisture out by hand. Add 1/2 tsp salt to jícama, microwave until slightly soft and squeeze excess moisture out by hand.\n" +
                "\n3. When soft, roughly chop vermicelli noodles and mushrooms.\n" +
                "\n4. Add vermicelli, mushrooms, onion, salt, pepper, and sugar into a large mixing bowl and mix thoroughly. Add pork and mix well. Add jícama last and mix well.\n" +
                "\n5. Mix water and flour together to make egg roll sealer, and microwave until just boiling. Wrap the egg rolls.\n" +
                "\n6. Fry at 325°F until golden brown and fully cooked inside (about 12-16 per batch).");

        ingredientLists.add("1 piece fried tofu\n1 bunch of small-strand Chinese vermicelli\n1 small carrot\n2 oyster mushrooms\n2 pieces wood ear mushroom\n100 vegetarian sausage\n1 tbsp coconut water\n1 tsp soy sauce\nRice wrapping paper for spring rolls\nRegular-strand Chinese vermicelli\nLettuce\nFresh mint and other leafy herbs\nCrispy fried shallots\nGarlic\nCrushed roasted peanuts\nPowdered grilled rice\nPepper\nA little bit of cornstarch");
        directionsList.add("1. Soak the wood ear mushrooms for 30 minutes. Thinly slice the tofu, vermicelli, vegetarian sausage, and carrot. Take the wood ear mushrooms out of water and thinly slice them. Wash the oyster mushrooms and thinly slice them.\n" +
                "\n2. Set a pan on heat, add cooking oil and crisply fried shallots for aroma. Add all of the sliced ingredients in to the pan and stir-fry. Add salt and pepper to taste. Let the stir-fry cool, and then mix in some powdered grill rice.\n" +
                "\n3. Soften a sheet of rice paper with water and set on a plate. Add some lettuce, herbs, and stir-fry. Wrap everything together. Repeat until all of the ingredients are used.\n" +
                "\n4. In the pan, mix the remaining oil and shallots with soy sauce, coconut water, and water on heat to make a dipping sauce for the rolls. Before turning off the heat, add cornstarch so the dipping sauce has more texture.\n" +
                "\n5. Serve the rolls with dipping sauce on the side. Add crushed roasted peanuts to the dipping sauce if desired.");

        ingredientLists.add("2 cups rice\n10 cups water\n2 bone-in chicken breasts with skin removed\nSalt and pepper\n1 inch finely julienned ginger\n3 finely sliced green onions\nSoy sauce");
        directionsList.add("1. In a large pot, rinse rice until the water runs clear, and drain.\n" +
                "\n2. Add water to the rice and set it on the stove to boil. When water boils, remove the lid and add in the chicken breasts. Immediately when the water boils again, add in salt and pepper and reduce heat to simmer for about 30 minutes. If the porridge gets too thick at any point, stir in 1/2 cup of water.\n" +
                "\n3. Remove chicken breasts from the pot with tongs. Shred the chicken breasts and return the boneless chicken into the pot.\n" +
                "\n4. Add ginger to the porridge. Turn off heat.\n" +
                "\n5. Serve immediately with a sprinkling of green onions, pepper, and soy sauce.");

        ingredientLists.add("For the plain dough:\n" +
                "\n2 1/3 cup flour\n" +
                "1/2 cup water\n" +
                "1 1/3 cup powdered sugar\n" +
                "1/3 cup butter\n" +
                "\nFor the colored dough:\n" +
                "\n2 cup flour\n" +
                "9 1/2 tbsp shortening\n" +
                "Food coloring (any color)\n" +
                "\nFor the filling:\n" +
                "\n1 pound peeled and split mung beans\n" +
                "1 1/2 cup sugar\n" +
                "1 cup cooking oil\n" +
                "2/3 cup glutinous rice flour");
        directionsList.add("To make the filling:\n" +
                "\n1. Soak the mung beans in water for 4 hours or overnight.\n" +
                "\n2. Take the mung beans out of water and pour into a pot. Add water until it is one finger-section deep from the surface of the water to the beans' surface. Cook until the beans are mushy.\n" +
                "\n3. Add the beans and sugar into a blender and puree until absolutely smooth.\n" +
                "\n4. Pour the still-warm mixture into a nonstick pan. Stir to let the sugar in the mixture melt." +
                "\n5. Turn on the heat to low and keep stirring to help the sugar melt more. When the mixture is runny but still thick, begin to occasionally add in oil by the tablespoon.\n" +
                "\n6. When the mixture is very thick and no longer runny, add in the glutinous rice flour. Turn off the heat 5 minutes later. Now we have our filling, which we will set aside for later in order to prepare the batter.\n" +
                "\n\n To make the plain dough:\n" +
                "\n1. Put powdered sugar and butter into a mixer and mix well. Slowly add in flour. Then add in water. When everything has blended together, take it out of the mixer.\n" +
                "\n2. Knead the dough until the batter is smooth, and divide the dough into half-palm-sized balls. Cover the balls with plastic wrap and let it sit for 30 minutes.\n" +
                "\n\n To make the colored dough:\n" +
                "\n1. Mix flour, shortening, and food coloring together in a bowl. Mix until you reached the desired texture. Cover the dough with plastic wrap and let it rest for 30 minutes.\n" +
                "\n\n To make a moon cake:\n" +
                "\n1. Form a ball with the colored dough that is the same size as the plain balls, and use up all of the dough.\n" +
                "\n2. Form smaller balls using the filling.\n" +
                "\n3. Flatten a plain dough ball (not too thin!) and use it to wrap around a colored ball. Then roll this new ball flat. The color should be distributed across the dough in patches.\n" +
                "\n4. Roll the dough gently into a tube shape. Then roll the tube flat again length-wise.\n" +
                "\n5. Roll the dough into a bulky tube. Cut the tube in half.\n" +
                "\n6. Take a half of the dough tube and roll it flat. There should be a spiral in the middle. Place a filling ball in the middle and wrap the dough around it. Repeat for the rest.\n" +
                "\n7. Cook the moon cakes in the oven at 350°F for 30 minutes. When you take them out, you should see the \"thousand layers\".");

        ingredientLists.add("For the filling:\n" +
                "\n3.5 oz mung beans" +
                "\n1/8 tsp salt" +
                "\n1 tsp olive oil" +
                "\n1/3 cup coconut milk" +
                "\n3 tbsp sugar\n" +
                "\n\nFor the \"skin\":\n" +
                "\n7 oz glutinous rice flour" +
                "\n1/8 tsp salt" +
                "\n5/6 cup lukewarm water\n" +
                "\n\nFor the ginger syrup:\n" +
                "\n1 inch fresh ginger, peeled and thinly sliced" +
                "\n3 cups water" +
                "\n1 cup brown sugar\n");
        directionsList.add("To make the filling:\n" +
                "\n1. Soak the mung beans for 4 hours or overnight.\n" +
                "\n2. Wash and drain the mung beans. Mix in salt well. Steam the beans for about 15 minutes.\n" +
                "\n3. Mash or process mung beans finely in a food processor. In a pan over medium heat, add olive oil and mung bean mash in. Add sugar and coconut milk. Mix well to combine into a mixture which you can squeeze and form balls easily.\n" +
                "\n4. Use a little over 1/2 tablespoon of filling to make a tight ball of filling. Repeat until the filling is all used up and set the balls aside.\n" +
                "\n\n To make the skin:\n" +
                "\n1. In a mixing bowl, add glutinous rice flour and salt. Mix well. Add lukewarm water and mix to combine before kneading the mixture into a smooth dough.\n" +
                "\n2. Divide the dough into as many number of filling balls there are. The balls should be slightly bigger than the filling balls. Cover any unused dough with plastic wrap to avoid it from drying.\n" +
                "\n\n To make the rice balls:\n" +
                "\n1. Flatten the ball of dough with your hand into a circle 2 to 3 inches in diameter. Place a filling ball in the center and wrap the dough tightly around the filling. Pinch the top to seal the filling inside. Roll the finished ball gently to form a round shape.\n" +
                "\n2. Bring a large pot of water to boil, and then lower the heat to medium. Add the rice balls. When they float to the surface, wait for another minute before moving them into an ice bath.\n" +
                "\n\n To make the ginger syrup:\n" +
                "\n1. In a pot, add all of the syrup ingredients.  Bring to a boil and then lower the heat and simmer until the sugar is dissolved and the water smells like ginger.\n" +
                "\n\n Putting it all together:\n" +
                "\n1. Remove the rice balls from the ice bath and add them to the ginger syrup pot. Simmer for 5-7 minutes.\n" +
                "\n2. Transfer the rice balls into serving bowls and ladle some ginger syrup into each bowl. Garnish with ginger if desired.");

        ingredientLists.add("1 lb frozen grated cassava, thawed" +
                "\n1/2 cup mashed mung bean" +
                "\n3/4 cup sugar" +
                "\n3 tbsp tapioca starch" +
                "\n1 cup coconut milk" +
                "\n1/2 tsp vanilla extract" +
                "\n1/2 tsp vegetable oil" +
                "\n1/2 tsp melted butter");
        directionsList.add("1. Preheat the oven to 375°F.\n" +
                "\n2. Transfer the thawed cassava into a colander and allow to drain for 15 minutes.\n" +
                "\n3. In a large bowl, add the drained cassava, mashed mung bean, sugar, tapioca starch, coconut milk, and vanilla extract. Mix well, making sure that the batter is lump-free.\n" +
                "\n4. Coat a 9-inch round pan evenly with vegetable oil.\n" +
                "\n5. Pour the batter into the baking pan. Jiggle the pan gently and tap  on the counter a few times to settle the batter.\n" +
                "\n6. Bake for 40 minutes.\n" +
                "\n7. Check to see if the cake is done by inserting a toothpick, which should come out clean.\n" +
                "\n8. Brush the top of the cake with melted butter.\n" +
                "\n9. Bake on 425°F for 5-7 minutes or until the cake is golden on top. Remove from the oven and let it cool for an hour.\n" +
                "\n10. Run a spatula around the cake to loosen it from the pan. Remove the cake from the pan using a large spatula.\n" +
                "\n11. To serve, cut into small wedges or bite-sized pieces.");
        if (newBundleData.equals("Cà Phê Sữa Đá")) {
            i = 0;
        } else if (newBundleData.equals("Nước Sâm")) {
            i = 1;
        } else if (newBundleData.equals("Sinh Tố Bơ")) {
            i = 2;
        } else if (newBundleData.equals("Chả Giò")) {
            i = 3;
        } else if (newBundleData.equals("Bì Cuốn Chay")) {
            i = 4;
        } else if (newBundleData.equals("Cháo Gà")) {
            i = 5;
        } else if (newBundleData.equals("Bánh Trung Thu Ngàn Lớp")) {
            i = 6;
        } else if (newBundleData.equals("Chè Troi Nước")) {
            i = 7;
        } else {
            i = 8;
        }

        photo = (ImageView) findViewById(R.id.recipephoto);
        photo.setImageResource(myImageList[i]);

        name = (TextView) findViewById(R.id.recipename);
        name.setText(newBundleData);

        ingredients = (TextView) findViewById(R.id.ingredientslist);
        ingredients.setText(ingredientLists.get(i));

        directions = (TextView) findViewById((R.id.stepslist));
        directions.setText(directionsList.get(i));

    }
}