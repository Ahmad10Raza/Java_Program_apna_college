import java.util.*;
public class Container_With_Most_Water
{
  public static int Container_With_Most_Water(ArrayList<Integer> height)
  {// time complexity O(n^2)
    int masWater=0;
    //brute force
    for(int i=0;i<height.size();i++)
    {
        for(int j=0;j<height.size();j++)
        {
          int ht=Math.min(height.get(i),height.get(j));
          int width=j-i;
          int currentWater=ht*width;
          masWater=Math.max(masWater,currentWater);
        }
    }
    return masWater;
  }
  public static int Two_Pointer(ArrayList<Integer> height)
  {//time complexity O(n)
    int lp=0;
    int rp=height.size()-1;
    int maxWater=0;
    while(lp<rp)
    {//case 1
      int ht=Math.min(height.get(lp),height.get(rp));
      int width=rp-lp;
      int currentWater=ht*width;
      maxWater=Math.max(maxWater,currentWater);
if(height.get(lp)<height.get(rp))
{
  lp++;
}
else
{
  rp--;
}
    }
    return maxWater;
  }
  public static void main(String[] args) {
ArrayList<Integer> height=new ArrayList<>();
height.add(1);
height.add(8);
height.add(6);
height.add(2);
height.add(5);
height.add(4);
height.add(8);
height.add(3);
height.add(7);
System.out.println("The Maximum store Water: "+Container_With_Most_Water(height));
System.out.println(" store Water By 2 pinter: "+Two_Pointer(height));

  }
}
