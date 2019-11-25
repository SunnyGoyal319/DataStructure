// JavaProgram to convert prefix to postfix 
import java.util.*;

class prefixToPostfix{

    static boolean isOperator(char x) {
             if(x == '+' || x == '-' ||  x ==  '/'|| x == '*' || x == '^')
                return true;
        return false;
    }
 
    static String preToPost(String pre) {

        Stack <String> s = new Stack<String>();

        int length = pre.length();

        for (int i = length - 1; i >= 0; i--) {

            if (isOperator(pre.charAt(i))) {

                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();

                String temp = op1 + op2 + pre.charAt(i);

                s.push(temp);
            }

            else {
                s.push(pre.charAt(i) + "");
            }
        }

        return s.peek();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String pre = in.nextLine();
        System.out.println(preToPost(pre));
        in.close();
    }
}