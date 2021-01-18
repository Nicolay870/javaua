package com.javaua.task.task14.task1410;

public class Solution {

	public static void main(String[] args) {
		getDecliciousDrink().taste();
		System.out.println(getWine().getHolideyName());
		System.out.println(getBubbleWine().getHolideyName());
		System.out.println(getWine().getHolideyName());
	}

	public static Wine getDecliciousDrink() {
		return new Wine();
	}

	public static Wine getWine() {
		return new Wine();
	}

	public static Wine getBubbleWine() {
		return new BubblyWine();
	}
}
