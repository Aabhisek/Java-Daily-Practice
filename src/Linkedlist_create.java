import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Linkedlist_create {

    Node head ;
    static void printll(Node head){
        Node start=head;
        while(start!=null){
            System.out.print(start.data);

            start=start.next;
        }
        }
    static Node reverse(Node head){
        Node prev=null;
        Node next=null;
        Node current=head;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        return prev;
    }
    static void insert_at_front(Node head,int data){
        Node node=head;
         Node new_node=new Node(data);
         new_node.next=node;
         node=new_node;
    }
    //insert a node after given node
    static void insertAfter(Node node,int data){
        if(node==null){
            System.out.println("previous node cant be null");
            return;
        }
        Node new_node=new Node(data);
        new_node.next=node.next;
        node.next=new_node;
    }
    public static void main(String[] args) {
        Linkedlist_create ll=new Linkedlist_create();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(3);
        printll(ll.head);
        System.out.println();
        insertAfter(ll.head.next,6);
        printll(ll.head);
        System.out.println();
        insert_at_front(ll.head,8);
        printll(ll.head);
        //System.out.println();
       // Node ans=reverse(ll.head);
       // printll(ans);


    }
}
