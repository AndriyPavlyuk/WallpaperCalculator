package com.mcpk.wallpapercalculator;

public class WallpaperCalculator {
	public int calculateSquare(String dimensions) {

		int[] numbers = (separateNumbersFromDimentions(dimensions));
		int[] square = new int[numbers.length];

		int sumRoomSquare = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			square[i] = numbers[i] * numbers[i + 1];
			sumRoomSquare += square[i];
		}
		square[numbers.length - 1] = numbers[0] * numbers[numbers.length - 1];
		int sumSquare = square[numbers.length - 1] + sumRoomSquare;
		int minSquareValue = getMinValue(square);
		
		int fullRoomSquare = 2 * sumSquare + minSquareValue;
		return fullRoomSquare;
	}

	private int getMinValue(int[] array) {
		int minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}

	private int[] separateNumbersFromDimentions(String dimensions) {

		String[] symbols = String.valueOf(dimensions).split("");
		String[] numbers = new String[symbols.length];
		int j = 0;
		int k = 0;
		for (int i = 0; i < symbols.length; i++) {
			if (symbols[i].equals("x")) {
				k = 0;
				j++;
			} else if (k == 0) {
				numbers[j] = symbols[i];
				k++;
			} else if (k != 0) {
				numbers[j] = symbols[i - 1] + symbols[i];
			}
		}
		int numberInt[] = new int[j + 1];
		for (int i = 0; i < j + 1; i++) {
			numberInt[i] = Integer.parseInt(numbers[i]);
		}
		return numberInt;
	}
}
