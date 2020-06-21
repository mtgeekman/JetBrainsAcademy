import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elements = scanner.nextInt();
        int[] numbers = new int[elements];

        boolean nextTo = true;

        for (int i = 0; i < elements; i++) {
            numbers[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();


        for (int i = 0; i < numbers.length; i++) {
            if (i + 2 > numbers.length) {
                break;
            }

            if (numbers[i] == n && numbers[i + 1] == m || numbers[i] == m && numbers[i + 1] == n) {
                nextTo = false;
            }
        }
        System.out.println(nextTo);
    }
}