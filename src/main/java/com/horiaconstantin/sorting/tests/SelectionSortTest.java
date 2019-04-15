package com.horiaconstantin.sorting.tests;

import com.horiaconstantin.sorting.bycompare.SelectionSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

	int[] sortedAscending = { 1, 2, 3, 5, 6, 7, 8 };
	int[] sortedDescending = { 30, 8, 6, 5, 3, 2, 1 };

	@Test
	public void nothingToSort() {
		assertArrayEquals(sortedAscending,
				SelectionSort.selectionSortIncreasing(sortedAscending));
	}

	@Test
	public void sortUnsorted() {
		assertArrayEquals(
				sortedAscending,
				SelectionSort.selectionSortIncreasing(new int[] { 8, 7, 6, 5,
						3, 2, 1 }));
	}

	@Test
	public void sortSameArray() {
		assertArrayEquals(
				new int[] { 8, 8, 8, 8, 8, 8, 8 },
				SelectionSort.selectionSortIncreasing(new int[] { 8, 8, 8, 8,
						8, 8, 8 }));
	}

}