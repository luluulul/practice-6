package ru.mirea.prac6.res;


import java.util.Arrays;

public class Methods {
    public static void sortTask1(Student[] array){
        for (int i = 1; i < array.length; i++) {
            Student current = array[i];
            int j = i - 1;
            while(j >= 0 && current.getId() < array[j].getId()) {
                array[j+1] = array[j];
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            array[j+1] = current;
        }
        for (Student i:array) {
            System.out.print(i);
        }
    }
    public static void mergeSort(Student[] numbers, int from, int to) {
        if (from >= to) {
            return;
        }
        int mid = (to + from) / 2;
        mergeSort(numbers, from, mid);
        mergeSort(numbers, mid + 1, to);
        merge(numbers, from, mid, to);
    }

    private static void merge(Student[] array, int from, int mid, int to) {
        Student[] tmp = new Student[to - from + 1];
        int i = from, j = mid + 1, k = 0;
        while (i <= mid && j <= to) {
            if (array[i].getPoints() <= array[j].getPoints()) {
                tmp[k++] = array[i++];
            } else {
                tmp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = array[i++];
        }
        while (j <= to) {
            tmp[k++] = array[j++];
        }
        // Копируем данные в tmp в массив
        System.arraycopy(tmp, 0, array, from, to - from + 1);
    }
    public static Student[] merge2Arr(Student[] arr1, Student[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        Student [] res = new Student[len1 + len2]; // Использование массива для хранения отсортированного массива
        int i = 0, j = 0, k = 0;
        while(i < len1 && j < len2) {
            res[k++] = arr1[i].getPoints() < arr2[j].getPoints()? arr1[i++] : arr2[j++];
        }
        while(i < len1) {
            res[k++] = arr1[i++];
        }
        while(j < len2) {
            res[k++] = arr2[j++];
        }
        return res;
    }
}
