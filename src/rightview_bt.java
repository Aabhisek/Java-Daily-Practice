import java.util.*;

class Node2{
    int data;
    Node2 left,right;
     Node2(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class rightview_bt {

    Node2 head;
    static int maxi_level=0;
    static void rightview(Node2 head,int level){
        Node2 root=head;
        if(root==null){
            return;
        }
        if(maxi_level<level){
            System.out.print(root.data);
            maxi_level=level;
        }
        rightview(root.right,level+1);
        rightview(root.left,level+1);
    }

    public static void main(String[] args) {
        rightview_bt tree=new rightview_bt();
        tree.head=new Node2(1);
        tree.head.left=new Node2(2);
        tree.head.right=new Node2(3);
        tree.head.left.left=new Node2(4);
        tree.head.left.right=new Node2(5);
        rightview(tree.head,1);


    }
}
