package homework8_1;

public class rec2 {
    public static void m(int x) {
        if ((2*x+1) < 20) {
            m(2*x+1);
        }
        System.out.println("x="+x);
    }
}
