package homework8_1;

public class fib {
    private static int step = 0;
    public static int f(int n) {
        space();
        System.out.println("" + n + "-> ");
        step++;
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return f(n - 2) + f(n - 1);
        }
    }
    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }
}
