// import java.util.*;
public class Linked_List_02
{
  public static class Node {
    int Data;
    Node next;
    public Node(int Data){
      this.Data=Data;
      this.next=null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;
  public void addFirst(int Data)
  {
    //step-1 create new Node
    Node newNode=new Node(Data);
    size++;
if(head==null)
{
  head=tail=newNode;
  return;
}
    //step-2 newNod next=head
    newNode.next=head;//linked
    //head ==new node ban gya
    head=newNode;
  }
  public void addLast(int Data)
  {
    Node newNode=new Node(Data);
    size++;
    if(head==null)
    {
      head=tail=newNode;
      return;
    }
    tail.next=newNode;
    tail=newNode;
  }
  public void addMiddle(int idx,int Data)
  {
    if(idx==0)
    {
      addFirst(Data);
      return;
    }
    Node newNode=new Node(Data);
    size++;
    Node temp=head;
    int i=0;
    while(i<idx-1)
    {
      temp=temp.next;
      i++;
    }
    //temp>prev
    newNode.next=temp.next;
    temp.next=newNode;
  }
  public int removeFirst()
  {
    if(size==0)
    {
      System.out.print("LinkedList is empty.");
      return Integer.MIN_VALUE;
    }
    else if(size==1)
    {
      int val=head.Data;
      head=tail=null;
      return val;
    //  size=0;
    }
    int val=head.Data;
    head=head.next;
    size--;
    return val;
  }
  public  int removeLast()
  {
    if(size==0)
    {
      System.out.print("LinkedList is empty.");
      return Integer.MIN_VALUE ;
    }
    else if(size==1)
    {
      int val=head.Data;
      head=tail=null;
      size=0;
      return val;
    }
    Node prev=head;
    for(int i=0;i<size-2;i++)
    {
      prev=prev.next;
    }
    int val=prev.next.Data;
    prev.next=null;
    tail=prev;
    size--;
    return val;
  }
  public void print()
  {
    if(head==null)
    {
      System.out.print("LinkedList is empty.");
      return;
    }

  Node  temp=head;
    while(temp!=null)
    {
      System.out.print(temp.Data+"=>");
      temp=temp.next;
    }
    System.out.println();
  }
  public int Iterative_Search(int key)
  {
    Node temp=head;
    int i=0;
    while(temp!=null)
    {
      if(temp.Data==key)
      {
        return i;
      }
      temp=temp.next;
      i++;
    }
    return -1;
  }

public int helper(Node head,int key)
{
  if(head==null)
{
  return -1;
}
if(head.Data==key)
{
  return  0;
}
int idx=helper(head.next,key);
if(idx==-1)
{
  return -1;
}
return idx+1;
}
public int Recursive_Search(int key )
{
  return helper(head,key);
}
public void Reverse()
{
  Node prev=null;
  Node curr=tail=head;
  Node next;
  while(curr!=null)
  {
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
  }
  head=prev;
}
public void delete(int n)
{
  //calculate size
  int sz=0;
  Node temp=head;
  while(temp!=null)
  {
    temp=temp.next;
    sz++;
  }
  if(n==sz)
  {
    head=head.next; //remove first
    return ;
  }
  int i=1;
  int toFind=sz-n;
  Node prev=head;
  while (i<toFind) {
    prev=prev.next;
    i++;
  }
  prev.next=prev.next.next;
  return;
}




public Node FindMid(Node head)
{
  Node slow=head;
  Node fast=head;
  while(fast!=null && fast.next!=null)
  {
    slow=slow.next;//+1
    fast=fast.next.next;//+2
  }
return slow;//that is middle.
  }

  public boolean Chec_Palidrome()
  {
//base case
if(head==null  || head.next==null)
{
return true;
}
//step-1 find middle
Node midNode= FindMid(head);
//setp-2 Reverse 2nd half
Node prev=null;
Node curr=midNode;
Node next;
while(curr!=null)
{
next=curr.next;
curr.next=prev;
prev=curr;
curr=next;
}
Node right=prev;
Node left=head;
//setp-3 check left half and right half
while (right!=null)
{
if(left.Data!=right.Data)
{
return false;
}
left=left.next;
right=right.next;
  }
  return true;
}

public static boolean isCycle()
{
  Node slow=head;
  Node fast=head;
  while(fast != null && fast.next!=null)
  {
    slow=slow.next;//+1
    fast=fast.next.next;//+2
    if(slow==fast)
    {
      return true;
    }
  }
  return false;
}
public static void RemoveCycle()
{
  Node slow=head;
  Node fast=head;
boolean cycle=false;
  //Finding isCycle
  while(fast !=null && fast.next!=null)
  {
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast)
    {
      cycle=true;
      break;
    }
  }
  if(cycle==false)
  {
  return;
}
//Finding meeting point
slow=head;
Node prev=null;
while(slow!=fast)
{
  prev=fast;
  slow=slow.next;
  fast=fast.next;
}
//removing cycle
prev.next=null;
}


  public static void main(String[] args) {
    Linked_List_02 ll=new Linked_List_02();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.print();
    ll.addLast(8);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.addFirst(1);
    ll.addLast(6);
    ll.addLast(7);
    ll.addMiddle(2,9);
    ll.addMiddle(5,10);
    ll.print();
    ll.removeFirst();
    ll.removeLast();
    ll.print();
//System.out.println(ll.size);
//System.out.println(ll.Iterative_Search(5));
//System.out.print(ll.Recursive_Search(10));

//ll.Reverse();
//ll.print();
ll.delete(1);//delete from last to first.
ll.print();
//System.out.print(ll.Chec_Palidrome());
System.out.println(isCycle());
RemoveCycle();
System.out.print(isCycle());
}
}
