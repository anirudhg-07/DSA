public class samp {
    public static void main(String[] args) {
        int n = 10; // default count
        if (args.length > 0) {
            try { n = Integer.parseInt(args[0]); } catch (NumberFormatException e) { /* keep default */ }
        }
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i < n - 1 ? " " : "\n")); n - 1 ? " " : "\n"));
            long next = a + b;
            a = b;
            b = next;xt;
        }
    }

}}