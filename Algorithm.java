import java.util.ArrayList;

public class Algorithm {
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
    public int firstAppearance(ArrayList<Integer> integers, int integer) {
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) == integer) return i;
        }
        return -1;
    }
    public int firstAppearance(int[] integers, int integer) {
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == integer) return i;
        }
        return -1;
    }

}
