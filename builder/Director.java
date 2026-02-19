package builder;

public class Director {

    public void buildNormalBurger(HamburgerBuilder builder){
        //For burgers without extra ingredients.
        builder.reset();
        builder.buildBread();
        builder.buildMeat();
        builder.buildCheese();
    }

    public void buildExtraIngredients(HamburgerBuilder builder){
        //Implementation of the methods.
        builder.reset();
        builder.buildBread();
        builder.buildMeat();
        builder.buildCheese();
        builder.buildExtraIngredients();
    }
}