import java.util.*;
class Test
{
    int add(int a,int b)
    {
int sum=a+b;
return sum;
    }
    int  add(int a,int b,int c)
    {
        int sum=a+b+c;
        return sum;

    }
}
class Overload1
{
    public static void main(String args[])
    {
        Test t1=new Test();
        t1.add(10,20);
        t1.add(20,90,90);
    }
}

    
