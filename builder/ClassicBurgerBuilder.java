package builder;

public class ClassicBurgerBuilder implements HamburgerBuilder{
    
    //Here we create the builder.
    private Hamburger burger;

    //Finished burger display.
    public Hamburger getFinishedBurger(){
        return this.burger;
    }

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
        burger.setCheese(false);
    }

    @Override
    public void buildExtraIngredients(){
        burger.setExtraIngredients("");
    }

    //Constructor for the builder, the reset starts a new order.
    public ClassicBurgerBuilder(){
    }
}
