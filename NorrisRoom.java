
public class NorrisRoom implements Room {
    public Inventory inventory;
    public Room hallway;

    /**
     * Constructor for Norris room 
     */
    public NorrisRoom(Inventory inventory, Room hallway) {
        this.inventory = inventory;
        this.hallway = hallway;
    }

    @Override
    public void roomEntry() {
        System.out.println("You wake up in your dorm room in Norris Hall.");
        System.out.println("You are wearing the same outfit you wore before heading to bed.");
        System.out.println("The air is dry. It feels like it's too quiet.");
        System.out.println("The hallway is just outside the door.");
    }

    @Override
    public void waitTurn() {
        System.out.println("You sit still, waiting and trying to pick up any sound.");
        System.out.println("Too bad there is nothing but silence there with you...");
    }

    @Override
    public Room go(String direction) {
        if (direction.equals("east")) {
            System.out.println("You reach for the door and step into the hallway.");
            return hallway;
        } else {
            System.out.println("You can't go that way. The only exit is to the east.");
            return this;
        }
    }

    @Override
    public void speak() {
        System.out.println("You mumble to yourself but it feels like your voice echoes in this silence");
    }

    @Override
    public void pickup(String item) {
        System.out.println("There's nothing in here worth taking.");
    }

    @Override
    public void use(String item) {
        System.out.println("There's nothing to use here in your room.");
    }

    @Override
    public void lookaround() {
        System.out.println("You see your laundry on top of your desk (lazy), messy bed sheets and the door.");
    }

    @Override
    public void attack(String target) {
        System.out.println("You punch the " + target + " or maybe you just imagined it.");
    }

}
