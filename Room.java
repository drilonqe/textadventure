public interface Room {
    void roomEntry(); // this command describes a room after you enter
    void wait(); // wait for a turn
    void go(); // player moves in a direction
    void speak(); // player speaks to an object / person
    void pickup(); // player picks up something
    void use();  // use object
    void attack(); // attack something
    void lookat(); // look or watch something
}