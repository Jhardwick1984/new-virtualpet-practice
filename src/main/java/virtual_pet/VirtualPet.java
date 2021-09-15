package virtual_pet;

public class VirtualPet {
    public String name;
    public String description;
    public int hunger;
    public int thirst;
    public int boredom;
    public boolean isAlive;

    public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
        this.name = "Draco";
        this.description = "Not Malfoy.";
        this.hunger = 50;
        this.thirst = 50;
        this.boredom = 50;
        isAlive = true;
    }

    
}
