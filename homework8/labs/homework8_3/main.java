package homework8_3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = id.nextInt();
        System.out.println("Размер массива равен "+ Size); // Сообщение пользователю "для красоты и понимания"

        rec RA1 = new rec(Size);
    }
}
