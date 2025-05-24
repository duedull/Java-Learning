package ZERO.Relationships;

public class Employee {
    int id;
    String name;
    Address adddress; //Has-a relationship

    Employee (int id, String name, Address adddress){
        this.id = id;
        this.name = name;
        this.adddress = adddress;
    }

    String display(){
        System.out.println(adddress.houseNo + " " + adddress.city + " " + adddress.state);
        return this.id + " " + this.name + " " + this.adddress;
    }
}