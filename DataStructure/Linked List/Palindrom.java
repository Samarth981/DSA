public class Palindrom {    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null; 
        }
    }
        public static Node head;
        public static Node Tail;

        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = Tail = newNode;
                return;
            }
            Tail.next = newNode;
            Tail = newNode;
        }

        public void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " --> "); //print
                temp = temp.next; //next node is temp
            }
            System.out.println("null");
        }

        //start quetion solve


        //slow & fast Algoritum
        public Node findMid(Node head){
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        public boolean IsPalindrom(){
            if(head == null || head.next == null){
                return true;
            }
            //step-1 -> find mid
            Node midNode = findMid(head);

            //step-2 -> revers mid
            Node prev = null;
            Node currnt = midNode;
            Node next; //I do not know node
            while(currnt != null){
                next = currnt.next;
                currnt.next = prev;
                prev = currnt;
                currnt = next;
            }

            //step-3 -> compper left and righet
            Node right = prev;  //right harf head
            Node left = head;
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }


        public static void main(String[] args) {
            Palindrom obj = new Palindrom();
            obj.addLast(1);
            obj.addLast(2);
            obj.addLast(2);
            // obj.addLast(1);  
            obj.print();
            System.out.println(obj.IsPalindrom());
        }

    }

