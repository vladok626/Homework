package Lab9_1;

public class example6 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // печатает "0"
            throw new NullPointerException("ошибка");
        }
        catch (ArithmeticException e) {
            System.out.println("1 "+e ); //эта часть кода пропускается
        }
        catch (RuntimeException e) {
            System.out.println("3 "+e ); // исключение перехвачено и обработано, печатает "3" и исключение
        }
        catch (Exception e) {
            System.out.println("2 "+e ); //эта часть кода пропускается, т.к. исключение уже обработано
        }
        System.out.println("4"); // печатает "4"
    }
}
