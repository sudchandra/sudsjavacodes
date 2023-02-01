class Constructor {
    int id;
    String name;

    Constructor(int id1, String name1) {
        id = id1;
        name = name1;
    }

    void display() {
        System.out.println("id is" + id + " " + "name is" + name);
    }

    public static void main(String args[]) {
        Constructor cn = new Constructor(123, "sud");
        cn.display();
    }
}