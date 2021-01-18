
package com.javaua.task.task14.task1409;

/*
 * 1.Создать интерфейс Bridje с методом int getCarsCount.
 * 		Greate Bridge interface with int getCarsCount metod.
 * 
 * 2.Создать класи WaterBridge и SuspensionBridge, которие реализуют интерфейс Bridge.
 * 		Greate WaterBridge and SuspensionBridge classes that implement interface.
 * 
 * 3.Метод getCarsCount() должен возвращать любое фиксированое значение типа int.
 * 		The getCarsCount() method must return any fixed int vaiue.
 * 
 * 4.Метод getCarsCount() должен возвращать различние значения для различних класов.
 * 		The getCarsCount() method should return different value different classes.
 * 
 * 5.В класе Solution создать публичний метод println(Bridge bridge).
 * 		In the Solution class, greate public method prinln(Bridge bridge).
 * 
 * 6.В методе prinln(Bridge bridge) вивести в консоль значение getCarsCount() для обектов bridge.
 * 		In the prinln(Bridge bridge) method, enter the getCarsCount() value for the bridge objects into the console.
 * 
 * 7.Каждий класс и интерфейс должни бить в отдельних файлах.
 * 		  Each class and interface must be in separate files.
 */
public class Solution {

	public static void main(String[] args) {
		println(new WaterBridge());
		println(new SuspensionBridge());
	}
	
	public static void println(Bridge bridge) {
		System.out.println(bridge.getCarsCount());
	}
}
