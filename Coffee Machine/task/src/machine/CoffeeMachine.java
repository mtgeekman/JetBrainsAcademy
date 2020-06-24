package machine;

import java.util.*;

public class CoffeeMachine {
    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static int money = 550;

    enum Menu {
        espresso(250, 0, 16, 4),
        latte(350, 75, 20, 7),
        cappuccino(200, 100, 12, 6);

        int water;
        int milk;
        int beans;
        int cost;

        Menu(int water, int milk, int beans, int cost){
            this.water = water;
            this.milk = milk;
            this.beans = beans;
            this.cost = cost;
        }
        int getWater() {return this.water;}
        int getMilk() {return this.milk;}
        int getBeans() {return this.beans;}
        int getCost() {return this.cost;}
    }


    public static void printInventory() {
        System.out.println(" \nThe coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        if (money > 0) {
            System.out.println("$" + money + " of money");
        } else {
            System.out.println(money + " of money");
        }
    }

    public static boolean checkSupplies(int nWater, int nMilk, int nBeans) {
        // check water
        if (water - nWater < 0) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        if (milk - nMilk < 0) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        if (beans - nBeans < 0) {
            System.out.println("Sorry, not enough beans!");
            return false;
        }

        System.out.println("I have enough resources, making you a coffee!");
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean looping = true;
        while (looping) {
            System.out.println(" \nWrite action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();
            //System.out.println("Action = " + action);
            switch (action) {
                case "buy":
                    System.out.println(" \nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String type = scanner.next();

                    switch (type) {
                        case "1":
                            if (checkSupplies(Menu.espresso.getWater(), Menu.espresso.getMilk(), Menu.espresso.getBeans())) {
                                water -= Menu.espresso.getWater();
                                milk  -= Menu.espresso.getMilk();
                                beans -= Menu.espresso.getBeans();
                                money += Menu.espresso.getCost();
                                cups -= 1;
                            }
                            break;
                        case "2":
                            if (checkSupplies(Menu.latte.getWater(), Menu.latte.getMilk(), Menu.latte.getBeans())) {
                                water -= Menu.latte.getWater();
                                milk  -= Menu.latte.getMilk();
                                beans -= Menu.latte.getBeans();
                                money += Menu.latte.getCost();
                                cups -= 1;
                            }
                            break;
                        case "3":
                            if (checkSupplies(Menu.cappuccino.getWater(), Menu.cappuccino.getMilk(), Menu.cappuccino.getBeans())) {
                                water -= Menu.cappuccino.getWater();
                                milk  -= Menu.cappuccino.getMilk();
                                beans -= Menu.cappuccino.getBeans();
                                money += Menu.cappuccino.getCost();
                                cups -= 1;
                            }
                            break;

                        default:
                            break;
                    }

                    break;
                case "fill":
                    System.out.println(" \nWrite how many ml of water do you want to add: ");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    cups += scanner.nextInt();
                    break;
                case "take":
                    System.out.println(" \nI gave you $" + money);
                    money -= money;
                    break;
                case "remaining":
                    printInventory();
                    break;
                case "exit":
                    looping = false;
                    break;

                    //System.out.println("unknown action: " + action);
            }
        }



        /*
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
        }*/
    }


}
