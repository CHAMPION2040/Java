package com.anahuac.mayab.modulo1.sesion3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class TestPerro {
	private static Object randomGenerator;

	public static void main(String[] args) {
		//Creación de 5 instancias de Perro
		
		Perro perro1 = new Perro();		
		Perro perro2 = new Perro("desconocida", "pequeño", 10.5, "firulais", "Arturo", 2);
		Perro perro3 = new Perro("desconocida", "pequeño", 10.5, "duke", "Arturo", 2);
		Perro perro4 = new Perro("desconocida", "pequeño", 10.5, "capi", "Arturo", 2);
		Perro perro5 = new Perro("desconocida", "pequeño", 10.5, "loro", "Arturo", 2);
		
		System.out.println("El perro1 se llama: " + perro1.getNombre());		
		System.out.println("El perro2 se llama: " + perro2.getNombre());
		System.out.println("El perro3 se llama: " + perro3.getNombre());
		System.out.println("El perro4 se llama: " + perro4.getNombre());
		System.out.println("El perro5 se llama: " + perro5.getNombre());
		
		
		//Ya sabemos el nombre del perro1
		perro1.setNombre("solovino");
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("El perro1 se llama: " + perro1.getNombre());		
		System.out.println("El perro1 ladra: ");
		perro2.ladrar();
		
		
		System.out.println("--------------------------Ahora usando arreglo simple--------------------------");
		//Arreglo de 5 perros
		//Perro[]mis perros2= {new Perro(), new Perro(); new Perro();} 
		Perro[] misPerros= new Perro[5];	
		
		String[] nombres = {"Joy", "Oso", "Peluche", "Scooby", "GOGO"};
		String[] duenos = {"Pedro", "Juan", "Blanca", "Carmen", "Santiago"};
		
		for(int i = 0; i<5; i++) {
			misPerros[i] = new Perro();
			misPerros[i].setNombre(nombres[i]);
		}
		for(int i = 0; i<5; i++) {
			misPerros[i].ladrar();
		}
		
		Random randomGenerator = new java.util.Random();
		
		for(int i=0; i<5; i++) {
			int numeroAleatorio = randomGenerator.nextInt(nombres.length);
			misPerros[i].setNombreDuenio(duenos[numeroAleatorio]);
			misPerros[i].ladrar();
		}
		System.out.println("-----------------------Ahora usando arraylist----------------------------------");
		//Ahora vamos a usar un arrayList
		ArrayList<Perro> listaPerros = new ArrayList<Perro>();
	
		for(int i = 0; i<5; i++) {
		Perro perroTemporal = new Perro();
		perroTemporal.setNombre(nombres[i]);
			int numeroAleatorio = randomGenerator.nextInt(nombres.length);
		perroTemporal.setNombreDuenio(duenos[numeroAleatorio]);
		//Ya que están seteados los valores, ahora guardo en la lista
		listaPerros.add(perroTemporal);
	}
	
		for(int i=0; i < 5; i++) {
			listaPerros.get(i).ladrar();
		}
		System.out.println("-------------------------------Usando un hashMap---------------------------------------");
		HashMap<Integer, Perro>mapPerros = new HashMap<>();
		
		for(int i = 0; i<5; i++) {
			Perro perroTemporal = new Perro();
			perroTemporal.setNombre(nombres[i]);
				int numeroAleatorio = randomGenerator.nextInt(nombres.length);
			perroTemporal.setNombreDuenio(duenos[numeroAleatorio]);
			
			//Ya que están seteados los valores, ahora guardo en el mapa
			mapPerros.put(i,perroTemporal);
		}
		
		for(Integer i : mapPerros.keySet()) {
			mapPerros.get(i).ladrar();
		}
		
	}
}