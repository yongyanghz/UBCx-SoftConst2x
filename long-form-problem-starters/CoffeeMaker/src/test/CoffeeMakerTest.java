package test;

import model.CoffeeMaker;
import model.exceptions.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;


public class CoffeeMakerTest {
    private CoffeeMaker testcm;


    @Before
    public void setUp(){
        // TODO: instantiate your test objects here
        testcm = new CoffeeMaker();
    }

    @Test
    public void testBrew0(){
        try{
            testcm.brew(2.5, 15);
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void testBrew1(){
        try{
            testcm.brew(2.3, 15);
        }catch(BeansAmountException e){

        }catch(WaterException e){
            fail();
        }
    }

    @Test (expected = TooManyBeansException.class)
    public void testBrew2() throws BeansAmountException, WaterException {
            testcm.brew(2.7, 15);
    }

    @Test (expected = NotEnoughBeansException.class)
    public void testBrew3() throws BeansAmountException, WaterException {
        testcm.brew(2.3, 12);
    }

    @Test (expected = WaterException.class)
    public void testBrew4() throws BeansAmountException, WaterException {
        testcm.brew(2.5, 12);
    }

    @Test (expected = WaterException.class)
    public void testBrew5() throws BeansAmountException, WaterException {
        testcm.brew(2.4, 14.75);
    }

    @Test (expected = WaterException.class)
    public void testBrew6() throws BeansAmountException, WaterException {
        testcm.brew(2.6, 14.75);
    }

    @Test
    public void testPourCoffee0(){
        try{
            testcm.brew(2.5,15);
            testcm.pourCoffee();
        }catch(Exception e){
            fail();
        }
    }

    @Test (expected = NoCupsRemainingException.class)
    public void testPourCoffee1() throws BeansAmountException, WaterException, NoCupsRemainingException, StaleCoffeeException {
        testcm.brew(2.5, 15);
        testcm.setCups(0);
        testcm.setTimeSinceLastBrew(10);
        testcm.pourCoffee();
    }

    @Test (expected = NoCupsRemainingException.class)
    public void testPourCoffee2() throws BeansAmountException, WaterException, NoCupsRemainingException, StaleCoffeeException {
        testcm.brew(2.5, 15);
        testcm.setCups(0);
        testcm.setTimeSinceLastBrew(70);
        testcm.pourCoffee();
    }

    @Test (expected = StaleCoffeeException.class)
    public void testPourCoffee3() throws BeansAmountException, WaterException, NoCupsRemainingException, StaleCoffeeException {
        testcm.brew(2.5, 15);
        testcm.setCups(20);
        testcm.setTimeSinceLastBrew(70);
        testcm.pourCoffee();
    }

}
