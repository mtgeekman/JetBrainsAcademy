import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean sym = true;
        for (int i = 0; i < size; i++) {
            if (sym) {
                for (int j = 0; j < size; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        System.out.println("NO");
                        sym = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }

        if (sym) {
            System.out.println("YES");
        }



    }
}