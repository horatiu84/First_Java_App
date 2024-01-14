public class Car extends Vehicle{

    private String model;
    public Car(){
        System.out.println("In constructor Car");
    }

    public Car(String brand,String model){
        super(brand);
        this.model =  model;
    }
}
