package HW7;

public class task2 {
    public static void main(String[] args) {

        /*Create 2D array of cars : american, german, korean, italian.
        Then retrieve all values from that array using 2 different loops
         */

        String[][] cars= new String[2][2];

        cars[0][0] = "american";
        cars[0][1] = "german";
        cars[1][0] = "korean";
        cars[1][1] = "italian";

        for (int i = 0; i < cars.length; i++) {

            System.out.println();

            for (int j = 0; j < cars[i].length; j++)

                System.out.print(cars[i][j]+" ");


        }


        System.out.println();



        String[][] cars1= {
                {"american","german"},
                {"korean", "italian"}

        };

        for (int i = 0; i < cars1.length; i++) {

            System.out.println();

            for (int j = 0; j < cars1.length; j++)

                System.out.print(cars[i][j]+" ");




        }




    }
}
