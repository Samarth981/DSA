public class callByRef {
    public static void update(int marks[], int n) {
        n = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] +1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int number = 5; 
        update(marks, number);
        System.out.println(number); //not update
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" "); //update
        }
        System.out.println();
    }
}
