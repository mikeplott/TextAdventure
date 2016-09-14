import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by michaelplott on 9/14/16.
 */
public class Game {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        //intro message
        System.out.println("Welcome, traveller!");

        boolean keepRunning = true;

        while (keepRunning) {
            //creating new player object
            Player player = new Player();
            //player chooses name, weapon and location
            player.chooseName();
            player.chooseWeapon();
            player.chooseLocation();

            System.out.println("You win!");
            System.out.println("Would you like to play again? Type y or n");

            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                keepRunning = false;
            }
        }

        System.out.println("Game over.");

    }
}
