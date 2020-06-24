import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create and load the input matrix.
        String line = scanner.nextLine();

        String[] splitLine = line.split(" ");
        int width = splitLine.length;

        int[][] inputMatrix = new int[100][width];


        for (int i = 0; i < width; i++) {
            inputMatrix[0][i] = Integer.parseInt(splitLine[i]);
        }

        int lines = 1;
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if ("end".equals(line)) {
                break;
            }
            splitLine = line.split(" ");
            for (int i = 0; i < width; i++) {
                inputMatrix[lines][i] = Integer.parseInt(splitLine[i]);
            }
            lines++;
        }

        int[][] realMatrix = new int[lines][width];
        int[][] outputMatrix = new int[lines][width];

        for (int x = 0; x < lines; x++) {
            System.arraycopy(inputMatrix[x], 0, realMatrix[x], 0, width);
        }
        //for (int[] row : realMatrix) {
        //    System.out.println(Arrays.toString(row));
        //}

        // create the output matrix
        int dirY = 0;
        int dirX = 0;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < width; j++) {
                int up = 0;
                if (i - 1 < 0) {
                    dirY = lines - 1;
                } else {
                    dirY = i - 1;
                }
                up += realMatrix[dirY][j];
                if (i + 1 == lines) {
                    dirY = 0;
                } else {
                    dirY = i + 1;
                }
                int down = realMatrix[dirY][j];;
                if (j - 1 < 0) {
                    dirX = width - 1;
                } else {
                    dirX = j - 1;
                }
                int left = realMatrix[i][dirX];
                if (j + 1 == width) {
                    dirX = 0;
                } else {
                    dirX = j + 1;
                }
                int right = realMatrix[i][dirX];

                //System.out.println(up + "+" + down + "+" + left + "+" + right);
                outputMatrix[i][j] = up + down + left + right;

            }
        }

        for (int[] row : outputMatrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
}