import java.util.ArrayList;

/**
 * Created by michaelplott on 9/14/16.
 */
public class Player extends Character {
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();

    Player () {
        this.health = 20;
        this.damage = 20;
    }

    void chooseName() {
        System.out.println("What is your name?");
        name = Game.customLine();
        System.out.printf("Welcome, %s\n",  name);
    }

    void chooseWeapon() {
        System.out.println("Do you want a sword or mace?");
        weapon = Game.customLine();
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
        location = Game.customLine();

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
        System.out.printf("You found a %s! Press y to pick up.\n", item);
        String answer = Game.customLine();
        if(answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.println("You picked " + item + " up!");
           // System.out.printf("you picked %s up!\n", item);
        }
    }
}
