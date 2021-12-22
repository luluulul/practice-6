package ru.mirea.prac6;
import ru.mirea.prac6.res.SortingStudentsByGPA;
import ru.mirea.prac6.res.Student;

public class TestClass2 {
    public static void main(String[] args) {
        System.out.println("Task2");
        Student [] student = new Student[(int)(Math.random()*10) + 20];
        System.out.println("Было сгенерировано " + student.length + " студентов");
        TestClass3.filler(student);
        SortingStudentsByGPA.run(student, 0 , student.length - 1);
        for (Student n: student
             ) {
            System.out.print(n.getPoints() + " ");
        }
    }
}
