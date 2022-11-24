package com.aepi;

import java.util.ArrayList;
import java.util.Iterator;



public class EjerciciosArralist {

	public static void main(String[] args) {
	
		
		
// --------------------------------------------------- EJERCICIO UNO ---------------------------------------------------
		
		// 1._CREO ARRAYLIST
		
		ArrayList<Object> ejercicioUno = new ArrayList<>();
		
		ejercicioUno.add("Antonio");
		ejercicioUno.add("Sergio");
		ejercicioUno.add("María");
		ejercicioUno.add("Sergio");
		ejercicioUno.add("Marta");
		ejercicioUno.add("Sergio");
		ejercicioUno.add(33);
		
		
		// 2._RECCORREMOS EL ARRAY CON ITERATOR
		
		Iterator<Object> iteradorUno = ejercicioUno.iterator();
		
		while(iteradorUno.hasNext()) {
			Object lista = iteradorUno.next();
			System.out.println(lista);
		}
		
		
		
		// 3._ELIMINAMOS TODOS LOS VALORES "SERGIO"
		
		while(ejercicioUno.contains("Sergio")) {
			ejercicioUno.remove("Sergio");
		}
		
		
		System.out.println("\n");
		
		
		// 4._RECCORREMOS EL ARRAY CON FOR MEJORADO
		
		for(Object lista : ejercicioUno) {
			System.out.println(lista);
		}
		
		
		
		
	}

}
