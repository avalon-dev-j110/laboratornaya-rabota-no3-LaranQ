package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Application {
    
    public static void main(String[] args) {
        int[] array;
        
        /*
        Задание 0
        */
        array = new int[20];
        
        /*
        Задание 1
        */
        FibonacciInitializer fb1 = new FibonacciInitializer();
        fb1.initialize(array);
        
        /*
        Задание 2
        */
        int sumArray=0;
        for (int i=0; i<array.length; i++){
            sumArray+=array[i];}
        
        /*
        Задание 3
        */
        RandomInitializer rnd1 = new RandomInitializer(-50, 50); //В parameter list конструктора указываются диапазоны для случайного числа.
        rnd1.initialize(array);
        
        /*
        Задание 4
        */
        BubbleSort bs1 = new BubbleSort();
        bs1.sort(array);
        
        /*
        Задание 5
        */
        rnd1.initialize(array);
        
        /*
        Задание 6
        */
        SelectionSort ss1 = new SelectionSort();
        ss1.sort(array);
        
        /*
        Задание 7
        */
        rnd1.initialize(array);
        /*
        Задание 8
        */
        ShellSort sh1 = new ShellSort();
        sh1.sort(array);
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
