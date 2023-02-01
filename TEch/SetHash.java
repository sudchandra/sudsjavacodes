import java.util.*;
import java.util.HashSet;

import javax.sound.midi.Synthesizer;

class SetHash {
    public static void main(String args[]) {
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add("syd");
        hs.add(100);
        System.out.println(hs);
        HashSet hm = new HashSet();
        hm.add(18);
        hm.addAll(hs);
        System.out.println(hm);

    }
}