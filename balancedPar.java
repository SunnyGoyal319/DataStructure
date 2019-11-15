import java.util.*;
class balancedPar
{
  static int balancedString(String str)
  {
    int flag=0;
	Stack<Character> stack=new Stack<Character>();
    int i=0;
	for (i = 0; i < str.length(); i++) 
	{
		char ch = str.charAt(i);
		if (ch == '[' || ch == '(' || ch == '{') 
		{
			stack.push(ch);
		} 
		else if (ch == ']' || ch == '}' || ch == ')') 
		{
           if((!stack.isEmpty()))
           {
                if (((char) stack.peek() == '(' && ch == ')')|| ((char) stack.peek() == '{' && ch == '}')|| ((char) stack.peek() == '[' && ch == ']')) 
				{
					stack.pop();
				} 
				else 
				{
                    flag=1;
					break;
				}
           }
            else
            {
                flag=1;
                break;
            }
		}
		else 
		{
			if ((ch == ']' || ch == '}' || ch == ')')) 
			{
              	flag=1;
				break;
			}
		}
	}
	if (stack.isEmpty() && flag==0)
	{
        return -1;
    }
    else
    {
		return i; //returns index where imbalance occurs
    }
   }
   public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       String str=obj.next();
       int check=balancedString(str);
       if(check==-1)
       {
           System.out.println("Balanced");
       }
       else
       {
           System.out.println("Unbalanced at index :" check);
       }
   }
}
