package interfaces;

public abstract class AbstractAnimal {
    private double weight;
    public void eat(){
        System.out.println("Animal eating");
    }

    public abstract void breathe();
}
