package main;

import java.util.ArrayList;
import java.util.List;

import models.Box;

public class Main {

	public static void main(String[] args) {
		
		Box box0 = new Box();
		box0.setT(new Object());
		System.out.println(box0.getT());
		
		Box<String> box1 = new Box<>();
		box1.setT("Wildrimak");

		Box<String> box2 = new Box<String>("Kamirdliw");
		System.out.println(box2.getT());
		
		List<Box> boxes_genericas;
		
		List<Box<String>> boxes_strings = new ArrayList<>();
		
		boxes_strings.add(box1);
		boxes_strings.add(box2);
	}

}
