package HW7;

public class cars {

    public static void main(String[] args) {


  /*Create an array of cars and store 6 elements into it.
  Using 2 different loops print all values from the array.
   */

String[] cars= new String[6];

cars[0]="Subaru";
cars[1]="Toyota";
cars[2]="Honda";
cars[3]="Hyundai";
cars[4]="BMW";
cars[5]="Tesla";

        for (int i = 0; i < cars.length; i++) {

            System.out.print(cars[i]+" ");

        }

        System.out.println();

        String[] cars1= {"Subaru","Toyota","Honda","Hyundai","BMW","Tesla"};

        for (String s : cars1) {
            System.out.print(s +" ");

        }



    }
}
