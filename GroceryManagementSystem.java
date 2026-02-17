package CS3354_assignment1_18;

public class GroceryManagementSystem {
/**
 * Print the inventory of the grocery store, showing only non-empty items.
 * slots that aren't empty (e.g., if (names[i] != null)).
 * 
 * @param names An string array of items name in the inventory.
 * @param prices An doublearray of items price in the inventary.
 * @param stocks An integer array of items stocks in the inventory.
 */
public static void printInventory(String[] names, double[] prices, int[] Stocks){
    System.out.println("-----Inventory ------");
    for(int i=0; i<names.length; i++){
        if(names[i]!=null){
            System.out.println("Items: "+names[i]+" | Price: $"+prices[i]+" | Stocks: "+Stocks[i]);            
        }
    }
}

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
