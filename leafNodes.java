import java.util.*;
class leafNodes
{
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    } 
    public static void leaf(Node root)
    {
        if(root!=null)
        {
            if(root.left==null && root.right==null)
            {
                System.out.println(root.data);
            }
            else{
                leaf(root.left);
                leaf(root.right);
            }
        }
    }
    public static void main(String[] args) {
        leafNodes t1=new leafNodes();
        t1.root=new Node(1);
        t1.root.left=new Node(2);
        t1.root.right=new Node(3);
        t1.root.left.left=new Node(4);
        t1.root.left.right=new Node(5);
        t1.root.right.left=new Node(6);
        t1.root.right.right=new Node(7);
        t1.root.left.left.right=new Node(8);
        leaf(root);

    }
}