package Animal;

public class Dog{
    private String breed;
    private int lifeSpan;
    private String behavior;
    private double price;

    public Dog(){}

    public Dog(String breed, int lifeSpan, String behavior, double price){
        this.breed = breed;
        this.lifeSpan = lifeSpan;
        this.behavior =  behavior;
        this.price = price;
    }

    // setter

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // getter

    public String getBreed(){
        return breed;
    }

    public String getBehavior(){
        return behavior;
    }

    public int getLifeSpan(){
        return lifeSpan;
    }

    public double getPrice(){
        return price;
    }
}