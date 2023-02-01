import java.util.StringTokenizer;

/*class Token {
    public static void main(String args[]) {
        StringTokenizer sb = new StringTokenizer(" helllo my nmae is sud chnadra im from mangalore", " ");
        while (sb.hasMoreTokens())

        {
            System.out.println(sb.nextTokens);
        }
    }

}*/
import java.util.StringTokenizer;

public class Token {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("my name is khan", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
