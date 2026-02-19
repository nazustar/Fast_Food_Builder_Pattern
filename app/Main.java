package app;
import builder.*;

public class Main {
    public static void main(String[] args) {
        //Creation of the director.
        Director director = new Director();

        HamburgerBuilder cheeseBurgerBuilder = new CheeseBurgerBuilder();
        director.buildExtraIngredients(cheeseBurgerBuilder);
        Hamburger cheeseBurger = cheeseBurgerBuilder.getFinishedBurger();
        cheeseBurger.finishHamburger();
    }
}