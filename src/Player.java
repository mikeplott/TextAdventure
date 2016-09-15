import java.util.ArrayList;

/**
 * Created by michaelplott on 9/14/16.
 */
public class Player {
    String name;
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();

    void chooseName() {
        System.out.println("What is your name?");
        name = Game.scanner.nextLine();
        System.out.println("Welcome, " + name);
    }

    void chooseWeapon() {
        System.out.println("Do you want a sword or mace?");
        weapon = Game.scanner.nextLine();
        if (weapon.equalsIgnoreCase("sword")) {
            System.out.println("Here's your sword!");
        }
        else if(weapon.equalsIgnoreCase("mace")) {
            System.out.println("Here's your mace!");
        }
        else {
           // throw new Exception("Invalid weapon.");
            System.out.println("Weapon not recognized.");
            chooseWeapon();
        }
    }

    void chooseLocation() {
        System.out.println("Would you like to go to the tunnel or forest?");
        location = Game.scanner.nextLine();

        if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        }
        else if (location.equalsIgnoreCase("forest")){
            System.out.println("Entering forest...");
        }
        else {
            //throw new Exception("Invalid location");
            System.out.println("Location not recognized.");
            chooseLocation();
        }
    }

    void findItem(String item) {
        System.out.println("You found a " + item + "! Press y to pick up.");
        String answer = Game.scanner.nextLine();
        if(answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.println("You picked " + item + " up!");
        }
    }

}
