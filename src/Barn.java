import java.util.ArrayList;

public class Barn {

    //ArrayList for animals in barn.
    private ArrayList<Animal> Animals = new ArrayList<>();

    //Constructor adds animals in barn.
    public Barn(){
        Animals.add(new Cow("Daisy"));
        Animals.add(new Cow("Leah"));
        Animals.add(new Goat("Maggie"));
        Animals.add(new Goat("Bella"));
    }

    /*If chosen animal is in barn starts milking else
    gives output that animal is not in barn. */
    public Animal getAnimals(String name){
        for (Animal animal: Animals){
            if(name.equals(animal.getName())){
                System.out.println("You are now milking "+name);
                System.out.println("Milking...");
                return animal;
            }
        }

        System.out.println("Animal is not in this barn.");
        return null;
    }
}
