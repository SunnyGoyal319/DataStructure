import java.util.Scanner;

public class rotateDLL {
static Node head;
static class Node
{
    int data;
    Node next,prev;
    Node(int d)
    {
        this.data=d;
        next=prev=null;
    }
}   
public static rotateDLL insert(rotateDLL li,int data)
{
    Node newNode=new Node(data);
    newNode.next=null;
    if(li.head==null)
    {
        li.head=newNode;
    newNode.next=null;
    newNode.prev=null;
    }
    else
    {
        Node temp=li.head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        newNode.next=null;  
    }
    return li;
}
public static void display(rotateDLL li)
{
    if(li.head!=null)
    {
        Node current=li.head;
        while( current.next!=null)
        {
            current=current.next;
        }
        while(current.prev!=null)
        {
            System.out.println(current.data+" ");
            current=current.prev;
        }
        System.out.println(current.data);
    }
}
public static void main(String[] args) {
    rotateDLL li=new rotateDLL();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        int x=sc.nextInt();
        li.insert(li,x);
    }
    li.display(li);
    }
}

