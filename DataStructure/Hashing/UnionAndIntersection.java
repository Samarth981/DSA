
import java.util.*;

public class UnionAndIntersection {

    public static int union(int arg1[], int arg2[]) {
        HashSet<Integer> st = new HashSet<>();

        for (int i = 0; i < arg1.length; i++) {
            st.add(arg1[i]);
        }
        for (int i = 0; i < arg2.length; i++) {
            st.add(arg2[i]);
        }
        return st.size();
    }

    public static int intersection(int arg1[], int arg2[]) {
        HashSet<Integer> st = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arg1.length; i++) {
            st.add(arg1[i]);
        }
        for (int i = 0; i < st.size(); i++) {
            if (st.contains(arg2[i])) {
                count++;
                st.remove(arg2[i]);
            }
        }
        return st.size();
    }

    public static void main(String args[]) {
        int arg1[] = {7, 3, 9};
        int arg2[] = {6, 3, 9, 2, 9, 4};

        System.out.println(union(arg1, arg2));
        System.out.println(intersection(arg1, arg2));
    }
}
