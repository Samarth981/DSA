
// Output: 36
// Explanation: The operations are as follows:
// - Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
// - Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
// Thus the resulting integer is 36.

public class string_sum {
    public static void convertStrToNumber(String str , StringBuilder number){
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int numericValue = currentChar - 'a' + 1;
            number.append(numericValue);
        }
        System.out.println(number);
    }
    public static void main(String[] args) {
        StringBuilder number = new StringBuilder();
        String str = "iiii";
        int k=1;

        //conver alphabet as number
        convertStrToNumber(str, number);

        //this new string stor as a str
        String result = number.toString(); 

        for (int i = 0; i < k; i++){
            int sum = 0;
            for (int j = 0; j < result.length(); j++) {
                sum += result.charAt(j) - '0';
            }
            result = Integer.toString(sum); //this sum stroe in str
        }
        System.out.println("Final result: " + result);

    }
}