import java.util.*;
public class Chain_Of_Pair_Max {
 public static void main(String[] args) {
    int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
    Arrays.sort(pair,Comparator.comparingDouble(o -> o[1]));
int chainline =1;
int chainEnd=pair[0][1];//last selected pair
for(int i=0;i<pair.length;i++)
{
    if(pair[i][0]>chainEnd)
    {
        chainline++;
        chainEnd=pair[i][1];
    }
}
System.out.println("Maximum chain Line is = "+chainline );

}   
}
