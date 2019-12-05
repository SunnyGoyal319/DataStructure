import java.util.*;
class Node {
    int data;
    Node next;
    Node() {}
    Node(int d) {
        data = d;
    }
}
class LinkedList 
{
    Node insertEnd(Node head, int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return head;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
        return head;
    }
    int formNumber(Node head) {
        int i = 1;
        int num = 0;
        while (head != null) {
            num = num + (head.data) * i;
            i *= 10;
            head = head.next;
        }
        return num;
    }
    Node addListNumbers(Node head1, Node head2) {
        int x = formNumber(head1);
        int y = formNumber(head2);
        int z = (x + y);
        Node head = null;
        while (z > 0) {
            head = insertEnd(head, z % 10);
            z /= 10;
        }
        return head;
    }

    void printList(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}

/**
 * AddNoAsList
 */

public class AddNoAsList {


    public static void main(String[] args) 
    {
        Node head = null,head1 = null;
        LinkedList ll = new LinkedList();

        Scanner in = new Scanner(System.in);

        int z = in.nextInt();

        while (z > 0) {
            head = ll.insertEnd(head, z % 10);
            z /= 10;
        }        
        z = in.nextInt();
        while (z > 0) {
            head1 = ll.insertEnd(head1, z % 10);
            z /= 10;
        }

        Node list = ll.addListNumbers(head, head1);

        ll.printList(list);
    }
}