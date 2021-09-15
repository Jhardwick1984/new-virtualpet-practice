package virtual_pet;

public class VirtualPet {
    private String name;
    private String description;
    public int hunger;
    public int thirst;
    public int boredom;
    private boolean isAlive;

    public VirtualPet(String name, String description) {
        this.name = "Draco";
        this.description = "Not Malfoy.";
        hunger = 50;
        thirst = 50;
        boredom = 50;
        isAlive = true;
    }

    public void greeting() {
        System.out.println("Welcome to the Dragon Shelter!  Here's some instructions for you: ");
    }

    public static void giveFood() {
        if(hunger >= 100) {
            hunger = 100;
            System.out.println("My belly is full, choose another action!");
            System.out.println("");
        } else {
            hunger += 15;
            thirst -= 5;
            boredom += 10;
            tick();
            System.out.println("Om nom, thanks for the food! My hunger is now at " + (hunger+25));
        }
    }

    public static void giveWater() {
        if(thirst >= 100) {
            thirst = 100;
            System.out.println("I'm not thirsty!  Do something else!");
            System.out.println("");
        } else {
            hunger -= 5;
            thirst += 15;
            boredom += 5;
            tick();
            System.out.println("Thanks for the drink!");
            System.out.println("");
        }
    }

    public static void playWith() {
        if(boredom >= 100) {
            boredom = 100;
            System.out.println("I'm entertained enough!  Do something else!");
            System.out.println("");
        } else {
            hunger -= 5;
            thirst -= 5;
            boredom += 15;
            tick();
            System.out.println("Now that was fun!");
            System.out.println("");
        }
    }

    public static void doNothing() {
        tick();
    }

    public void tick() {
        hunger -= 5;
        thirst -= 5;
        boredom -= 5;
        showHealth();
    }

    public void showHealth() {
        System.out.printf("hunger: %s thirst: %s boredom: %s%n", hunger, thirst, boredom);
        System.out.println("");
        if(hunger <= 0 || thirst <= 0 || boredom <=0){
            isAlive = false;
        }
    }

    public void exit() {
        System.out.println("You're leaving?  Very well.");
        System.out.println("");
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }
}
