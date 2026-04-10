import java.util.*;
class main
{
  public static int precedence(char choice)
  {
    switch(choice)
    {
      case '+':
      case '-':
        return 1;
      
      case '*':
      case '/':
        return 2;
        
      case '^':
        return 3;
        
      //default:
      //return -1;
    }
    return -1;
  }
  public static Boolean check(char op1, char op2)
  {
    return precedence(op1)>=precedence(op2);
  }
  public static String exp(String s)
  {
    StringBuilder pf=new StringBuilder();
    Stack<Character> st=new Stack<>();
    for(int i=0;i<s.length();i++)
    {
      char ch=s.charAt(i);
      if(Character.isLetterOrDigit(ch))
      {
        pf.append(ch);
      }
      else if(ch=='(')
      {
        st.push(ch);
      }
      else if(ch==')')
      {
        while(!st.isEmpty() && st.peek()!='(')
        {
          pf.append(st.pop());
        }
        st.pop();
      }
      else{
        while(!st.isEmpty() && st.peek()!='(' && check(st.peek(),ch))
        {
          pf.append(st.pop());
        }
        st.push(ch);
      }
    }
    while(!st.isEmpty())
    {
      pf.append(st.pop());
    }
    return pf.toString();
  }
  public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    String s= in.next();
    String rev="";
    String rev1="";
    for (int i=s.length()-1;i>=0;i--)
    {
      rev+=s.charAt(i);
    }

    String res=exp(rev);
    //System.out.println(res);
    for (int i=res.length()-1;i>=0;i--)
    {
      rev1+=res.charAt(i);
    }
        System.out.print(rev1);
  }
  
}