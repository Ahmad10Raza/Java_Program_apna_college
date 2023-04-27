import java.util.*;
public class Binary_Tree_01 {
static class Node{
    int data ;
 Node right;
Node left;

Node(int data)
{
    this.data=data;
    this.left=left;
    this.right=right;
}
}
static class Binary_Tree{
    static int idx=-1;
  public static Node BuildTree(int node[]){
    idx++;
    if(node[idx]==-1)
    {
        return null;
    }
    Node newNode=new Node(node[idx]);
    newNode.left=BuildTree(node);
    newNode.right=BuildTree(node);
    return newNode;
  }  
  public static void preorder(Node root){
    if(root==null){
      return;
    }
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
  }

}
public static void main(String[] args) {
    int node[]={1,2,4,-1,5,-1,-1,3,-1,6,-1,-1};
Binary_Tree tree=new Binary_Tree();
Node root=tree.BuildTree(node);
//System.out.println(root.data);
tree.preorder(root);
}

}
