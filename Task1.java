package HW7;

public class Task1 {

    public static void main(String[] args) {

        /*Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        Then your program should print name of the students that has A and B grade
         */

       String[][] students = { {"vonny", "Ciwit", "Wawa", "Django"},
                                {"A", "B", "C", "D"}
        };


        for (int i = 0; i < students.length; i++) {

            for (int j = 0; j <=1 ; j++) {

                System.out.print(students[i][j]+" ");


            }

        }

        System.out.println();


        String[][] students1 = new String[2][2];

        students1[0][0]="Vonny";
        students1[0][1]="Vonny";
        students1[1][0]="Vonny";
        students1[1][1]="Vonny";

        for (int i = 0; i < students.length; i++) {

            for (int j = 0; j <=1 ; j++) {

                System.out.print(students[i][j]+" ");


            }

        }








        }

    }

