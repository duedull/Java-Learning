import firstPackage.FirstClass;
import  firstPackage.SecondClass;
import  secondPackage.*;
import java.util.Random;

public class Packages {
    public static void main(String[] args) {
        FirstClass.a();
        SecondClass.b();

        secondPackage.FirstClass.a();
        secondPackage.SecondClass.b();
    }
}
