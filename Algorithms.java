import java.util.ArrayList;

public class Algorithms {
    public int numberOfNegatives(ArrayList<Integer> integers) {
        int count = 0;
        for (int i: integers) {
            if (i < 0) count++;
        }
        return count;
    }
    public boolean hasString(ArrayList<String> strings, String target) {
        for (String s: strings) {
            if (s.equals(target)) return true;
        }
        return false;
    }
    public boolean hasSameValue(ArrayList<Integer> integers, ArrayList<Integer> integers1) {
        for(int i: integers) {
            for (int j: integers1) {
                if (i == j) return true;
            }
        }
        return false;
    }
}
