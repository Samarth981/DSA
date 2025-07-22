// tc & sc = 0(n)
class First_occurance{
    public static int FirstTime(int arr[], int k, int i){
        //base
        if(i == arr.length){
            return -1;
        }
        int recursiveAns =  FirstTime(arr, k, i+1);
        //check condition 
        if(arr[i] == k){
            return i;
        } else {
            return recursiveAns;
        } 
    }

    public static int LastTime(int arr[], int k, int i){
        //base
        if(i == arr.length){
            return -1;
        }
        int find = LastTime(arr, k, i+1);  
        if(find != -1){
            return find; //that means fist time key to next not any key find 
        }
        if(arr[i] == k){ //check first if true then return i 
            return i;
        }
        return find; //cur is key

        // or

        //base
        // if(i == 0){
        //     return -1;
        // }
        // int recursiveAns =  LastTime(arr, k, i-1);
        // //check condition 
        // if(arr[i] == k){
        //     return i;
        // } else {
        //     return recursiveAns;
        // }
    }
    
    public static void main(String args[] ){
        int arr[] = {2,5,6,3,2,4,1,0};
        int k = 2;
        int i = 0;
        System.out.println(FirstTime(arr, k, i));
        System.out.println(LastTime(arr, k, i));
    }
}