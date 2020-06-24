import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int indexI;
        int indexJ;

        int[][] twoDimArray = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        indexI = scanner.nextInt();
        indexJ = scanner.nextInt();

        if (cols > 1) {

            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < cols; j++) {

                    if (j == indexJ) {
                        System.out.print(twoDimArray[i][indexI] + " ");
                    } else if (j == indexI) {
                        System.out.print(twoDimArray[i][indexJ] + " ");
                    } else {
                        System.out.print(twoDimArray[i][j] + " ");
                    }
                }
                System.out.println(" ");
            }

        } else {
            for (int i = 0; i < rows; i++) {
                System.out.println(twoDimArray[i][0]);
            }
        }

    }
}
