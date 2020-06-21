import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elements = scanner.nextInt();
        int[] numbers = new int[elements];

        int tripleCount = 0;

        for (int i = 0; i < elements; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int n = 0; n < numbers.length; n++) {
            //if (n + 4 < numbers.length) {
            //System.out.println(n + " - " + numbers[n]);
            //System.out.println(numbers[n + 1] + " + " + (numbers[n] + 1));
            //System.out.println(numbers[n + 2] + " + " + (numbers[n] + 2));

            if (n + 3 > numbers.length) {
                break;
            }

            if (numbers[n + 1] == numbers[n] + 1 && numbers[n + 2] == numbers[n] + 2) {
                tripleCount++;
            }
            //System.out.println("trip: " + tripleCount);


            //}
        }

        System.out.println(tripleCount);
    }
}