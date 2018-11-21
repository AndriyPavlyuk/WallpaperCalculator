package com.mcpk.wallpapercalculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File input1 = new File("C:\\Users\\user\\eclipse-workspace\\input1.txt");
		Scanner scanner = new Scanner(input1);

		WallpaperCalculator wallpaperCalculator = new WallpaperCalculator();
		int totalSquare = 0;
		while (scanner.hasNextLine()) {
			String dimensions = scanner.nextLine();
			totalSquare += wallpaperCalculator.calculateSquare(dimensions);
		}
		System.out.println("Total meter square of wallpaper: "+totalSquare+" square meters");
		scanner.close();
	}
}
