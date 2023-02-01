class Keystat {

    int id;
    String name;
    static String college = "nammait";

    void dis() {
        System.out.println(id + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Keystat k1 = new Keystat();
        System.out.println(k1.id = 101);
        System.out.println(k1.name = "syd");
        System.out.println(k1.college);

    }
}
