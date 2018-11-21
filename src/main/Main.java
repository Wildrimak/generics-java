package main;

import java.util.ArrayList;
import java.util.List;

import models.Box;

/*
 * Objetivo: Facilitar a leitura de codigos com generics
 * 
 * Metas:
 * 
 * 1) Criar uma classe com um generic e testar a criação de objetos dessa classe
 * 
 * 2) Criar uma classe com atributos que tenham generics e ver o funcionamento deles com exemplos publicos e privados (gets e sets)
 * 
 * 3) Criar uma classe com metodos que tenham parametros genericos simples
 * 
 * 4) Criar uma classe com metodos cujo retorno seja generic (ver a diferenca e os impactos entre "public <T> getT();" e "public T getT();"
 * 
 * 5) Criar uma classe com metodos cujo parametros contenham (? super T)
 * 
 * 6) Criar uma classe com generics que contenha generics (? super T)
 * 
 * 7) Criar uma classe com generics que contenha generics (? super T) que é filha de uma classe sem generics e com generics
 * */

public class Main {

	public static void main(String[] args) {
		
		Box<Object> box0 = new Box<Object>();
		box0.setT(new Object());
		System.out.println(box0.getT());
		
		Box<String> box1 = new Box<>();
		box1.setT("Wildrimak");

		Box<String> box2 = new Box<String>("Kamirdliw");
		System.out.println(box2.getT());
		
		List<Box<Object>> boxes_genericas = new ArrayList<>();
		
		boxes_genericas.add(new Box<Object>());
		
		List<Box<String>> boxes_strings = new ArrayList<>();
		
		boxes_strings.add(box1);
		boxes_strings.add(box2);
	}

}
