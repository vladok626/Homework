package Homework7_3;

public class Homework7_3 {
    public static void main(String[] args) {
        superClass superClassTest = new superClass(1);
        String className1 = superClassTest.toString();
        System.out.println(className1);

        SecondSubClass FirstSubClassTest = new SecondSubClass(1,'A');
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        ThirdSubClass SecondSubClassTest = new ThirdSubClass(1,'A',"class");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
    }
}
