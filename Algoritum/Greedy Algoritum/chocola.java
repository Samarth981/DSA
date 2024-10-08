
import java.util.Arrays;
import java.util.Collections;

public class chocola {
    public static void main(String args[]) {
        // int n=4, m =4;

        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0; // pointer
        int hp = 1, vp = 1; // part of cho
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            // vartical cost < hor cosst
            if (costVer[v] <= costHor[h]) {
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("minimum cost of cutting choc = " + cost);
    }
}
