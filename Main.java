import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Algorithms a = new Algorithms();
        System.out.println(a.numberOfNegatives(new ArrayList<>(Arrays.asList(-1, 0, 1))));
        System.out.println(a.numberOfNegatives(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(a.numberOfNegatives(new ArrayList<>(Arrays.asList(-1, -1, -3))));
        System.out.println(a.hasString(new ArrayList<>(Arrays.asList("String")), "string"));
        System.out.println(a.hasString(new ArrayList<>(Arrays.asList("String")), "String"));
        System.out.println(a.hasString(new ArrayList<>(Arrays.asList("String", "not", "found")), "not"));
        System.out.println(a.hasSameValue(new ArrayList<>(Arrays.asList())));
    }
}
