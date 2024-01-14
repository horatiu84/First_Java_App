public class Bird extends  AnotherAnimal{

    public Bird(){
        super("Chirp");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound " + this.getSound());
    }

}
