import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Algorithm a = new Algorithm();
        System.out.println("Less Than Zero");
        System.out.println(a.numberOfNegatives(new ArrayList<>(Arrays.asList(-1, 0, 1))));
        System.out.println(a.numberOfNegatives(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(a.numberOfNegatives(new ArrayList<>(Arrays.asList(-1, -1, -3))));
        System.out.println("Has String");
        System.out.println(a.hasString(new ArrayList<>(Arrays.asList("String")), "string"));
        System.out.println(a.hasString(new ArrayList<>(Arrays.asList("String")), "String"));
        System.out.println(a.hasString(new ArrayList<>(Arrays.asList("String", "not", "found")), "not"));
        System.out.println("Has Same Value");
        System.out.println(a.hasSameValue(new ArrayList<>(Arrays.asList(1, 2)), new ArrayList<>(Arrays.asList(2, 3))));
        System.out.println(a.hasSameValue(new ArrayList<>(Arrays.asList(1, 2)), new ArrayList<>(Arrays.asList(3, 4))));
        System.out.println(a.hasSameValue(new ArrayList<>(Arrays.asList(1, 2)), new ArrayList<>(Arrays.asList(2, 1))));
        System.out.println("First Appearance ArrayList");
        System.out.println(a.firstAppearance(new ArrayList<>(Arrays.asList(1, 2, 3)), 2));
        System.out.println(a.firstAppearance(new ArrayList<>(Arrays.asList(1, 2, 3)), 4));
        System.out.println(a.firstAppearance(new ArrayList<>(Arrays.asList(2, 3, 4)), 2));
        System.out.println("First Appearance Array");
        System.out.println(a.firstAppearance(new int[] {1, 2, 3}, 2));
        System.out.println(a.firstAppearance(new int[] {1, 2, 3}, 4));
        System.out.println(a.firstAppearance(new int[] {2, 3, 4}, 2));
    }
}
