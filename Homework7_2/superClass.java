package Homework7_2;

public class superClass {
    private String str;

    superClass(String strEx) {
        str = strEx;
    }

    public int getStr1() {
        return str.length();
    }

    public void setStr(String str) {
        this.str = str;
    }
}

