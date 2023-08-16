package sorting.variationsOfSelectionsort;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveSelectionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do selection sort. Você deve implementar apenas
	 * esse método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (array == null || array.length == 0 || leftIndex < 0 || rightIndex < 0) {
			return; // Retorna caso o array seja nulo, tenha tamanho 0 ou os índices sejam negativos
		}
		if (leftIndex >= rightIndex) {
			return;
		}
	
		int minIndex = findMinIndex(array, leftIndex + 1, rightIndex, leftIndex);
	
		Util.swap(array, leftIndex, minIndex);
	
		sort(array, leftIndex + 1, rightIndex);
	}
	
	private int findMinIndex(T[] array, int currentIndex, int rightIndex, int minIndex) {
		if (currentIndex > rightIndex) {
			return minIndex;
		}
	
		if (array[currentIndex].compareTo(array[minIndex]) < 0) {
			minIndex = currentIndex;
		}
	
		return findMinIndex(array, currentIndex + 1, rightIndex, minIndex);
	}
	


}
