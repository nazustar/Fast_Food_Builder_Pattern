package builder;

public class Director {
    public void buildNormalBurger(){

    }

    public void buildExtraIngredients(HamburgerBuild builder){
        builder.reset();
        builder.buildBread();
        builder.buildMeat();
        builder.buildCheese();
        builder.buildExtraIngredients();
    }
}