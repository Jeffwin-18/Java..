import java.util.*;
public class stack
{
  final int max=5;
  int top=-1;
  int arr[]=new int[max];
  
  public void push(int val)
  {
    if(top>=max)
    {
      System.out.println("Stack Overflow");
    }
    arr[++top]=val;
  }
  void pop()
  {
    if(top==-1)
    {
      System.out.println("Stack Underflow");
    }
    else
    {
      //System.out.println(arr[top]);
      top--;
    }
  }
  void peek()
  {
    if(top==-1)
    {
      System.out.println("Stack Underflow");
    }
    else
    System.out.println(top);
  }
  void display()
  {
    for (int i=0;i<=top;i++)
    {
      System.out.println(arr[i]);
    }
  }
  public static void main(String args[])
  {
    stack st=new stack();
    Scanner in=new Scanner(System.in);
    st.push(10);
    st.push(20);
    st.pop();
    st.push(30);
    st.push(50);
       st.pop();    
    st.peek();
    st.display();
    
  }
}
