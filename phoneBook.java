import java.util.*;
class phoneBook{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        HashMap<Integer,String> hm1=new HashMap<Integer,String>();
        int size=in.nextInt();
        for(int i=0;i<size;i++)
        {
            String name1=in.next();
            int key=in.nextInt();
            hm1.put(key,name1);
        }
        String name=in.next();
        System.out.println(hm1.containsValue(name));
        for(int j:hm1.keySet())
        {
            if(hm1.get(j).equals(name))
            {
                System.out.println(name+":"+j);
            }
        }
    }
}