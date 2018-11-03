package model.exceptions;

public class WaterException extends Exception {
    private  double cupsWater;

    public WaterException(){
        super("Not enough water!");
    }
}
