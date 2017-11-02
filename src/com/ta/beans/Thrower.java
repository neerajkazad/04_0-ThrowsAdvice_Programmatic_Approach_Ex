package com.ta.beans;

public class Thrower {
	public int willThrow(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("Invalid i " + i);
		}
		return i;
	}
}
