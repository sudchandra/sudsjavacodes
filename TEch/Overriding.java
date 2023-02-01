public class Alpha {

    void run();

    {
        System.out.println("animal is running");
    }
}

class Beta extends Alpha {
    void run();

    {
        System.out.println("sud is eating ");
    }
}

class Overriding {
    public static void main(String args[]) {
        Overriding ob = new Overriding();
        ob.run();
    }
}
