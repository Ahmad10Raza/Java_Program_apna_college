import java.util.*;
public class Stack_Using_ArrayList
{
    static class Satck
    {
        static ArrayList <Integer> list=new ArrayList<>();
        public static boolean isEmpty()
        {
            return list.size()==0;
        }
        //push
        public static void push(int data)
        {
            list.add(data);
        }
        public static int pop()
        {
            int pop=list.get(list.size()-1);
            list.remove(list.size()-1);
            return pop;
        }
        //peek
        public static int peek()
        {
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack<>();
        s.push(1);
        s.push(2);
    s.push(3);
    while(!s.isEmpty())
    {
        System.out.println(s.peek());
        s.pop();
    }
    }
}