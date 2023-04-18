package HW7;

public class task4 {

    public static void main(String[] args) {


       /*Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
       Print the sum of all numbers.
        */

        int[][] num= new int[3][3];

        num[0][0]=23;
        num[0][1]=43;
        num[0][2]=25;
        num[1][0]=55;
        num[1][1]=87;
        num[1][2]=66;
        num[2][0]=42;
        num[2][1]=99;
        num[2][2]=12;

        int sum=0;

        for (int[] ints : num) {
            for (int anInt : ints) {
                sum=sum+anInt;

            }

        }

        System.out.println(sum);









    }
}
