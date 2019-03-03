package za.ac.cput;

public class Fish implements NotWalking {

    String fishFood = null;
    @Override
    public String eat(String food) {

        fishFood = food;
        return fishFood;
    }

    @Override
    public void swim(){

        System.out.println("I can swim.");

    }

}
