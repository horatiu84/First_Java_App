package main.java.structure;

// LEARNING ABOUT PACKAGES


import bank.BankAccount;
import inventory.Inventory;
import inventory.Product;
import inventory.Warehouse;
import university.Course;
import university.Enrollment;
import university.Student;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //using user input for printing a message onscreen

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        */

        Account account = new Account();
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        BankAccount bankAccount1= new BankAccount();
        bankAccount1.accountNumber = 1;
        bankAccount1.accountHolder = "Horas";
        bankAccount1.balance = 15.35;

        System.out.println(bankAccount1.accountNumber);
        System.out.println(bankAccount1.accountHolder);
        System.out.println(bankAccount1.balance);

        Product prod1 = new Product();
        prod1.productID = 1235;
        prod1.productName="mouse";
        prod1.price = 15;

        Inventory inventory = new Inventory();
        inventory.product=prod1;
        inventory.quantity=2;

        Warehouse warehouse = new Warehouse();
        warehouse.warehouseId = 157;
        warehouse.warehouseName = "Siemra";
        warehouse.inventories = "Serie";

        System.out.println("Product ID: " + prod1.productID);
        System.out.println("Prodcut name: " + prod1.productName);
        System.out.println("Product price: " + prod1.price);

        System.out.println("Inventory product :" + inventory.product.productName);
        System.out.println("Inventory quantity: " + inventory.quantity);

        System.out.println("Warehouse id: "  + warehouse.warehouseId);
        System.out.println("Warehouse name: "  + warehouse.warehouseName);

        Student student = new Student();
        student.studentID = 5;
        student.name = "Ion";

        Course course = new Course();
        course.courseId = 3;
        course.courseName = "Mate";

        Enrollment enrollment = new Enrollment();
        enrollment.course = course;
        enrollment.student = student;

        System.out.println("At the " + enrollment.course.courseName + " course we have one student : " + enrollment.student.name);

    }
}