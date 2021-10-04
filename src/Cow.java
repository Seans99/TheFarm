public class Cow extends Animal{

    int milkAmount = 10;
    int totalMilk = 30;

    //Constructor initializes cow name.
    public Cow(String name) {
        super(name);
    }

    //Method for milking cow.
    public int milkCow(){

        //If the totalMilk is less than the milk amount gives output.
        if (totalMilk < milkAmount){
            System.out.println(getName() + " is tired and does not want to be milked.");
            return 0;
        }

        //Milks cow.
        totalMilk -= milkAmount;
        return milkAmount;
    }
}
