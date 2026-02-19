package builder;

public class Hamburger {
    //Product.

    //Here we define the attributes for the hamburgers.
    private String bread;
    private String meat;
    private boolean cheese;
    private String extraIngredients;

    //Setters for use on each hamburger.
    public void setBread(String bread){
        this.bread = bread;
    }

    public void setMeat(String meat){
        this.meat = meat;
    }

    public void setCheese(boolean cheese){
        this.cheese = cheese;
    }

    public void setExtraIngredients(String extraIngrents){
        this.extraIngredients = extraIngrents;
    }

    public void showResults(){
        
    }
}
