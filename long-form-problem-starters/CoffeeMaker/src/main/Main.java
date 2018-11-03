package main;

import model.CoffeeMaker;
import model.exceptions.BeansAmountException;
import model.exceptions.NoCupsRemainingException;
import model.exceptions.StaleCoffeeException;
import model.exceptions.WaterException;

public class Main {

    public static void main(String[] args){
        // TODO: complete the implementation of Main
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();
        try{
            myCoffeeMaker.brew(2.6, 5);
            myCoffeeMaker.pourCoffee();
            myCoffeeMaker.setTimeSinceLastBrew(20);

        }catch(BeansAmountException e){
            System.out.println(e.getMessage());
        }catch(WaterException e){
            System.out.println(e.getMessage());
        }catch(NoCupsRemainingException e){
            System.out.println(e.getMessage());
        }catch(StaleCoffeeException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The coffee is well prepared, please enjoy.");
        }

    }



}