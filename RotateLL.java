import java.util.Scanner;
public class RotateLL 
{
    static Node head;
    static class Node
    {
    	int data;
    	Node next;
    	Node(int d)
    	{
    		data=d;
    		next=null;
    	}
    }
    
    public static RotateLL insert(RotateLL l,int data)
    {
    	Node newNode = new Node(data);
    	newNode.next=null;
    	if(l.head==null)
    	{
    		l.head=newNode;
    	}
    	else
    	{
    		Node last =l.head;
    		while(last.next!=null)
    		{
    			last=last.next;
    		}
    		last.next=newNode;
    	}
    	return l;
    }
    
    public static void rotate(RotateLL l,int k)
    {
        Node curr=l.head;
        Node temp=l.head;
        int count=1;
        while(count<k-1)
        {
            temp=temp.next;
            count++;
        }
        Node kthNode=temp.next;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=l.head;
        head=kthNode;
        temp.next=null;
    }
    
    public static void display(RotateLL l)
    {
    	Node first=l.head;
    	while(first.next!=null)
    	{
    		System.out.print(first.data+" ");
    		first=first.next;
    	}
    	System.out.print(first.data);
    }
    
	public static void main(String[] args) 
	{
		RotateLL l=new RotateLL();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=in.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			int num=in.nextInt();
			l=insert(l,num);
		}
		System.out.println("Enter rotation number");
		int k=in.nextInt();
	    rotate(l,k);
        display(l);
	}

}
