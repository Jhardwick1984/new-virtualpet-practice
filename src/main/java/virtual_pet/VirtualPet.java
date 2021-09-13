package virtual_pet;

public class VirtualPet {

    public String name;
    public String description;
    public int hunger;
    public int thirst;
    public int boredom;
    public boolean isAlive;

    public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
        this.name = name;
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        isAlive = true;
    }

    
}
