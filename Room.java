public interface Room {
   public void roomEntry(); // this command describes a room after you enter
   public void waitTurn(); // wait for a turn
   public void go(); // player moves in a direction
   public void speak(); // player speaks to an object / person
   public void pickup(); // player picks up something
   public void use();  // use object
   public void attack(); // attack something
   public void lookat(); // look or watch something
}