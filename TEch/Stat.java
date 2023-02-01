public class Static {

}

class Stat {
    int rollno;
    String name;
    static String college = "nmamait";

    Stat(int rn, String na) {
        rollno = rn;
        name = na;

    }

    void dis() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Stat s = new Stat(100, "sud");
        s.dis();
    }
}