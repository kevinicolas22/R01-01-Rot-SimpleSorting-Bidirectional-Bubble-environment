package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;

/**
 * This bubble sort variation has two internal iterations. In the first, it
 * pushes big elements to the right, like the normal bubble sort does. Then in
 * the second, iterates the array backwards, that is, from right to left, while
 * pushing small elements to the left. This process is repeated until the array
 * is sorted.
 */
public class BidirectionalBubbleSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

			@Override
			public void sort(T[] array, int leftIndex, int rightIndex) {
				boolean trocouESQ, trocouDIR;
				
				do {
					trocouESQ = false;
			
					for (int i = leftIndex; i < rightIndex; i++) {
						if (array[i].compareTo(array[i + 1]) > 0) {
							swap(array, i, i + 1);
							trocouESQ = true;
						}
					}
			
					if (!trocouESQ) {
						break;
					}
			
					trocouDIR = false;
			
					for (int i = rightIndex; i > leftIndex; i--) {
						if (array[i].compareTo(array[i - 1]) < 0) {
							swap(array, i, i - 1);
							trocouDIR = true;
						}
					}
			
				} while (trocouDIR);
			}
			
			private void swap(T[] array, int i, int j) {
				T temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			
}
