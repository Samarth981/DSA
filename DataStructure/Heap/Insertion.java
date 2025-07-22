import java.util.ArrayList;

public class Insertion{
    static class Heap{

        ArrayList<Integer> arr = new ArrayList<>(); 

        private void swap(int i, int j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
        }

         //Insertion in min-heap   
        //if max-heap then change only condition
        public void add(int data){
            //add in last index
            arr.add(data);

            //fixed this add value in heap
            int child = arr.size() - 1;
            int parent = (child - 1)/2; 

            while(arr.get(child) < arr.get(parent)){  
                //swap
                swap(child, parent);

                child = parent;
                parent = (child - 1) / 2;
            }
        }

        public int peek(){
            return arr.get(0); //min value 
        }

        //min heapifay function 
        //Also this is use for desending order heap sort    
        private void min_heapifay(int i){

            int left = 2*i + 1;
            int right = 2*i+2;
            int minInd = i; 

            if(left < arr.size() && arr.get(minInd) > arr.get(left)){
                minInd = left;
            } 
            if(right < arr.size() && arr.get(minInd) > arr.get(right)){
                minInd = right;
            } 

            if(minInd != i){
                //swap
                swap(i, minInd);

                min_heapifay(minInd); //recursive call
            }
        }
        
        public int remove(){     
            int data = arr.get(0);

            //last is go in root
            swap(0, arr.size() - 1);

            //delete last
            arr.remove(arr.size()-1);

            //call min_heapifay for fixed after remove
            min_heapifay(0);

            return data;
        }
        
    }
  public static void main(String[] args) {
    Heap h = new Heap();
    h.add(5);
    h.add(3);
    h.add(2);
    h.add(4);

    System.out.println(h.peek()); // Should print 2
    System.out.println(h.remove()); // Should remove 2
    System.out.println(h.peek()); // Should print 3
}
}