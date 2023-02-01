/*class Super {
    void run() {
        System.out.println("car is running");
    }

    class Baby extends Super {
        void color() {
            System.out.println("blac");

        }

        void dis() {
            color();
            super.run();
        }
    }

    public static void main(String args[]) {
        Super b1 = new Super();
        b1.dis();
    }
}*/
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat();
        bark();
    }
}

class Super {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.work();
    }
}