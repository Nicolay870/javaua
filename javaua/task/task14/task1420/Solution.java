package com.javaua.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public Solution() {
		 
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Integer first = Integer.parseInt(reader.readLine());
		Integer second = Integer.parseInt(reader.readLine());
		
		System.out.println(getNOD(first, second));
	}
	
	public  static int getNOD(int first, int second) {
		if (first < 1 || second < 1) {
			throw new IllegalArgumentException();
		}
		
		while (first != second) {
			if(first > second) {
				first -= second;
			}
			
			if (second > first) {
				second -= first;
			}
		}
		return first;
	}	
}
