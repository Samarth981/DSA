public class LinearSearch {
    // public static int Linear_Search(int num[], int key) {
    //     for(int i=0;i<num.length;i++){
    //         if(num[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int number[] = {2,4,6,8,10,12,14,16};
    //     int key =8;
    //     int index = Linear_Search(number, key);

    //     if(index==-1){
    //         System.out.println("key is not exist in array");
    //     }else{
    //         System.out.println("key is at index : "+index); 
    //     }
    // }


    //manu of hotel
    public static int Linear_Search(String manu[], String key) {
        for(int i=0;i<manu.length;i++){
            if(manu[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String manu[] = {"dosa", "dabeli", "samosa", "vadapau", "sandwich"};
        String key = "samosa";
        int index = Linear_Search(manu, key);

        if(index==-1){
            System.out.println("key is not exist in array");
        }else{
            System.out.println(key+" is at index : "+index); 
        }
    }
}
