import java.util.*;

class Node1{
    int data;
    Node1 left,right;
    public Node1(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class leftview_bt {

    Node1 head;

    static int max_level=0;
    static void leftview(Node1 head,int level){
        Node1 root=head;
        if(root==null){
            return;
        }
        if(max_level<level){
            System.out.print(root.data);
            max_level=level;
        }
        leftview(root.left,level+1);
        leftview(root.right,level+1);
    }


    public static void main(String[] args) {
        leftview_bt tree=new leftview_bt();
        tree.head=new Node1(1);
        tree.head.left=new Node1(2);
        tree.head.right=new Node1(3);
        tree.head.left.left=new Node1(4);
        tree.head.left.right=new Node1(5);
        leftview(tree.head,1);



    }
}
