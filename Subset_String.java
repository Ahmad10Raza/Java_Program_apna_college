// import java.util.*;
public class Subset_String {
public static void FindSubset(String str,String ans,int i)
{
    if(i==str.length())
    {//base case
        System.out.println(ans);
        return;
    }
    //recursion
    //yes choice by chracater
    FindSubset(str, ans+str.charAt(i),i+1);
    //no choice by characterB
    FindSubset(str, ans, i);
}

    public static void main(String[] args) {
        String str="abc";
        FindSubset(str,"",0);
    }
}
