import java.util.*;
public class RemoveDuplicate
{
	static node head;
	class node
	{
		int data;
		node next;
		node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void insert(int d)
	{
		int flag=0;
		node n1=new node(d);
		if(head==null)
		{
			head=n1;
		}
		else
		{
			node temp1=head;
			while(temp1!=null)
			{
				if(temp1.data==d)
				{
					flag=1;
					break;
				}
				temp1=temp1.next;
			}
			if(flag==0)
			{
				node temp2=head;
				while(temp2.next!=null)
				{
					temp2=temp2.next;
				}
				temp2.next=n1;
			}
		    }
	}
	public void display()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		duplicate obj=new duplicate();
		int size=in.nextInt();
		for(int i=0;i<size;i++)
		{
			int a=in.nextInt();
			obj.insert(a);
		}
		obj.display();
	}
	}