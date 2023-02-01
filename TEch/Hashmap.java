import java.util.HashMap;

class Hashmap {
    public static void main(String args[]) {
        HashMap hm = new HashMap();
        hm.put(98, "kan");
        hm.put(87, "eng");
        hm.put(99, "hin");
        hm.put(96, "math");
        hm.put(88, "sci");
        hm.put(100, "soci");

        System.out.println(hm);

        System.out.println(hm.get(87));
        hm.remove(100);
        System.out.println(hm);

        System.out.println(hm.containsKey(88));
        System.out.println(hm.values());
        //enytry methods
         
    }
}