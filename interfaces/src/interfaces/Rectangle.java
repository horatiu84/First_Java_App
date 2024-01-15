package interfaces;

public class Rectangle implements Countable,Drawable {
    /*
    Create a class named Rectangle that implements two interfaces, Drawable and Countable, each with a default method named printInfo().

    Steps:

    1. Create an interface named Countable with a default method printInfo().

    2. Add a default printInfo() method to Drawable as well.

    3. Create a class named Rectangle.

    4. Implement both the Drawable and Countable interfaces in the Rectangle class.

    5. Resolve the conflict by overriding the printInfo() method in the Rectangle class and print "Rectangle info."


     */
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle!");
    }

  @Override
    public void printInfo(){
      System.out.println("This is a o rectangle!");
  }



}
