package com.anahuac.mayab.modulo1.sesion3;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestArchivo {

	public static void main(String[] args) {
		String nombreArchivo = "c:\\veterinaria\\cartilla.txt";
		FileWriter archivo;
		try { 	
			archivo = new FileWriter(nombreArchivo);
			PrintWriter pw = new PrintWriter(archivo);
			pw.print("¡Bienvenidos a su Veterinaria Siempre Feliz!");
			pw.print("...Donde La Salud de sus mascotas es primero.");	
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
