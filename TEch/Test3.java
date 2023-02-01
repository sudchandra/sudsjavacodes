 class Animal
{
    String color;
    void run()
    {
        System.out.println("animal running");
    }

}
 class Lion extends Animal
{
    void run()
    {
        System.out.println("lion is roaring");
    }
}
 public class Test3
{
    public static void main(String args[])
    {
        Lion l=new Lion();
        l.run();

    }
}