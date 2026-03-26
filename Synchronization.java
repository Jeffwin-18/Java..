class data {
    synchronized void multiple(int n){
        for(int i=1;i<=5;i++)
        {
            System.out.println(i*n);
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){};
        }
    }
}
public class Main{
    public static void main(String args[]) throws InterruptedException
    {
        data d1=new data();
        Thread t1=new Thread(){
        public void run(){
         d1.multiple(5);
       }
        };
        
        
        Thread t2=new Thread(){
        public void run(){
            d1.multiple(7);
        }
        };
        t1.start();
        t2.start();
    }
}