public interface Room {
   public void roomEntry(); // this command describes a room after you enter
   public void waitTurn(); // wait for a turn
   public Room go(String direction); // player moves in a direction
   public void speak(); // player speaks to an object / person
   void pickup(String item); // player picks up something
   void use(String item);  // use object
   void attack(String target); // attack something
   public void lookaround(); // look around
}