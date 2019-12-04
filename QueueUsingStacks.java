import java.util.*;
class QueueUsingStacks
{
   private static Stack<Integer> s1;
   private static Stack<Integer> s2;;
    QueueUsingStacks()
    {
         s1=new Stack<>();
         s2=new Stack<>();
    }
    public static void enqueue(QueueUsingStacks q1,int value)
    {
        s1.push(value);
    }
    public static int dequeue(QueueUsingStacks q)
    {
        if(s1.isEmpty() && s2.isEmpty())
        {
            System.out.print("No Queue");
            System.exit(0);
        }
        else if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public static void main(String[] args) {
        QueueUsingStacks q=new QueueUsingStacks();
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        for(int i=0;i<size;i++){
            enqueue(q,obj.nextInt());
        }
        System.out.println(s1);
        System.out.println(dequeue(q));
        System.out.println(s2);
    }
}