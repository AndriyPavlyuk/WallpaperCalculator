package com.mcpk.wallpapercalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WallpaperCalculatorTest {

	private WallpaperCalculator wallpaperCalculator;
	@Before
	public void setUp() {
		wallpaperCalculator = new WallpaperCalculator();
	}

	@Test
	public void calculateSquareEx1() {
		assertEquals(wallpaperCalculator.calculateSquare("1x2x3"), 24);
	}
	@Test
	public void calculateSquareEx2() {
		assertEquals(wallpaperCalculator.calculateSquare("1x1x5"), 23);
	}
}
