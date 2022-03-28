package Homework7_5;

public class Homework7_5 {
    public static void main(String[] args) {
        superClass SuperClassTest1 = new superClass("class");
        SuperClassTest1.PrintToString();

        FirstSubClass SubClassTest1 = new FirstSubClass("1subClass", 1);
        SubClassTest1.PrintToString();

        SecondSubClass SubClassTest2 = new SecondSubClass("2subClass", 'A');
        SubClassTest2.PrintToString();

        superClass SuperClassTest2 = new superClass(SubClassTest1.getStr1());
        SuperClassTest2.PrintToString();

        superClass SuperClassTest3 = new superClass(SubClassTest2.str1);
        SuperClassTest3.PrintToString();
    }
}
