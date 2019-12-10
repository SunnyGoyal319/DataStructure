import java.util.*;
public class insertAtMid
{
    static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static insertAtMid insert(insertAtMid li,int data)
	{
		Node n1 =new Node(data);
		n1.next=null;
		if(li.head==null)
		{
			li.head=n1;
		}
		else// appending data at end
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=n1;
		}
		return li;
    }
    public static insertAtMid mid(insertAtMid li,int data)
    {
        Node fast=li.head;
        Node slow=li.head;
        Node n1=new Node(data);
        if(li.head!=null)
        {
            while(fast.next!=null && fast.next.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
            }
            Node temp=slow.next;
            slow.next=n1;
            n1.next=temp;
        }
        return li;
    }
    public static void display(insertAtMid l1)
	{
		Node currNode=l1.head;
		while(currNode.next!=null)
		{
			System.out.println(currNode.data);
			currNode=currNode.next;
		}
		System.out.println(currNode.data);
    }
    public static void main(String[] args) {
        insertAtMid obj=new insertAtMid();
        obj=obj.insert(obj,1);
        obj=obj.insert(obj,2);
        obj=obj.insert(obj,3);
        obj=obj.insert(obj,5);
        obj=obj.insert(obj,6);
        obj=obj.insert(obj,7);
        obj.display(obj);
        obj=obj.mid(obj, 4);
        obj.display(obj);
    }
}