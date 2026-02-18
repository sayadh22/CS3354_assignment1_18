package CS3354_assignment1_18;

/**
 * Utility class for displaying grocery inventory information.
 */
public class GroceryManagementSystem {

    /**
     * Prints all non-empty inventory entries.
     * <p>
     * Each printed line includes item name, price, and stock quantity.
     * Entries with a {@code null} name are skipped.
     *
     * @param names item names
     * @param prices item prices
     * @param stocks item stock quantities
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        System.out.println("-----Inventory ------");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println("Items: " + names[i] + " | Price: $" + prices[i] + " | Stocks: " + stocks[i]);
            }
        }
    }
}
<<<<<<< HEAD
    /***
     * Restocks an item in the grocery store by iterating through to find the target.
     * If the target is not found then it will print "Item not found."
     *
     * @param names A string array of item names in the inventory.
     * @param stocks An integer array of item stocks in the inventory.
     * @param target A string containing the name of the item to be restocked.
     * @param amount An integer containing the amount that will be restocked.
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount)
    {
        boolean foundItem = false;
        for(int i = 0; i < names.length; i++)
        {
            if(names[index].equals(target))
            {
                stocks[index] += amount;
                foundItem = true;
            }
        }
        if(!foundItem)
        {
            System.out.println("Item not found.");
        }
    }
}
=======
>>>>>>> origin/feature-display
