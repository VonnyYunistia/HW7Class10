package HW7;

public class Animals {

    public static void main(String[] args) {

    /*  Create an array of animals and store 5 elements into it.
    Using 2 different loops print all elements from the array.
     */


        String[] animals= new String[5];

        animals[0]="Cats";
        animals[1]="Dogs";
        animals[2]="Dolphins";
        animals[3]="Squirrel";
        animals[4]="Racoons";


        for (int i = 0; i < animals.length; i++) {

            System.out.print(animals[i]+" ");

        }

        System.out.println();

        String[] animals1= {"Cats","Dogs","Dolphins","Squirrel","Racoons"};

        for (String s : animals1) {
            System.out.print(s +" ");

        }





    }
}
