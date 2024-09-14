import java.util.Stack;
public class pushElimentBotum { //AMAZON
    public static void pussAtbotum(Stack<Integer> s, int data ){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pussAtbotum(s, data);
        s.push(top);
    }
    public static void reversStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reversStack(s);
        pussAtbotum(s, top);
    }
    public static void main(String args[]){
        //creat stack
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3 - 2- 1
        pussAtbotum(s,4); //3 - 2- 1-4
        reversStack(s); //4-1-2-3
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
