package com.anahuac.mayab.modulo1.sesion3;

import java.io.IOException;

public class TestCartilla {

	public static void main(String[] args) throws IOException  {
		
		Perro miPerro = new Perro("labrador", "duque", 4, "Arturo");
		Perro miPerro1 = new Perro("pastor aleman", "Goofy", 6, "Blanca");
		
		
		CartillaPerro cartilla = new CartillaPerro();
		
		
		cartilla.setDatosPerro(miPerro);
		cartilla.setDatosPerro(miPerro1);
		
		cartilla.actualizar("rabia", "5-enero-2022");
		cartilla.actualizar("moquillo", "5-mayo-2023");
		cartilla.actualizar("parvovirus", "5-junio-2024");
		cartilla.actualizar("lyme", "5-noviembre-2024");
		
		cartilla.imprimirCartilla();
		cartilla.imprimirCartilla();
		
		//Este Método imprime el archivo con  la cartilla
		try {
			cartilla.imprimirExpediente();
		} catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	

}
