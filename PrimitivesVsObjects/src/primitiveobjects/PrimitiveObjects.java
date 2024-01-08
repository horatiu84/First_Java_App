package primitiveobjects;

public class PrimitiveObjects {
    public static void main(String[] args) {
       Person person = new Person();

       person.name = "Horas";
       person.age = 39;
        System.out.println("My name is " + person.name  + " and I have " + person.age + " years");

        Car car = new Car();
        car.owner = person;
        car.model = "Dacia";

        System.out.println("Owner : " + car.owner.name + ", model : " + car.model);

        /*
        Pass a primitive data type to a method, modify it, and print the value before and after the method call.

        Steps:

        1. Create a class Main and give it a main method.

        2. Declare an int variable number in the main method.

        3. Assign a value to number.

        4. Print the value of number.

        5. In the same class, create a method modifyNumber. In the modifyNumber method, modify the value of the parameter, like this:

        public static void modifyNumber(int num) {
              num = num * 2;
           }

        6. Call the method modifyNumber and pass the variable number to it.

        7. Print the value of number after the method call.

        8. Did you expect the outcome? (Explanation is in the solution.)
         */

        int number = 10;
        System.out.println(number);

        modifyNumber(number);
        System.out.println(number);

        modifyPerson(person);
        System.out.println("My name is " + person.name  + " and I have " + person.age + " years");
    }
    public static void modifyNumber(int num) {
        num = num * 2;
        System.out.println(num);
    }

    /*
    Exercise: Pass Object to a Method
    Pass an object to a method, modify its fields, and print the values before and after the method call.

    Steps:

    1. Create a Person class with a name and age.

    2. Create a class Main with a main method.

    3. Create a Person object in the main method, and set the name and age values.

    4. Print the values of the Person object.

    5. Call a method modifyPerson and pass the Person object to it.

    6. In the modifyPerson method, modify the fields of the Person parameter.

    7. Print the values of the Person object after the method call.

    8. Did you expect the result? (Explanation can be found in the solution.)


     */

    public static void modifyPerson(Person p) {
        p.name = "hora";
        p.age = 43;
    }
}