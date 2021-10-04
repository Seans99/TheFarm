public class Main {

    public static void main(String[] args) {

        //Gives farmer a name.
        Farmer farmer = new Farmer("Jason");

        //Starts milking chosen cow
        farmer.MilkCow("Daisy");
        farmer.getMilkCanCow();

        //Starts milking chosen goat
        farmer.MilkGoat("Maggie");
        farmer.getMilkCanGoat();


    }
}
