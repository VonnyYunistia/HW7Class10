package HW7;

import java.util.ArrayList;

public class GroceryList {
    public static void main(String[] args) {

        /*Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops
         */

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> veggie= new ArrayList<>();

        veggie.add("yu Choy");
        veggie.add("Cabbage");
        veggie.add("Lettuce");

        ArrayList<String> fruits= new ArrayList<>();

        fruits.add("watermelon");
        fruits.add("oranges");
        fruits.add("grapes");


        ArrayList<String> dairy= new ArrayList<>();

        dairy.add("yoghurt");
        dairy.add("milk");
        dairy.add("cheese");


        ArrayList<String> sweets= new ArrayList<>();

        sweets.add("candy bar");
        sweets.add("Chocolate");
        sweets.add("cookies");

        groceryList.add(veggie);
        groceryList.add(fruits);
        groceryList.add(dairy);
        groceryList.add(sweets);


        System.out.println(groceryList);






    }
}
