package Lab9_1;

public class example8 {
    public static int m(){
        try {
            System.out.println("0"); // печатает "0"
            throw new RuntimeException(); // исключение не будет перехвачано, т.к. нет соответствующего catch, будет выведена ошибка
        }
        finally { System.out.println("1"); // "1" печатается не смотря на то, что исключение не перехватывается
        }
    }
    public static void main(String[] args) { System.out.println(m());
    }
}
