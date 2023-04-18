package HW7;

public class task6 {

    public static void main(String[] args) {

        String[][] countries = {
                {"GeorgiaState", "FloridaState", "TexasState", "NewYorkState" },
                {"Mexico", "Peru", "Guatemala", "Cuba" },
                {"German", "French", "Italy", "Sweden" },
                {"Indonesia", "Singapore", "Malaysia", "Japan" },
                {"Morocco", "Egypt", "Zambia", "Kenya" }
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries.length - 1; j++) {

                System.out.print(countries[i][j] + " ");
            }
        }

        System.out.println();

        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s + " ");
            }

        }

        System.out.println();

int sum=0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {

                sum++;
            }

            }   System.out.print(sum);








    }
}









