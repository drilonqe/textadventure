public class TextAdventure {
    public static void main(String[] args) {

        Parser parser = new Parser();
        Player player = new Player();
        Inventory inventory = player.getInventory();
        // Make rooms
         OutsideRoom outside = new OutsideRoom();

        NorrisHallway hallway = new NorrisHallway(null, outside, inventory);

        Bathroom bathroom = new Bathroom(inventory, player);
        bathroom.setHallway(hallway);          
        hallway.setBathroom(bathroom);

        // Start game
        Room dorm = new NorrisRoom(inventory, hallway);
        Room currentRoom = dorm;
        currentRoom.roomEntry();

        while (true) {
            String action = parser.action();
            String target = parser.target(action);

            switch (action) {
                case "go":
                    Room nextRoom = currentRoom.go(target); // transition to next room.
                    if (nextRoom != null && nextRoom != currentRoom) {
                        currentRoom = nextRoom;
                        currentRoom.roomEntry();
                    }
                    break;
                case "wait":
                    currentRoom.waitTurn();
                    break;
                case "pickup":
                    currentRoom.pickup(target);
                    break;
                case "attack":
                    currentRoom.attack(target);
                    break;
                case "use":
                    currentRoom.use(target);
                    break;
                case "speak":
                    currentRoom.speak();
                    break;
                case "look":
                    currentRoom.lookaround();
                    break;
                case "inventory":
                    inventory.printInventory();
                    break;
                case "quit":
                    System.out.println("You sit down and close your eyes. Maybe this is the end...");
                    return;
                default:
                    System.out.println("That command doesn't work.");
            }

        }
    }
}
