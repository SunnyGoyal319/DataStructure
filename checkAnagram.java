import java.util.*;
public class checkAnagram
{
	static boolean checkAnagram(String s,String s1)
	{
		int i;
		int hash[]=new int[256];
		int hash1[]=new int[256];
		if(s.length()==s1.length())
		{
			for(i=0;i<s.length();i++)
			{
				hash[s.charAt(i)]++;
			}
			for(i=0;i<s1.length();i++)
			{
				hash1[s1.charAt(i)]++;
			}
			for(i=0;i<256;i++)
			{
				if(hash[i]!=hash1[i])
				{
					break;
				}
			}
			if(i!=256)
			{
				return false;
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		if(checkAnagram(s,s1))
		{
			System.out.println("Anagram");
		}

		else
		{
			System.out.println("Not Anagram");
		}
	}
}
