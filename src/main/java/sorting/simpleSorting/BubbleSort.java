package sorting.simpleSorting;

import sorting.AbstractSorting;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        if (array == null || array.length == 0 || leftIndex < 0 || rightIndex < 0) {
			return; // Retorna caso o array seja nulo, tenha tamanho 0 ou os índices sejam negativos
		}
        boolean troca = true;
        for (int i = leftIndex; i < rightIndex && troca; i++) {
            troca = false;
            for (int j = leftIndex; j < rightIndex - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                    troca = true;
                }
            }
        }
    }
    
    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

