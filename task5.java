package HW7;

public class task5 {

    public static void main(String[] args) {

        int[][] num = {{21, 22, 24, 45},
                {34, 65, 77, 88},
                {44, 67, 97, 56}
        };


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j <= num.length; j++) {
                if (num[i][j] % 2 == 0) {

                    System.out.println(num[i][j]);
                }

            }
        }
    }
}