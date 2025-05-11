import java.util.ArrayList;

public class Inventory {
    public ArrayList<String> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        item = item.toLowerCase();
        if(!items.contains(item)) {
            items.add(item);
            System.out.println(item + " was added to your inventory.");
        } else {
             System.out.println(item + " is already in your inventory.");
        }
    }

    /**
     * Check if inventory contains a specific item
     * @param item
     * @return
     */
    public boolean hasItem(String item) {
        item = item.toLowerCase();
        return items.contains(item);
    }

    public void printInventory() {
        if (items.isEmpty()) {
            System.err.println("You have nothing in your inventory");
        } else {
              System.out.println("In your inventory you have:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println(items.get(i) + ", ");
            }
        }
        
    }
}
