import java.util.*;
import java.lang.*;
class Parent
{
    Parent()
    {
     System.out.println("Parent constructor called!");   
    }
    Parent(int a)
    {
      this();
    }
}
class  DefaultCons
{
    public static void main(String [] aa)
    {
       Parent pp=new Parent(10);
    }
}