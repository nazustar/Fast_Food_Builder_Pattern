package builder;

public class Director {

    public void buildNormalBurger(HamburgerBuild builder){
        //For burgers without extra ingredients.
        builder.reset();
        builder.buildBread();
        builder.buildMeat();
        builder.buildCheese();
    }

    public void buildExtraIngredients(HamburgerBuild builder){
        //Implementation of the methods.
        builder.reset();
        builder.buildBread();
        builder.buildMeat();
        builder.buildCheese();
        builder.buildExtraIngredients();
    }
}