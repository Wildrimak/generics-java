package main;

import java.util.ArrayList;
import java.util.List;

import teste.Box;

public class Main {

	public static void main(String[] args) {

		testaBox();
		testaTridente();
	}

	private static void testaTridente() {
	}

	private static void testaBox() {

		Box<String> box1 = new Box<>();
		box1.setT("Wildrimak");

		Box<String> box2 = new Box<String>("Kamirdliw");
		System.out.println(box2.getT());

		List<Box<Double>> boxes_genericas = new ArrayList<>();
		
		boxes_genericas.add(new Box<Double>());

		List<Box<String>> boxes_strings = new ArrayList<>();

		boxes_strings.add(box1);
		boxes_strings.add(box2);
		
	}

}
