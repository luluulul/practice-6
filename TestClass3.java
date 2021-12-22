package ru.mirea.prac6;

import ru.mirea.prac6.res.Methods;
import ru.mirea.prac6.res.Student;

public class TestClass3 {
    public static void main(String[] args) {
        Student [] a = new Student[(int)(Math.random()*10) + 20];
        Student [] b = new Student[(int)(Math.random()*10) + 20];
        System.out.println("Было сгенерировано " + a.length + " и " + b.length + " студентов");
        filler(a);
        filler(b);
        Methods.mergeSort(a,0,a.length - 1);
        Methods.mergeSort(b, 0 , b.length - 1);
        Student[] c = Methods.merge2Arr(a,b);
        System.out.println("итоговый массив");
        for (Student n: c
        ) {
            System.out.print(n.getPoints() + " ");
        }
    }

    static void filler(Student[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = new Student();
            b[i].setPoints((int)((Math.random()*150)+160));
            System.out.print(b[i].getPoints() + " ");
        }
        System.out.println();
    }
}
