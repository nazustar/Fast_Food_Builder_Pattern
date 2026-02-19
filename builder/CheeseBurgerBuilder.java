package builder;

public class CheeseBurgerBuilder implements HamburgerBuild{
    //Here we create the builder.
    private Hamburger burger;

    //Implementation of the methods of hamburger build.
    @Override
    public void reset(){
        this.burger = new Hamburger();
    }

    @Override
    public void buildBread(){
        burger.setBread ("Bread with seeds");
    }

    @Override
    public void buildMeat(){
        burger.setMeat ("Ground meat");
    }

    @Override
    public void buildCheese(){
        burger.setCheese(true);
    }

    @Override
    public void buildExtraIngredients(){
        burger.setExtraIngredients("Tomatoes, onion, ketchup, lettuce");
    }

    //Constructor for the builder, the reset starts a new order.
    public CheeseBurgerBuilder(){
        this.reset();
    }
}
