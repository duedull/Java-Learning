package ZERO.Relationships;

//(Inheritance) this is a example of IS-A relationship (Car is a Vehicle [Inheritance are tightly coupled]

public class Car extends Vehicle{
    void Car_running(){
        System.out.println("this is car running!!!");
    }

    static Engine e = new Engine(); //ASSOCIATION HAS-A relationship "car has a engine" [loosely coupled]

    public static void main(String[] args) {
        e.E();
    }
}