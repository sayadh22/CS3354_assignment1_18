package GroceryManagementSystem;

import java.util.Scanner;
public class GroceryManagementSystem {
    //Fucntions: 
    
    // public static void restockItem(String[] names, int[] stocks, String target, int amount);
    // adds x amount into inventory list for y item

    // public static void printInventory(String[] names, double[] prices, int[] stocks);
    // prints the list of items in inventroy

    public static void main(String[] args) {
        // In the main method, use a Scanner and a while(true) loop to create a menu.
        // Integration: Call the methods written in the previous two tasks above based on the user's 
        // input (1 for View, 2 for Restock, 3 to Exit)  

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        Scanner keyboardScanner = new Scanner(System.in);
        int input; 
        String item;
        int amount; 
        while(input != 3){
            System.out.println("1 for View inventroy");
            System.out.println("2 for Restock item");
            System.out.println("3 to Exit");
            System.out.println("Enter command:");
            input = keyboardScanner.nextInt();
            switch (input){
                case 1:{
                    printInventory(itemNames, itemPrices, itemStocks);
                    break;
                }
                case 2:{
                    System.out.println("What is target item?");
                    item = keyboardScanner.nextLine();
                    System.out.println("What is the amount being restocked?");
                    amount = keyboardScanner.nextInt();
                    restockItem(itemNames, itemStocks, item, amount);
                    break;
                }
                case 3:{
                    System.out.println("Quitting program");
                    break;
                }
            }
        }    
        
    }

}
