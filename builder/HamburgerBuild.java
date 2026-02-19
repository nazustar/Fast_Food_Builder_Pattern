//Builder.
package builder;

public interface HamburgerBuild {
    public void reset();

    public void buildBread();
    public void buildMeat();
    public void buildCheese();
    public void buildExtraIngredients();

}
