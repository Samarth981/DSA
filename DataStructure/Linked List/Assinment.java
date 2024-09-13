//use can creat linkedlist using OOPS concept and this is in belo

class llnode{
    public int data;
    public llnode next;


    //constructer
    public llnode(int data){
        this.data = data;
        this.next = null;
    }
}


public class Assinment {

    //find lenght
    public static int getLength(llnode data){
        llnode temp = data;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void print(llnode head){
        if(head == null){
            System.out.println("linked list is empty");
        }
        llnode temp = head;  //creat a node
        while(temp != null){
            System.out.print(temp.data + " --> "); //print
            temp = temp.next; //next node is temp
        }
        System.out.println("null");
    }

    //check for two Linkedlist is connected or not if connected then give the index where it was connected.
    //Q-1
    public static llnode IntersectionLL(llnode  l1, llnode  l2){
        llnode curr1 = l1;
        llnode  curr2 = l2;

        // find length
        int length1 = getLength(curr1);
        int length2 = getLength(curr2);
        int difference = Math.abs(length1 - length2);

        if(length1 > length2){
            while(difference > 0){
                curr1 = curr1.next;
                difference--;
            }

        }else{
            while(difference > 0){
                curr2 = curr2.next;
                difference--;
            }
        }

        boolean flag = false;
        while (curr1 != null && curr2!=null) {
            if(curr1 == curr2){
                flag = true;
                break;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return flag ? curr1 : null;
    }

    //remove n after m
    // Q-2
    public static void removing(llnode head, int m ,int n){
        llnode curr = head;
        llnode prev = null;
        int countM = m;
        int countN = n;
        llnode lastEliment = null;
        boolean flag = true;
        while(curr != null && n > 0){ //if n = 0 then direct return.
            if(countM == 0){  
                flag = false; //if 0 then go else condion 
                countM = m; //agine start loop
                lastEliment = prev; //store node of last after deleting detect
            }
            if(countN == 0){
                flag = true; //after n delete then go if condition
                countN = n;
                lastEliment.next = curr;  //after n possion 0 then start n to end n delet. at that time curr is end node.
            }
            if(flag){
                countM--; //m is not 0 then continue 
            }else{
                countN--; //n is not 0 then remove it
            }
            //update
            prev = curr;
            curr = curr.next;
        }
    }

    //Q-5 (n*k) =tc
    public static llnode merge2List(llnode l1, llnode l2){
        if(l1 == null) {return l2;}
        if(l2 == null) {return l1;}

        llnode mergeAll = null;
        llnode temp = mergeAll;
        while(l1!= null && l2!= null){
            if(l1.data <= l2.data){
                temp.next = l1;
                //updat
                l1 = l1.next;
                temp = temp.next;
            }else{
                temp.next = l2;
                //updat
                l2 = l2.next;
                temp = temp.next;
            }
        }
        while(l1 != null){
            temp.next = l1;
            //updat
            l1 = l1.next;
            temp = temp.next;
        }
        while(l2 != null){
            temp.next = l2;
            //updat
            l2 = l2.next;
            temp = temp.next;
        }
        return mergeAll.next;
    }

    
    //or (nlogk)
//     public static ListNode merge2List(ListNode l1, ListNode l2){
//         ListNode dummy = new ListNode(-1);
//         ListNode current = dummy;

//     while (l1 != null && l2 != null) {
//         if (l1.val <= l2.val) {
//             current.next = l1;
//             l1 = l1.next;
//         } else {
//             current.next = l2;
//             l2 = l2.next;
//         }
//         current = current.next;
//     }

//     if (l1 != null) {
//         current.next = l1;
//     }
//     if (l2 != null) {
//         current.next = l2;
//     }

//     return dummy.next;
//     }
//     public ListNode mergeKLists(ListNode[] lists) {
//         if(lists.length == 0)  {return null;}
//         if(lists.length == 1)  {return lists[0];}
//         int interval = 1;
//         int k = lists.length;

//         while (interval < k) {
//             for (int i = 0; i + interval < k; i += interval * 2) {
//                 lists[i] = merge2List(lists[i], lists[i + interval]);
//             }
//             interval *= 2;
//         }
//         return lists[0];
//  }

    public static llnode margeList(llnode[] lists){
        if(lists.length == 0)  {return null;}
        if(lists.length == 1)  {return lists[0];}

        llnode newNode = merge2List(lists[0], lists[1]);

        //merge agine for 3 list
        for(int i=2; i<lists.length; i++){
            newNode = merge2List(newNode, lists[1]);
        }
        return newNode;
    }
   public static void main(String[] args) {
        //creat 
        llnode list1 = new llnode(4);
        llnode node1 = new llnode(5);
        llnode node2 = new llnode(6);
        llnode node3 = new llnode(7);

        // connection
        list1.next = node1;
        node1.next = node2;
        node2.next = node3;

        llnode list2 = new llnode(1);
        llnode node4 = new llnode(2);
        llnode node5 = new llnode(3);

        list2.next = node4;
        node4.next = node5;
        node5.next = node2;
        // creat obj for tow list
        llnode intersectionNode = IntersectionLL(list1, list2);
        if (intersectionNode != null) {
            System.out.println("Intersection at: " + intersectionNode.data);
        } else {
            System.out.println("No intersection found.");
        }


        llnode list3 = new llnode(1);
        llnode node6 = new llnode(2);
        llnode node7 = new llnode(3);
        llnode node8 = new llnode(4);
        llnode node9 = new llnode(5);
        llnode node10 = new llnode(6);
        llnode node11 = new llnode(7);
        llnode node12 = new llnode(8);
        llnode node13 = new llnode(9);
        llnode node14= new llnode(10);

        list3.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;

        System.out.println("Original list:");
        print(list3);

        removing(list3, 2, 2);

        System.out.println("Modified list:");
        print(list3);
   }
}
