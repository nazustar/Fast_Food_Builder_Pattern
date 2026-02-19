package builder;

public class Hamburger {
    //Product.

    //Here we define the attributes for the hamburgers.
    private String bread;
    private String meat;
    private boolean cheese;
    private String extraIngredients = "None";

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

    public void setExtraIngredients(String extraIngredients){
        this.extraIngredients = extraIngredients;
    }

    //Here the product shows the finished hamburger, with their attributes.
    public void finishHamburger(){
        System.out.println("---------------------")
        System.out.println("Food order");
        System.out.println("---------------------");
        System.out.println("Bread type: " + bread);
        System.out.println("Meat type: " + meat);

        //For print cheese boolean.
        if (cheese == false){
            System.out.println("Cheese: the burger doesn't have cheese");
        } else if (cheese == true){
            System.out.println("Cheese: yes, the burger has cheese");
        }
        System.out.println("Extra ingredients: " + extraIngredients);
    }
}
