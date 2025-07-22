import java.util.Comparator;
import java.util.PriorityQueue;
public class implementation{
    public static void main(String args[]){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //Priority is, smaller is first 
        pq.add(3); //O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());  //O(1)
            pq.remove();  //O(logn)
        }

        // if i am tray to print revers priority then ?
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        //Priority is, smaller is first 
        pq2.add(3); //O(logn)
        pq2.add(4);
        pq2.add(1);
        pq2.add(7);

        while(!pq2.isEmpty()){
            System.out.println(pq2.peek());  //O(1)
            pq2.remove();  //O(logn)
        }

        //if give object then? -> step1 : create class Student in there add data.
        PriorityQueue<Student> pq3 = new PriorityQueue<>();
        pq3.add(new Student("Samarth", 4));
        pq3.add(new Student("soham", 5));
        pq3.add(new Student("fenil", 10));
        pq3.add(new Student("raj", 3));
        pq3.add(new Student("parv", 1));
          while(!pq3.isEmpty()){
            System.out.println(pq3.peek().name + "->" + pq3.peek().rank);  //O(1)
            pq3.remove();  //O(logn)
        }


    }
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
}

