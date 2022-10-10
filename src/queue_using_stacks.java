import java.util.*;

public class queue_using_stacks {
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    static void enqueue(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
        s1.push(s2.pop());
        }
    }
    static int dequeue(){
        if(s1.isEmpty()){
            System.out.println("empty queue");
        }
        int x=s1.peek();
        s1.pop();
        return x;
    }
    public static void main(String[] args) {
        queue_using_stacks q=new queue_using_stacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.print(q.dequeue());
    }
}
