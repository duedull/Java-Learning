package ZERO.Relationships;

public class Main {
    public static void main(String[] args) {

        //types of relationships in java
        //inheritance(IS-A)  {class Car extends Vehicle } "Car IS-A vehicle", and inheritance the classes are tightly coupled as the
        // change in parent class will be reflected to the child class

        //Association (Has - A) - Aggregation & Composition

        Address add1 = new Address("Fa", "kerela", "000");
        Address add2 = new Address("plo", "dtot", "001");

        Employee emp1 = new Employee(123, "abhay", add1);
        Employee emp2 = new Employee(123, "abhay", add2);

        emp2.display();
        emp1.display();
    }
}
