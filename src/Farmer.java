public class Farmer extends Person{

    public int MilkCanCow = 0;
    public int MilkCanGoat = 0;

    //Object for Barn class.
    Barn barn = new Barn();

    //Constructor initializes farmer name.
    public Farmer(String name) {
        super(name);
    }

    //Method to milk chosen cow.
    public void MilkCow(String name) {

        Cow cow = (Cow) barn.getAnimals(name);
        MilkCanCow += cow.milkCow();
    }

    //Method to milk chosen goat.
    public void MilkGoat(String name) {

        Goat goat = (Goat) barn.getAnimals(name);
        MilkCanGoat += goat.milkGoat();
    }

    //Outputs milk in milkCan after milking cow.
    public void getMilkCanCow() {
        System.out.println("Your milkCan has been filled with " + MilkCanCow + "L" + " of cow milk");

    }

    //Outputs milk in milkCan after milking goat.
    public void getMilkCanGoat() {
        System.out.println("Your milkCan has been filled with " + MilkCanGoat + "L" + " of goat milk");

    }
}
