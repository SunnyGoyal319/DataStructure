import java.util.*;
class addWithoutOpr
{
    public static void add(int a,int b)
    {
        while(b!=0)
        {
            int carry=(a&b)<<1 ;
            a=a^b;
            b=carry;
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter numbers to add");
        add(obj.nextInt(),obj.nextInt());
    }
}