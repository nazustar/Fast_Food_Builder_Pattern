//Builder.
package builder;

public interface HamburgerBuilder {
    public void reset();

    //This methods are implemented on each burger for set the attributes.
    public void buildBread();
    public void buildMeat();
    public void buildCheese();
    public void buildExtraIngredients();

    //This method shows the finished burger.
    Hamburger getFinishedBurger();
}
