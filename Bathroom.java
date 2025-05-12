public class Bathroom implements Room {
    public boolean tookBat;
    public boolean zombieDefeated;
    public Room hallway;
    public Inventory inventory;
    public Player player;
    /**
     * Constructor for Bathroom room that initializes inventory and user input
     */
     public Bathroom(Inventory inventory, Player player) {
        this.inventory = inventory;
        this.player = player;
        this.tookBat = false;
        this.zombieDefeated = false;
    }

    public void setHallway(Room hallway) {
    this.hallway = hallway;
}

    @Override
    public void roomEntry() {
        System.out.println("You enter the bathroom. There is blood on the floor and there is a foul smell.");
        if (!zombieDefeated) {
            System.out.println("A weak-looking zombie comes out a stall door and slowly approaches you" +
            "with killing intent.");
        } else {
            System.out.println("The zombie's body is sitting lifeless by the sink.");
        }
    }

    @Override
    public void waitTurn() {
        System.out.println("You back up against the sink. Nothing moves.");
    }

    @Override
    public Room go(String direction) {
        if (direction.equals("hallway") || direction.equals("back")) {
            System.out.println("You step back out into the hallway.");
            return hallway;
        } else {
            System.out.println("There's nowhere else to go. Try going to 'hallway'.");
            return this;
        }
    }

    @Override
    public void speak() {
        System.out.println("You curse what brought you to this nightmare.");
    }

    @Override
    public void pickup(String item) {
        if (item.equals("bat")) {
            if (!zombieDefeated) {
                System.out.println("You try to grab the bat, but the zombie is still alive!");
                System.out.println("You need to kill it first!");
            } else if (!tookBat) {
                System.out.println("You pick up the metal bat. Finally, something useful.");
                inventory.addItem("bat");
                tookBat = true;
            } else {
                System.out.println("You already took the bat.");
            }
        } else {
            System.out.println("There's no " + item + " here.");
            System.out.println("But there was a metal bat in one of the stalls.");
            if (!zombieDefeated) {
                System.out.println("Kill the zombie first.");
            }
        }
    }

    @Override
    public void use(String item) {
        System.out.println("There's nothing to use here.");
    }

    @Override
    public void attack(String target) {
        if (!zombieDefeated && target.equals("zombie")) {
            System.out.println("You fight the zombie! It comes at you while you give it your best shot.");
            player.damage(2);
            zombieDefeated = true;
            System.out.println("With a strong punch to the face you manage to knock its head clean off.");
        } else if (zombieDefeated) {
            System.out.println("The zombie is already dead.");
        } else {
            System.out.println("There's no " + target + " here.");
        }
    }

    @Override
    public void lookaround() {
        System.out.println("You see dirty,smelly sinks, and blood on the floor.");
        if (!zombieDefeated) {
            System.out.println("A zombie growls by the far stall, blocking a metal bat.");
        } else if (!tookBat) {
            System.out.println("The bat lies near the sink. You should probably grab it.");
        } else {
            System.out.println("The room is empty now. Nothing else useful here.");
        }
    }
}
