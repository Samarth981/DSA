// tc = nO(log bas 2 n) like (log2n) 
//logn == n , n/2 , n/4, n/6 .... 1
//emaple in linear search operation is 10^9 then tc = 10^9 but in binaray search like 32 or 33

public class BinerySearch {
    public static int binerySearch(int number[], int key){
        int start = 0;
        int end = number.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            //comperition
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){ //right
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    //using recurtion
    //tc = O(log n)
    //sp = O(logn)
    public static int binerySearch_recurtion(int number[], int key,int start, int end){
        //base
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;
        if(number[mid] == key){
            return mid;
        }
        else if(number[mid] > key){
            return binerySearch_recurtion(number, key, start, mid-1);
        } else{
            return binerySearch_recurtion(number, key, mid+1, end);
        }
    }

    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int key=4;
        System.out.println("index of number using binary search: "+ binerySearch(number, key));
        int start = 0;
        int end = number.length-1;
        System.out.println("index of number using binary search: "+ binerySearch_recurtion(number, key, start, end));

    }
}
