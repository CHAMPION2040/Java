package com.anahuac.mayab.modulo1.sesion3;

import java.util.List;

// Clase Veterinaria
class Veterinaria {
    private List<Perro> perros;

    public Veterinaria() {
        this.perros = new ArrayList<>();
    }

    public void agregarPerro(Perro perro) {
        perros.add(perro);
    }

    public void realizarServicio(Perro perro, String servicio) {
        perro.getCartilla().agregarServicio(servicio);
    }

    public void imprimirExpedientes() {
        for (Perro perro : perros) {
            perro.getCartilla().imprimirExpediente(perro.getNombre());
        }
    }
}
