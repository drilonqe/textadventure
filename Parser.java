import java.util.Scanner;

public class Parser {
    public Scanner input;

    public Parser() {
        input = new Scanner(System.in);
    }

    public String action() {
        System.out.print("Your move: ");
        return input.nextLine().trim().toLowerCase();
    }

    public String target(String action) {
        switch (action) {
            case "go":
                System.out.println("Where do you want to go ? ");
                break;
            case "pickup":
                System.out.println("What do you want to pick up ?");
                break;
            case "attack":
                System.out.println("Who do you want to attack ? ");
                break;
            case "use":
                System.out.println("What do you want to use ?");
                break;
            default:
                return null; // No target needed

        }
        return input.nextLine().trim().toLowerCase();
    }

}
