
// check for number is palindrome or not 
//company = intuit
//tc = O(n)
class Strings{
    public static boolean palindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "racecar";
        System.out.println(palindrome(str));
    }
    public void append(Strings number) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'append'");
    }
}