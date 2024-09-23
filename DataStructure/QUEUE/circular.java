public class circular {
    static class Arrays_circular{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Arrays_circular(int n){
            size = n;
            arr = new int[size];
            rear = -1;
            front = -1;
        }

        //isEmpty //O(1)
        public static boolean isEmpty(){
            return rear == -1 && front== -1;
        }

        //QUEUE is full?
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //add //O(1)
        public static void add(int data){ 
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            //add first eliment
            if(front == -1){
                front = 0;
            }
            rear  = (rear +1) % size; //change part
            arr[rear] = data;
        }

        //remove //O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];
            
             
            if(rear == front){  //if last eliment  is delet
                rear = front = -1;
            }else {
                front = (front+1)%size;
            }
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        
        
    }
    public static void main(String args[]){
        Arrays_circular q = new Arrays_circular(3);
        q.add(1);
        q.add(2);
        q.add(3);
        // q.add(4);
        // q.add(5);

        //this condition only work in circulr queue

        System.out.println(q.remove()); //front eliment remove
        q.add(10);
        System.out.println(q.remove());
        q.add(11); 

        
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
