package ru.mirea.prac6;

import ru.mirea.prac6.res.Methods;
import ru.mirea.prac6.res.Student;

public class TestClass1 {
    public static void main(String[] args) {
        System.out.println("Task1");
        Student [] iDNumber = new Student[10];
        for (int i = 0; i < iDNumber.length; i++) {
            iDNumber[i] = new Student((int)(Math.random()*100));
            System.out.print(iDNumber[i]);
        }
        System.out.println();
        Methods.sortTask1(iDNumber);
//        for (Student i:iDNumber) {
//            System.out.print(i);
//        }
        System.out.println();
    }

}
