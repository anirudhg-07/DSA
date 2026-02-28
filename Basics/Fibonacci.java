public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // default: print first 10 numbers
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, using default: 10");
            }
        }
        
        System.out.println("Fibonacci Series (first " + n + " numbers):");
        printFibonacci(n);
    }
    
    static void printFibonacci(int count) {
        long a = 0, b = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(a);
            if (i < count - 1) System.out.print(", ");
            
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}