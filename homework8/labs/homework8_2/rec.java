package homework8_2;

public class rec {
    private static int x;
    private static int step = 0;
    private static String result = "";

    //конструктор класса с вызовом метода
    rec(int x) {
        this.x = x;
        System.out.println("->Параметр принят");
        System.out.println(DecToBin(x));
    }
    rec() {
        System.out.println("->Это пустой объект\n->Введите параметр");
    }

    protected String DecToBin(int x) {
        int i = x;
        //для отрицательных значений
        if (i<0){
            i=-i;
            result="-";
        }

        if (i != 0) {
            step++;
            space();
            System.out.println(i%2);
            DecToBin(i/2);
            result = result + i % 2;
            step--;
            space();
            System.out.println(i%2);
        }
        return "Binary of "+x+" = "+result;
    }
    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }
}
