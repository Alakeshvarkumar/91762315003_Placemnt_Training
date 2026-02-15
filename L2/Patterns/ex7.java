// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ex7 {

    public static void main(String args[]) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
