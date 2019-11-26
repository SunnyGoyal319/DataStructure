import java.util.*;
class remAdjDup
{
    public static String remove(String str,char ch)
    {
        if (str.length() == 0 || str.length() == 1) 
            return str; 
  
        if (str.charAt(0) == str.charAt(1)) 
        { 
            ch = str.charAt(0); 
            while (str.length() > 1 && str.charAt(0) == str.charAt(1)) 
                str = str.substring(1, str.length()); 
            str = str.substring(1, str.length()); 
            return remove(str, ch);  
        } 

        String rem = remove(str.substring(1,str.length()), ch); 

        if (rem.length() != 0 && rem.charAt(0) == str.charAt(0)) 
        { 
            ch = str.charAt(0); 
            return rem.substring(1,rem.length()); 
        }  


        if (rem.length() == 0 && ch == str.charAt(0)) 
            return rem; 

        return (str.charAt(0) + rem);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        System.out.println(remove(s1,'\0'));
        in.close();
    }
}