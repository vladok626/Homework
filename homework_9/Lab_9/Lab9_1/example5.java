package Lab9_1;

public class example5 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // печатает "0"
            throw new RuntimeException("ошибка");//исключение не будет перехвачено
        }
        catch (NullPointerException e) {
            System.out.println("1 "+e ); //эта часть кода пропускается и исключение не будет перехвачено
        }
        System.out.println("2"); //эта часть кода не выполняется из-за ошибки
    }
}
