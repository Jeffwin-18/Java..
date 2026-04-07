import java.util.*;
public class Main
{
    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n* fact(n-1);
       
                

    }
    public static void main(String args[])
    {
        int n=3;
        int r=fact(n);
        System.out.print(r);
    }
}

