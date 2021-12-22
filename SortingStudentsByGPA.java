package ru.mirea.prac6.res;

public class SortingStudentsByGPA {
    public static void run(Student[] student, int low, int high){
        Comparator.quickSort(student, low, high);
    }
}
