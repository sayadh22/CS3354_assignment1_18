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
