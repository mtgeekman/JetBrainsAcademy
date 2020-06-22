import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        int check;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        check = scanner.nextInt();

        boolean found = false;
        for (int num : array) {
            if (num == check) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}