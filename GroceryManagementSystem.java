package GroceryManagementSystem;

import java.util.Scanner;

public class GroceryManagementSystem {
    /**
     * Print inventory entries for non-empty slots.
     *
     * @param names item names
     * @param prices item prices
     * @param stocks item stock counts
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        System.out.println("----- Inventory -----");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println("Item: " + names[i] + " | Price: $" + prices[i] + " | Stock: " + stocks[i]);
            } else {
                // Empty slot: do not print.
            }
        }
    }

    /**
     * Restock a target item by the requested amount.
     *
     * @param names item names
     * @param stocks item stock counts
     * @param target item to restock
     * @param amount amount to add
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        boolean foundItem = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                foundItem = true;
                System.out.println("Restocked " + names[i] + ". New stock: " + stocks[i]);
                break;
            }
        }
        if (!foundItem) {
            System.out.println("Item not found.");
        }
    }

    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Apple";
        itemPrices[0] = 0.99;
        itemStocks[0] = 10;
        itemNames[1] = "Milk";
        itemPrices[1] = 3.49;
        itemStocks[1] = 6;
        itemNames[2] = "Bread";
        itemPrices[2] = 2.99;
        itemStocks[2] = 8;

        Scanner keyboardScanner = new Scanner(System.in);
        int input = 0;
        String item;
        int amount;

        while (input != 3) {
            System.out.println("1 for View inventory");
            System.out.println("2 for Restock item");
            System.out.println("3 to Exit");
            System.out.println("Enter command:");
            input = keyboardScanner.nextInt();
            keyboardScanner.nextLine();

            switch (input) {
                case 1: {
                    printInventory(itemNames, itemPrices, itemStocks);
                    break;
                }
                case 2: {
                    System.out.println("What is target item?");
                    item = keyboardScanner.nextLine();
                    System.out.println("What is the amount being restocked?");
                    amount = keyboardScanner.nextInt();
                    keyboardScanner.nextLine();
                    restockItem(itemNames, itemStocks, item, amount);
                    break;
                }
                case 3: {
                    System.out.println("Quitting program");
                    break;
                }
                default: {
                    System.out.println("Invalid command");
                    break;
                }
            }
        }

        keyboardScanner.close();
    }
}
