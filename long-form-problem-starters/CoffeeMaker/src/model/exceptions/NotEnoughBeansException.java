package model.exceptions;

public class NotEnoughBeansException extends BeansAmountException {

    public NotEnoughBeansException(double beans){
        super(beans, "Not enough beans!");
    }

}

