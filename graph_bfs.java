import java.util.*;

class graph
{
  ArrayList<ArrayList<Integer>> list=new ArrayList<>();
  graph(int v)
  {
    for(int i=0;i<v;i++)
    {
      list.add(new ArrayList<Integer>()); 
    }
  }
  void push(int u, int v)
  {
    list.get(u).add(v);
    list.get(v).add(u);
  }
  void bfs(int v)
  {
    int k=list.size();
    boolean vi[]=new boolean[k];
    Queue<Integer> q=new LinkedList<>();
    q.add(v);
    vi[v]=true;
    System.out.println("BFS: ");
    while(!q.isEmpty())
    {
      int m=q.remove();
      System.out.println(m+" ");
      for(int i=0;i<list.get(m).size();i++)
      {
        int h=list.get(m).get(i);
        if(!vi[h])
        {
          q.add(h);
          vi[h]=true;
          
        }
      }
    }
  }
  void display()
  {
    for(int i=0;i<list.size();i++)
    {
      System.out.println("vertex: "+i);
      for(int j=0;j<list.get(i).size();j++)
      {
        System.out.println(" "+list.get(i).get(j));
      }
    }
  }

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int k=in.nextInt();
      graph g=new graph(k);
      for(int i=0;i<k;i++)
      {
        int u=in.nextInt();
        int v=in.nextInt();
        g.push(u, v);
      }
        g.bfs(0);
      
    }
      
    
}