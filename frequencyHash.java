import java.util.*;
public class frequencyHash {

    public static void main(String[] args) 
    {
        Scanner in  = new Scanner(System.in);
        
        int n = in.nextInt();

        int arr[]= new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i]=in.nextInt();
        }

        int hash[] = new int[10000];

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(hash[arr[i]]>=1)
            {
                System.out.println(arr[i]+"-->"+hash[arr[i]]);
                hash[arr[i]] = -1;
            }
        }
    }
}