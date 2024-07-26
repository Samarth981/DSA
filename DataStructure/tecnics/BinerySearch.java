// tc = O(log bas 2 n) like (log2n) 
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
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int key=4;
        System.out.println("index of number using binary search: "+ binerySearch(number, key));
    }
}
