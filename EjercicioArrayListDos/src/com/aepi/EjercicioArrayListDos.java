package com.aepi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.aepi.clases.Persona;

public class EjercicioArrayListDos {

	public static void main(String[] args) {
	
		System.out.println("\n ----------- Guaradar Objetos en ArrayList ----------- ");
		
		Scanner lector = new Scanner(System.in);		
		
		// Creamos ArrayList
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		
		// Creamos Personas en bucle y añadimos al array
		for (int i = 0; i < 3; i++) {	
			System.out.println("\nPor favor escribe un nombre: " + i);
			Persona persona = new Persona();
			persona.setNombre(lector.next());
			System.out.println("Por favor escribe su apellido: " + i);
			persona.setApellidos(lector.next());
			System.out.println("Por favor escribe su DNI: " + i);
			persona.setId(lector.nextInt());
			
			listaPersonas.add(persona);
		}
		
		
		// Mostramos ArrayList con iterador 
		System.out.println("\nMostramos con iterador:");
		
		Iterator<Persona> iterador = listaPersonas.iterator();
		while(iterador.hasNext()) {
			Object valores = iterador.next();
			System.out.println("Nombre: " + ((Persona) valores).getNombre() + ". Apellidos: " + ((Persona) valores).getApellidos() + ". DNI: " + ((Persona) valores).getId());
		}
		
		
		// Mostramos ArrayList con for mejorado
		System.out.println("\nMostramos con for mejorado:");
		
		for(Persona lista : listaPersonas) {
			System.out.println(lista);
		}
		
		
		// Mostramos ArrayList con for 
				System.out.println("\nMostramos con for:");
				
		for(int j = 0; j < listaPersonas.size(); j++) {
			Persona persona = listaPersonas.get(j);
			System.out.println("La posición " + j + " pertenece a " + persona.getNombre() + " " + persona.getApellidos() + ", con DNI: " + persona.getId());
		}
		
		
	}

}
