package model;

import model.exceptions.*;

/**
 * A coffee maker used to train baristas.
 *
 * Class invariant: cups remaining >= 0, time since last brew >= 0
 */

public class CoffeeMaker {
    private int cups;
    private int timeSinceLastBrew;

    public CoffeeMaker(){
        this.cups = 20;
        this.timeSinceLastBrew = 0;
    }

    // getters
    public int getTimeSinceLastBrew() {
        return timeSinceLastBrew;
    }
    public int getCupsRemaining() {
        return cups;
    }

    // EFFECTS: return true if there are coffee cups remaining
    public boolean areCupsRemaining() {
        if(cups > 0)
            return true;
        else
            return false;
    }

    //REQUIRES: a non-negative integer
    //EFFECTS: sets time since last brew
    public void setTimeSinceLastBrew (int time) {
        assert(time >= 0);
        this.timeSinceLastBrew = time;
    }

    //REQUIRES: a non-negative integer
    //EFFECTS: set cups to n
    public void setCups( int n) {
        assert(n >= 0);
        this.cups = n;
    }

    //REQUIRES: beans between 2.40 and 2.60 cups, water > 14.75 cups
    //EFFECTS: sets cups remaining to full (20 cups) and time since last brew to 0
    public void brew(double beans, double water) throws BeansAmountException, WaterException {
        if(beans < 2.40)
            throw new NotEnoughBeansException(beans);
        else if(beans > 2.60)
            throw new TooManyBeansException(beans);
        if(water <= 14.75)
            throw new WaterException();
        setCups(20);
        setTimeSinceLastBrew(0);
        System.out.println("Coffee brewing is ok.");
    }

    ///REQUIRES: cups remaining > 0, time since last brew < 60
    //MODIFIES: this
    //EFFECTS: subtracts one cup from cups remaining
    public void pourCoffee() throws NoCupsRemainingException, StaleCoffeeException {
        if(getCupsRemaining() <= 0)
            throw new NoCupsRemainingException();
        if(getTimeSinceLastBrew() >= 60)
            throw new StaleCoffeeException();
        this.cups--;
        System.out.println("Coffee pouring is ok.");
    }


}
