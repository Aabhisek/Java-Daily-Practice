class Node3{
    int data;
    Node3 left,right;
    public Node3(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class levelOrderTraversal_bt {
    public static void main(String[] args) {
        levelOrderTraversal_bt tree=new levelOrderTraversal_bt();
        tree.head=new Node3(1);
        tree.head.left=new Node3(2);
        tree.head.right=new Node3(3);
        tree.head.left.left=new Node3(4);
        tree.head.left.right=new Node3(5);
    }
    Node3 head;
    static  void printCurrentLevel(Node3 head,int level){

    }
}
