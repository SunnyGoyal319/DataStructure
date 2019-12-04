import java.util.*;

public class stacksUsingQueue {
	static Queue <Integer>q1=new LinkedList<>();
	static Queue <Integer>q2=new LinkedList<>();
	public static void push(int data) {
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		q1.add(data);
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
	}
	public static void pop() {
		q1.remove();
	}
	public static void peek() {
		System.out.println(q1.element());
		System.out.println(q1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stacksUsingQueue s1=new stacksUsingQueue();
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		for(int i=0;i<size;i++)
		{
			s1.push(obj.nextInt());
		}
		s1.pop();
		System.out.println(q1);
	}

}
