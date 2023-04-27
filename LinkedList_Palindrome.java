import java.util.*;
public class LinkedList_03
{
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
Node rigth=prev;
Node left=head;
//setp-3 check left half and right half
while (right!=null)
{
if(left.data!=ritgh.data)
{
  return false;
}
left=left.next;
right=rigth.next;
    }
    return true;
  }

  public static void main(String[] args) {
LinkedList_03 ll=new LinkedList_03();
ll.add(1);
ll.add(2);
ll.add(1);

  }
}
