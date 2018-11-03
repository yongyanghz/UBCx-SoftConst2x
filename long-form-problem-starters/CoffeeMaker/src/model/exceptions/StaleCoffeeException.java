package model.exceptions;

public class StaleCoffeeException extends Exception {
    private int timeLastBrew;

    public StaleCoffeeException(){
        super("The coffe has been sitting too long and is now stale");
    }

}
