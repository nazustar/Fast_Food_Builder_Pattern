package app;
import builder.*;

public class Main {
    public static void main(String[] args) {
        //Creation of the director.
        Director director = new Director();

        //Chesse burger.
        HamburgerBuilder cheeseBurgerBuilder = new CheeseBurgerBuilder();
        director.buildExtraIngredients(cheeseBurgerBuilder);
        Hamburger cheeseBurger = cheeseBurgerBuilder.getFinishedBurger();
        cheeseBurger.finishHamburger();

        //Classic burger.
        HamburgerBuilder classicBurgerBuilder = new ClassicBurgerBuilder();
        director.buildNormalBurger(classicBurgerBuilder);
        Hamburger classicBurger = classicBurgerBuilder.getFinishedBurger();
        classicBurger.finishHamburger();
        
    }
}