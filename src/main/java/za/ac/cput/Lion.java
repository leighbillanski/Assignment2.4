package za.ac.cput;

public class Lion implements Walking {


    @Override
    public String eat(String food) {

        return food;
    }

    @Override
    public void walking(){

        System.out.println("I can walk!");

    }

}
