import java.util.*;
class tree
{
  Node create(int val)
  {
    return new Node(val);
  }
  Node insert(Node root, int val)
  {
    if(root==null)
    {
      return create(val);
    }
    if(val<root.data)
    {
      root.left=insert(root.left,val);
    }
    else
    {
      root.right=insert(root.right,val);
    }
    return root;
  }
  public void inorder(Node root)
  {
    if(root!=null)
    {
      inorder(root.left);
      System.out.print(root.data+" ");
      inorder(root.right);
    }
  }
  public void preorder(Node root)
  {
    if(root!=null)
    {
      System.out.print(root.data+" ");
      preorder(root.left);
      preorder(root.right);
    }
  }
  public void postorder(Node root)
  {
    if(root!=null)
    {
      postorder(root.left);
      postorder(root.right);
      System.out.print(root.data+" ");
    }
  }
  public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    tree t1=new tree();
    int k=in.nextInt();
    
    Node root=t1.create(k);
    while(true)
    {
      int data=in.nextInt();
      if(data==-1)
      {
        break;
      }
    
      t1.insert(root,data);
      
    }
    t1.inorder(root);
    System.out.println();
    t1.preorder(root);
    System.out.println();
    t1.postorder(root);
  }
}
class Node
{
  int data;
  Node left;
  Node right;
  public Node(int val)
  {
    data=val;
    left=null;
    right=null;
  }
}
