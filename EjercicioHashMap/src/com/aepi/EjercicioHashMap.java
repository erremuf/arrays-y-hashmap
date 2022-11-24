package com.aepi;

import java.util.HashMap;
import java.util.Map;

public class EjercicioHashMap {

	public static void main(String[] args) {
		

		System.out.println("\nCREAR UN HASHMAP QUE GUARDE NÚMEROS DE TELÉFONO\n");
		
		//Creamos hashMap
		Map<String, Integer>listaTel = new HashMap<>();
		
		//Introducimos Datos
		listaTel.put("Casa", 925493212);
		listaTel.put("Hermano", 655261677);
		listaTel.put("Tio", 677796742);
		listaTel.put("Suegra", 657582871);
		listaTel.put("Oficina", 91493214);
		listaTel.put("Abogado", 736289812);
		listaTel.put("Tienda", 925359982);
		
		//Eliminamos 3 valores cualesquiera
		listaTel.remove("Tio");
		listaTel.remove("Tienda");
		listaTel.remove("Suegra");
		
		//Llamamos al método estático
		
		mostrarMapa(listaTel);
		
		

	}
	
	//Creamos método estático
	public static void mostrarMapa(Map<String, Integer> agenda) {	
		agenda.entrySet().forEach((entry) -> {
			String key = entry.getKey();			
			Integer valor = entry.getValue();			
			System.out.println("Nombre: " + key + "\nTeléfono: " + valor + "\n");
		});	
	}	
	
}


