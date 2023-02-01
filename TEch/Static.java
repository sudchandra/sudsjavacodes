public class Static {
    
}
class Static
{
    int rollno;
    String name;
    Static  String college="nmammait";
    Static(int rn,String na)
    {
        rollno=rn;
        name=na;

    }
    void dis()
    {
System.out.println(rollno+" "+name+" "+college)
    }
    public static void main(String args[])
    {
        Static s=new Static(100,"sud");
        s.dis();
    }
}