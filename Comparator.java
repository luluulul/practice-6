package ru.mirea.prac6.res;

public interface Comparator {
     static void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Student opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i].getPoints() < opora.getPoints()) {
                i++;
            }

            while (array[j].getPoints() > opora.getPoints()) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
         // вызов рекурсии для сортировки левой и правой части
         if (low < j)
             quickSort(array, low, j);

         if (high > i)
             quickSort(array, i, high);
     }
    }
