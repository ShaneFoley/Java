package org.example;

public class Q4 {


    public void printString(String str){
        System.out.print(str + "\n");
        int index = str.indexOf("my");
        str = str.replace("my","your");

    System.out.print(str);
    }
}
