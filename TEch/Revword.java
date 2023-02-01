
import java.util.*;

class Revword {
    public static void main(String args[]) {
        String str = "welcome to sud";
        String[] words = str.split(" ");
        String Reversestring = " ";
        for (String w : words) {
            String rev = " ";
            for (int i = w.length() - 1; i >= 0; i--) {
                rev = rev + w.charAt(i);
            }
            Reversestring = Reversestring + rev + " ";
          
        }
        System.out.println(Reversestring);
    }
}
