import java.util.Scanner;
class AdjDuplicates
{
static String a=" ";
public static void fun(char [] s, int i)
 {
    if(i==0 && s[i]!=s[i+1])
        a+=s[i];
    else if(i==s.length-1)
    {
        if(s[i]!=s[i-1]) a+=s[i];
        return;
    }
    else if(s[i]!=s[i-1] && s[i]!=s[i+1])
        a+=s[i];
    fun(s,i+1);
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str;
    str=sc.next();
    fun(str.toCharArray(),0);
    System.out.println(a);
    }
}