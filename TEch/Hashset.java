import java.util.HashSet;

class Hashset {
    public static void main(String args[]) {
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(67);
        hs.add("sud");
        hs.add(true);
        hs.add(23.7);
        System.out.println(hs);
        // to remove
        hs.remove("sud");
        System.out.println(hs);
        // to check the presence
        System.out.println(hs.contains("ram"));
        // to iterate
        for (Object s : hs) {
            System.out.println(s);
        }
        HashSet hs1 = new HashSet();
        hs1.removeAll(hs);
        System.out.println(hs1);

    }
    // to check the presenting of the eleement

}