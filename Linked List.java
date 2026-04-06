import java.util.*;

class node {
	int data;
	node next;
	public node (int val)
	{
		data=val;
		next=null;
	}
}
public class Main
{
	node head;
	node temp;
	public void inbeg(int v)
	{
		node newnode=new node(v);
		if(head==null)
		{
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	public void inend(int v)
	{
		node newnode=new node(v);
		if(head==null)
		{
			head=newnode;
			return;
		}
		temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;
	}
	public void inpos(int val,int p)
	{
		node newnode=new node(val);
		if(p==0)
		{
			inbeg(val);
			return;
		}
		node temp=head;
		int c=0;
		while(temp.next!=null && c<p-1)
		{
			temp=temp.next;
			c++;
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}
	public void delpos(int p)
	{
	    if(p==0)
	    {
	        head=head.next;
	    }
	    node temp=head;
	    int c=0;
	    while(temp.next!=null && c<p-1)
	    {
	        temp=temp.next;
			c++;
	    }
	    temp.next=temp.next.next;
	}
	public void mid()
	{
	    int count=0;
	    int c=0;
	    node temp=head;
	    while(temp!=null)
	    {
	        count++;
	        temp=temp.next;
	    }
	    temp=head;
	    int m=count/2;
	    while(temp.next!=null && c<m)
	    {
	        temp=temp.next;
	        c++;
	    }
	    System.out.println(temp.data);
	}
	public void rev()
	{
	    node temp=head;
	    node prev=null;
	    node next=null;
	    while(temp!=null)
	    {
	        next=temp.next;
	        temp.next=prev;
	        prev=temp;
	        temp=next;
	    }
	    head=prev;
	}
	public void display()
	{
		node temp;
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Main obj=new Main();
		obj.inbeg(10);
		obj.inbeg(20);
		obj.inbeg(30);
		obj.inend(70);
		obj.display();
		obj.inpos(50,2);
		obj.display();
		obj.mid();
		//obj.delpos(3);
		//obj.display();
		//System.out.print("NULL");
        obj.rev();
        obj.display();
	}
}
