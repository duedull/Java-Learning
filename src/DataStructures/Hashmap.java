package DataStructures;
import java.util.HashMap;

//A HashMap stores key-value pairs, which are great when you want to store values and find them by a key (like a name or ID):
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> Hm1 = new HashMap<>();
        Hm1.put("a","Abhay singh");
        Hm1.put("b","bhaskar");
        Hm1.put("c","catwave");
        Hm1.put("d","dragon");
        Hm1.put("e","Esha");

        System.out.println(Hm1);
    }
}
