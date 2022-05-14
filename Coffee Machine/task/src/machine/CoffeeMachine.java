package machine;

import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {
    private static int countWater = 400;
    private static int countMilk = 540;
    private static int countCoffee = 120;
    private static int countCups = 9;
    private static int countMoney = 550;

    public static void main(String[] args) {

        do {
            executeOperation();
        } while (true);
    }

    private static void executeOperation() {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        doChoice();
    }

    private static void doChoice() {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        switch (Objects.requireNonNull(Action.findByValue(operation))) {
            case BUY:
                buyCoffee();
                break;
            case FILL:
                fillMachine();
                break;
            case TAKE:
                takeAction();
                break;
            case REMAINING:
                informationAboutCount();
                break;
            case EXIT:
                exit();
                break;
            default:
                System.out.println("error!");
        }
    }

    private static void takeAction() {
        System.out.println("I gave you " + countMoney);
        countMoney = 0;
    }

    private static void fillMachine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        int addWater = scanner.nextInt();
        countWater += addWater;
        System.out.println("Write how many ml of milk you want to add: ");
        int addMilk = scanner.nextInt();
        countMilk += addMilk;
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int addCoffee = scanner.nextInt();
        countCoffee += addCoffee;
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int addCups = scanner.nextInt();
        countCups += addCups;
    }

    private static void buyCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        String choice = scanner.next();
        switch(Objects.requireNonNull(ChoiceCoffee.findByValue(choice))) {
            case ESPRESSO: {
                makeCoffee(ChoiceCoffee.ESPRESSO);
                break;
            }
            case LATTE: {
                makeCoffee(ChoiceCoffee.LATTE);
                break;
            }
            case CAPPUCCINO: {
                makeCoffee(ChoiceCoffee.CAPPUCCINO);
                break;
            }
            case NO_COFFEE: {
                executeOperation();
                break;
            }
            default: System.out.println("error!");
        }
    }

    private static void exit() {
        System.exit(0);
    }

    private static void makeCoffee(ChoiceCoffee coffeeType) {
        String information = "";
        if (countWater < coffeeType.water) {
            information += "water";
        }
        if (countMilk < coffeeType.milk) {
            information = information.isEmpty()?"milk": ", milk";
        }
        if (countCoffee < coffeeType.beans) {
            information = information.isEmpty()?"coffee": ", coffee";
        }
        if (countCups < 1) {
            information = information.isEmpty()?"cup": ", cup";
        }
        if (information.isEmpty()) {
            countWater -= coffeeType.water;
            countMilk -= coffeeType.milk;
            countCoffee -= coffeeType.beans;
            countCups--;
            countMoney += coffeeType.money;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            System.out.println("Sorry, not enough " + information + "!");
        }
    }

    private static void informationAboutCount() {
        System.out.println("The coffee machine has:");
        System.out.println(countWater + " ml of water");
        System.out.println(countMilk + " ml of milk");
        System.out.println(countCoffee + " g of coffee beans");
        System.out.println(countCups + " disposable cups");
        System.out.println(countMoney + " of money");
    }
}

