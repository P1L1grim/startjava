package com.startjava.lesson_2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		/*Jaeger jagOne = new Jaeger();
		Jaeger jagTwo = new Jaeger();

		jagOne.setCaliber(60);
		jagOne.setWeight(450);
		jagOne.setHeight(50);
		jagOne.setModelName("Vanilla"); - код без конструктора, но с гетерами и сетерами*/
		Jaeger jagOne = new Jaeger("Kuznechik", 25, 300, 80);
		Jaeger jagTwo = new Jaeger("Bloha", 40, 500, 100);
		System.out.println("Боевой робот " + jagOne.getModelName() + " оснащён тяжелым орудием калибра " + jagOne.getCaliber());
		System.out.println(jagOne.getModelName() + " бегом марш! ");
		jagOne.run();
		System.out.println(jagOne.getModelName() + " огонь по врагу! ");
		jagOne.shoot();

		/*jagTwo.setCaliber(30);
		jagTwo.setWeight(200);
		jagTwo.setHeight(40);
		jagTwo.setModelName("Choco");*/
		System.out.println("Боевой робот " + jagTwo.getModelName() + " оснащён тяжелым орудием калибра " + jagTwo.getCaliber());
		System.out.println(jagTwo.getModelName() + " бегом марш! ");
		jagTwo.run();
		System.out.println(jagTwo.getModelName() + " огонь по врагу! ");
		jagTwo.shoot();

	}
	
}