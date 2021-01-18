package com.javaua.task.task14.task1413;

import java.io.IOException;



public class Solution {
/*
 * 1.Создай интерфейс CompItem.
 * 		Great CompItem interface.
 * 2.Добавь в него метод String getName().
 * 		Add the String getName() method to it.
 * 3.Создай класс keyboard, Mouse, Monitor, которие реализуют CompItem.
 * 		Great keyboard, Mouse, Monitor, class that implement CompItem.
 * 4. Метод getName() должен возвращать имя класа, например, для класа keyboard будет "keyboard".
 * 		The getName() method must return name of the class, for example, for the keyboard class it will be "keyboard".
 * 5. Создай класс Computer.
 * 		Great Computer class.
 * 6.В класе Computer создай приватное поле keyboard типа Keyboard.
 * 		In the Computer class great a private keyboard filed of type Keyboard.
 * 7.В класе Computer создай приватное поле mouse типа Mouse.
 * 		In the Computer class great a private mouse filed of type Mouse.
 * 8.В класе Computer создай приватное поле monitor типа Monitor.
 * 		In the Computer class great a private monitor filed of type Monitor.
 * 9.Создай конструктор с тремя паратерами в классе Computer используя комбинацию клавиш ALT+Insert внутри класса(Команда Constructor).
 * 		Greate a constructor with three parameters in the Computer class using the ALT+Insert key combination inside the class (Constructor comand).
 * 10.Внутри конструктора инициализируйте все три поля (переменних) класса в соответствии с переданими параметрами.
 * 		 In the constructor, initialize all three fields (variables) of the class in accordance with the passed parameters.
 * 11.Создай геттери для полей класса Computer (в классе используй комбинацию клавиш ALT+Insert) и вибери команду Geter).
 * 		Greate a getter for the fields Computer class (in class use the ALT+Insert key combination) and select the Getter command.
 * 12.Все создание класси и интерфейс должни бить в отдельних файлах.
 * 		 All class and interface must be in separate files.
 */		
	public static void main(String[] args) throws IOException{
		
		Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
		if (isWork(computer.getKeyboard()) && isWork(computer.getMonitor()) && isWork(computer.getMouse())) {
			System.out.println("Work!");
		}	
	}
		
		public static boolean isWork(CompItem item) {
			System.out.println(item.getName());
			return item.getName() != null && item.getName().length() > 4;		
		}

}
