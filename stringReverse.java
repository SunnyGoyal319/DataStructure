import java.util.*;
class stringReverse
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        for(int i=0;i<t;i++)
        {
            String a=obj.next();
            String a1[]=a.split("\\.");
            String n1="";
            for(int j=a1.length-1;j>0;j--)
            {
                n1+=a1[j]+".";
            }
            n1+=a1[0];
            System.out.println(n1);
        }
    }
}