package com.grats.util;

import java.util.Random;

public class ArrayShuffle {
	public static void shuffleArray(int[] array) {
		Random rnd = new Random();
		int max=array.length-1;
		for (int i = 0; i < array.length; i++) {
			int index = rnd.nextInt(max);
			// Swap elements
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
	}
	public static void main(String[] args) {
        int[] myArray = {25, 57, 93, 34, 6,34,43};
        shuffleArray(myArray);
        for (int num : myArray) {
            System.out.print(num + " ");
        }
	}
}
