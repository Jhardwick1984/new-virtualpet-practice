package virtual_pet;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet draco = new VirtualPet("Draco");

        System.out.println("Welcome to the Dragon Shelter!");
        System.out.println("");
        draco.greeting();
        System.out.println("");

        Scanner userInput = new Scanner(System.in);

        int selection;

        do {
            System.out.println("Press 1 to feed me.");
            System.out.println("Press 2 to give me a drink.");
            System.out.println("Press 3 to play with me.");
            System.out.println("Press 4 to do nothing.");
            System.out.println("Press 5 to exit the shelter.");
            System.out.println("");

            selection = userInput.nextInt();
            switch(selection){
                case 1:
                    draco.giveFood();

                    break;

                case 2:
                    draco.giveWater();

                    break;

                case 3:
                    draco.playWith();

                    break;

                case 4:
                    draco.doNothing();

                    break;
            }
        }

        while(selection < 5 && draco.isAlive());
        draco.exit();

        userInput.close();
        System.exit(0);
    }
}
