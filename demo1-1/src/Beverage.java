public abstract class Beverage {
    String description="Unknown Beverage";
    String size;
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
