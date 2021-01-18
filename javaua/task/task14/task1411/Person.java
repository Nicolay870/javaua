package com.javaua.task.task14.task1411;

public interface Person {
	class User implements Person() {
		void live() {
			System.out.println("I usually just live.");
		}
	}
	class Loser implements Person() {
		void doNothing() {
			System.out.println("I usually do nothing.");
		}
	}
	class Coder implements Person() {
		void writeCode() {
			System.out.println("I usually do nothing.");
		}
	}	
}
