import javax.swing.plaf.synth.SynthProgressBarUI;

class String2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string");
        String s1 = sc.nextLine();
        System.out.println("enter the second string");
        String s2 = sc.nextLine();
        StringBuilder sb = new StringBuilder(s1);
        // StringBuilder sb = new StringBuilder(s2);
        for (int i = 0; i <= s1.length() - 1; i++) {
            System.out.println(s1.charAt(i));
        }

    }
}