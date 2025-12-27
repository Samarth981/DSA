import java.util.*;

public class HashMapCode{
    //internal implementation of hashmap class
    static class HashMap<K,V>{

        
        private class Node {
            K key;
            V value;

            //constucter
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        
        private int n; // number of nodes
        private int N; // number of buckets
        private LinkedList<Node> buckets[]; // array of LinkedList<Node>

        @SuppressWarnings("unchecked")
        //constucter of HashMap class
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];

            // initialize each bucket with empty LinkedList
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        //helper function
        private int hashFunction(K key) {
            int hashValue = key.hashCode(); 
           return Math.abs(hashValue) % N;
        }


        private int searchLinkedList(K key, int buketIdx){
            LinkedList<Node> ll = buckets[buketIdx];
            int dataIdx = 0;

            for(Node node : ll){
                if(node.key.equals(key)){
                    return dataIdx;
                }
                dataIdx++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            //current data store 
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N; 

            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in newBucket
            for(int i =0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j <ll.size(); j++){ 
                    Node extractNode = ll.remove(j);
                    //store node in newBucket
                    put(extractNode.key, extractNode.value);
                }
            }
        }

        //O(lambda) -> O(1) -> put,remove, get, containes
        public void put(K key, V value){
            int bucketIdx = hashFunction(key); 
            int dataIdx = searchLinkedList(key, bucketIdx); //return idx or -1

            if(dataIdx != -1){
                Node node = buckets[bucketIdx].get(dataIdx);
                node.value = value;
            } else {
                buckets[bucketIdx].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n/N ;

            if(lambda > 2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bucketIdx = hashFunction(key); 
            int dataIdx = searchLinkedList(key, bucketIdx); //return idx or -1

            if(dataIdx != -1){
                return true;
            } else {
               return false;
            }
        }

        public V remove(K key){
            int bucketIdx = hashFunction(key); 
            int dataIdx = searchLinkedList(key, bucketIdx); //return idx or -1

            if(dataIdx != -1){
                Node node = buckets[bucketIdx].remove(dataIdx);
                n--;
                return node.value;
            } else {
               return null;
            }
        }

        public V get(K key){
            int bucketIdx = hashFunction(key); 
            int dataIdx = searchLinkedList(key, bucketIdx); //return idx or -1

            if(dataIdx != -1){
                Node node = buckets[bucketIdx].get(dataIdx);
                return node.value;
            } else {
               return null;
            }
        }

        public ArrayList<K> KeySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
           return n == 0;
        }
    
    }

    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 100);
        hm.put("China", 200);
        hm.put("UK", 500);
        hm.put("USA", 800);

        ArrayList<String> keys = hm.KeySet();
         for(String key : keys){
            System.out.println("befor: " + key);
        }

        System.out.println(hm.get("india"));
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.remove("USA"));
        System.out.println(hm.get("USA"));
               
        for(String key : keys){
            System.out.println("after: " + key);
        }

    }
}