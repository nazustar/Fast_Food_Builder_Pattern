//Builder.
package builder;

public interface HamburgerBuild {
    public void reset();

    //This methods are implemented on each burger for set the attributes.
    public void buildBread();
    public void buildMeat();
    public void buildCheese();
    public void buildExtraIngredients();

}
