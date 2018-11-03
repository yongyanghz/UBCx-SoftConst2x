package model.exceptions;

public class TooManyBeansException extends BeansAmountException {
    public TooManyBeansException(double beans){
        super(beans, "Too many beans!");
    }


}
