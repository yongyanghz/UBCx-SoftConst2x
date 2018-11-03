package model.exceptions;

public class BeansAmountException extends Exception {
    private  double beans;

    protected BeansAmountException(double beans, String message){
        super(beans + message);
    }

    public BeansAmountException(double beans){
        super(beans + "# is not the right amount of beans");
    }


    public double getBeans(){ return 0;}



}
