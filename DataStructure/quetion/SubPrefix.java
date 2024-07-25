// prfix tecnic
// time complex -> O(n^2)
// //find max and min sum of sub array

public class SubPrefix {
    public static void sub(int number[]) {
        int sum;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // Create prefix array
        int prefix[] = new int[number.length];
        prefix[0] = number[0];

        // Calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        // Calculate subarray sums using prefix array
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (sum > largest) {
                    largest = sum;
                }
                if (sum < smallest) {
                    smallest = sum;
                }
            }
        }

        System.out.println("Largest sum: " + largest);
        System.out.println("Smallest sum: " + smallest);
    }

    public static void main(String[] args) {
        int number[] = {1, -2, -6, -1, 3};
        sub(number);
    }
}

