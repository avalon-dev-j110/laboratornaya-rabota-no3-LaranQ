package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка выбором (англ. selection sort).
 *
 * <p>Алгоритм сортировки. Может быть как устойчивый, так и
 * неустойчивый. На массиве из n элементов имеет время
 * выполнения в худшем, среднем и лучшем случае Θ(n2),
 * предполагая что сравнения делаются за постоянное время.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%BE%D0%BC">Сортировка выбором</a>
 */
public class SelectionSort implements Sort {

    /**
     * {@inheritDoc}
     */
    public void sort(int[] array) {
        /*
         * TODO(Студент): Реализовать метод sort класса SelectionSort
         */
        for (int i = 0; i < array.length-1; i++) {
		int min = i;
		for (int j = i + 1; j < array.length; j++) {
		    if (array[j] < array[min]) {
				min = j;
			}
		}
		    int k = array[i]; // сохраняем для обмена значение текущего элемента
		    array[i] = array[min]; // устанавливаем минимальное значение на проверяемый внешним циклом элемент массива
		    array[min] = k; // меняем местами проверявшийся элемент массива с тем местом, где ранее был минимальный элемент
	}
    }
}
