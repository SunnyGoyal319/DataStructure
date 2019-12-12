import java.util.*;

/**
 * makeLargest
 */
public class makeLargest 
{

    public static String formLargest(List<String> list)
    {
        Collections.sort(list,new Comparator<String>() 
        {
            public int compare(String a,String b )
            {
                String ab = a+b;
                String ba = b+a;

                return (ab.compareTo(ba) > 0) ? -1 : 1;
            }
        });
        String num="";

        for (int i = 0; i < list.size(); i++) 
        {
            num +=list.get(i);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < n; i++) 
        {
            list.add(Integer.toString(in.nextInt()));
        }

        System.out.println(formLargest(list));
        
        in.close();
    }
}