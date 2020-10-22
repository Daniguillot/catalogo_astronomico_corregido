package com.example.catalogoastronomico;
/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class Galaxia extends Astro {


    public Galaxia(String nombre, double brillo, double distancia){
        super(nombre, brillo, distancia);
    }

    //Reescribir el toSTring con getClass();


    @Override
    public String toString() {
        return "Galaxia { nombre: " + super.getNombre() + ", brillo: "+ super.getBrillo() + ", distancia: "+ super.getDistancia() + "}";
    }
}
