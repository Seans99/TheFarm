public class Goat extends Animal{

    int milkAmount = 5;
    int totalMilk = 10;

    //Constructor initializes goat name.
    public Goat(String name) {
        super(name);
    }

    //Method to milk goat.
    public int milkGoat(){

        //If the totalMilk is less than the milk amount gives output.
        if (totalMilk < milkAmount){
            System.out.println(getName() + " is tired and does not want to be milked.");
            return 0;
        }

        //Milks goat.
        totalMilk -= milkAmount;
        return milkAmount;
    }
}
