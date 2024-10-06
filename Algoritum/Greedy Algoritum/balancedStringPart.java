//Maximum Balanced String Partitions

public class balancedStringPart {
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int lCount = 0;
        int rCount = 0;
        int partCount = 0;

        for (int eliment = 0; eliment < str.length(); eliment++) {
            if (str.charAt(eliment) == 'L') {
                lCount++;
            }
            if (str.charAt(eliment) == 'R') {
                rCount++;
            }
            if (lCount == rCount) {
                partCount++;
                lCount = 0;
                rCount = 0;
            }
        }
        System.out.println(partCount);
    }
}