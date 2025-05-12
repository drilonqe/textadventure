public class OutsideRoom implements Room {
    private Room cowles;
    private Room hallway;

    // no constructor needed since we are using setCowles and setHallway

    public void setCowles(Room cowles) {
        this.cowles = cowles;
    }

    public void setHallway(Room hallway) {
        this.hallway = hallway;
    }

    @Override
    public void roomEntry() {
        System.out.println("You step outside Norris Hall, where a dark feeling captures you.");
        System.out.println("The sky is gray and campus looks too empty.");
        System.out.println("You hear zombies growling so you quickly look for your next place to go");
        System.out.println("Cowles Hall's door is broken so you can enter there.");
    }

    @Override
    public void waitTurn() {
        System.out.println("The wind howls around you.");
    }

    @Override
    public Room go(String direction) {
        if (direction.equals("hallway")) {
            System.out.println("You re-enter Norris Hall.");
            return hallway;
        } else if (direction.equals("cowles")) {
            System.out.println("You go through the broken passage to enter Cowles Hall.");
            return cowles;
        } else {
            System.out.println("That way seems to be blocked. Try going to 'hallway' or to 'cowles'");
            return this;
        }
    }

    @Override
    public void speak() {
        System.out.println("Your voice gets lost in the howl of the wind.");
    }

    @Override
    public void pickup(String item) {
        System.out.println("There's nothing here.");
    }

    @Override
    public void use(String item) {
        System.out.println("There's nothing to use.");
    }

    @Override
    public void attack(String target) {
        System.out.println("There's nothing to fight.");
    }

    @Override
    public void lookaround() {
        System.out.println("Dark skies. One exit back to Norris. One broken door to enter Cowles.");
    }
}
