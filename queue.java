import java.util.*;
public class queue
{
  int arr[];
  int rear;
  int front;
  int size;
   queue()
   {
     size=5;
     arr=new int[size];
     front=1;
     rear=-1;
   }
   void enqueue(int val)
   {
     if(rear>size-1)
     {
       System.out.println("Queue is Full");
     }
     if(front==-1)
     {
       front =0;
       
     }
     arr[++rear]=val;
   }
   int dequeue()
   {
     if(front ==-1)
     {
       System.out.println("Queue is Empty ");
       
     }
     int y=arr[front];
     front++;
     return y;
   }
   void display()
   {
     for(int i=front;i<=rear;i++)
     System.out.print(arr[i]+" ");
   }
   public static void main (String[] args) {
    queue q= new queue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.display();
    System.out.println();

    q.dequeue();
    q.display();
   }
}