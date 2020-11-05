package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {

    int diapozonS, diapozonF, med;
    
    public RandomInitializer(int diapozonS, int diapozonF){
        this.diapozonS=diapozonS;
        this.diapozonF=diapozonF;
        med=diapozonF-diapozonS;
    }
    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    public void initialize(int[] array) {
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
        Random rnd = new Random();
        
        
        for(int i=0; i<array.length; i++){
            array[i]=rnd.nextInt(med+1)+diapozonS;
        }
    }
}
