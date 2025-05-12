public class Player {
    public int health;
    public Inventory inventory;

    public Player() {
        this.health = 10;
        this.inventory = new Inventory();
    }

     public int getHealth() {
        return health;
    }

    public void damage(int inflictedDamage) {
        if (health <= 0) {
            System.out.println("You die in your nightmare and forever succumb to darkness");
            System.exit(0);
        } else {
            health -= inflictedDamage;
             System.out.println("You have received " + inflictedDamage + " damage.");
             System.out.println("Your health is now " + getHealth() + "/ 10. Be careful to not go to 0.");
        }
    }

    public void heal(int healPoints) {
        health += healPoints;
        System.out.println("Your health points have recovered by" + healPoints + ".");
        System.out.println("You now have" + getHealth() + " health points.");
    }

    public Inventory getInventory() {
        return inventory;
    }

}
