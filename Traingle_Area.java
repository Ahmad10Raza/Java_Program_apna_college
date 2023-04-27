import java.util.*;
class Triangle{
     private int length, width, height;
      //Default Constructor
      Triangle()
      {
         length=3; width=4;  height=5;
       }
      // Parameterized Costructor////
      Triangle(int l, int w, int h)
      {
        length=l; width=w;  height=h;
      }
      int area()
      {
           return length*width*height;
         }
         int perimeter()
         {   return length+width+height;
         }
         /////Setters//////
         Void setlength(int l)
         {   length=l;
         }
         Void setwidth(int w)
         {
             width=w;
             }
             Void setheight(int h)
             {
                  height=h;
                  }
                  //////Getters//////
                  int getlength()
                  {
                     return length;
                    }
int getwidth()
{
   return width;
   }
   int getheight()
   {
      return height;
      }
    }
    public   class labexercise
      {
        public static void main(String[] args)
        {
          Triangle t=new Triangle();
          Triangle t1=new Triangle(5,6,7);
          System.out.println(" Area of Triangle= " +t.area());
          /// 60
          System.out.println("Perimeter of Triangle= " +t.perimeter());
          System.out.println(" Area of Triangle= " +t1.area());
          System.out.println(" Perimeter of Triangle= " +t1.perimeter());t.setlength(12);
          System.out.println(" Area of Triangle= " +t.area());
          ///240
          System.out.println(" Area of Triangle= " +t.area()+ " And its width is "+t.getwidth());
        }
      }
