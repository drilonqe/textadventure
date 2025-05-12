public class NorrisHallway implements Room {
    public boolean beenToBathroom;
    public Room bathroom;
    public Room outside;
    public Inventory inventory;

    public NorrisHallway(Room bathroom, Room outside, Inventory inventory) {
        this.bathroom = bathroom;
        this.outside = outside;
        this.inventory = inventory;
        this.beenToBathroom = false;
    }

    public void setBathroom(Room bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void roomEntry() {
        System.out.println("You step in the Norris Hallway. It is awfully quiet...");
        System.out.println("You see the exit to outside is to the East.");
        System.out.println("There is also a bathroom nearby.");
    }

    @Override
    public void waitTurn() {
        System.out.println("You stand still but the silence keeps growing louder.");
    }

    @Override
    public Room go(String direction) {
        if (direction.equals("bathroom")) {
            System.out.println("You open the door and step into the bathroom...");
            beenToBathroom = true;
            return bathroom;
        } else if (direction.equals("east") || direction.equals("outside")) {
            if (!beenToBathroom) {
                System.out.println("You have a feeling that maybe you should check the bathroom first...");
                return this;
            }
            if (!inventory.hasItem("bat")) {
                System.out.println("You approach the exit, but hesitate.");
                System.out.println("You don't feel safe walking outside without something to protect yourself.");
                System.out.println("Maybe there's something useful in the bathroom...");
                return this;
            }
            System.out.println("You grip your bat and push open the door to step outside...");
            return outside;
        } else {
            System.out.println("I do not think that way leads to anywhere. Try going to 'bathroom'" +
                    ", or try 'outside' / 'east'.");
            return this;
        }
    }

    @Override
    public void speak() {
        System.out.println("'Anyone there' you say, but silence is your only responder.");
    }

    @Override
    public void pickup(String item) {
        System.out.println("There's nothing here to pick up."); 
        if (!beenToBathroom) {
             System.out.println("Maybe check the bathroom!!!");
        }
    }

    @Override
    public void use(String item) {
        System.out.println("There's nothing to use here.");
    }

    @Override
    public void attack(String target) {
        System.out.println("You get into your fight stance, but there's nothing to fight yet.");
    }

    @Override
    public void lookaround() {
        System.out.println("You look around. Everything feels blurry and hazy. The air is too quiet." +
        "Bathroom to the west of you. Exit door to the outside is on east.");
    }

}
