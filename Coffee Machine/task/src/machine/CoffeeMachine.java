package machine;

import java.util.*;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededWater = 200;
        int neededMilk = 50;
        int neededBeans = 15;

        int canMake = 0;
        int cups;

        int water;
        int milk;
        int beans;

        System.out.println("Write how many ml of water the coffee machine has:");
        water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        cups = scanner.nextInt();

        canMake = water/neededWater < milk/neededMilk ? (Math.min(water / neededWater, beans / neededBeans)) : (Math.min(milk / neededMilk, beans / neededBeans));

        if (cups == canMake) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cups > canMake) {
            System.out.println("No, I can make only " + canMake + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (canMake - cups) + " more than that)");
        }
    }
}
