import java.util.*;
class treePalindrome
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
    public static boolean checkPalindrome(Node root,Node root1)
    {
        if(root == null && root1 == null)
        {
            return true;
        }

        if(root !=null && root1!=null && root.data == root1.data)
            return (checkPalindrome(root.left, root1.right) && checkPalindrome(root.right, root1.left));
        return false;
    }

    public static boolean isSymmetric(Node root)
    {
        return checkPalindrome(root,root);
    }
    public static void main(String[] args) {
        treePalindrome t1=new treePalindrome();
        t1.root=new Node(1);
        t1.root.left=new Node(2);
        t1.root.right=new Node(2);
        t1.root.left.left=new Node(3);
        t1.root.left.right=new Node(3);
        t1.root.right.left=new Node(3);
        t1.root.right.right=new Node(3);
        System.out.println(isSymmetric(root));
    }
}