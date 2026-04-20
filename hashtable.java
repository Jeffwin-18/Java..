import java.util.*;
 class hashtable
{
  private int n;
  private List<List<Integer>> table;
  
  hashtable(int n)
  {
    this.n=n;
    this.table=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      table.add(new ArrayList<Integer>());
    }
  }
  public int create(int data)
  {
    return data%n;
  }
  public void insert(int data)
  {
    int loc=create(data);
    table.get(loc).add(data);
  }
  public void display()
  {
    for(int i=0;i<table.size();i++)
    {
      System.out.println("Index : "+i+" : "+table.get(i));
    }
  }
  public static void main(String args[])
  {
    int [] list={12,2,4,32,66};
    hashtable h=new hashtable(7);
    for(int i:list)
    {
      h.insert(i);
    }
      h.display();
    
  }
}
