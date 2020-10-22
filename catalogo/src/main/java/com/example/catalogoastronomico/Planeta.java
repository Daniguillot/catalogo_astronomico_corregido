package com.example.catalogoastronomico;

import java.util.Objects;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class Planeta extends Astro {

    private boolean habitado;
    private Estrella estrella;

    //--------------------------------------------CONSTRUCTORES-----------------------

    public Planeta(String nombre, double brillo, double distancia, boolean habitado, Estrella estrella){

        super(nombre, brillo, distancia);
        this.habitado= habitado;
        this.estrella= estrella;
    }

    //--------------------------------------------GETTERS------------------------------
    public boolean isHabitado() {
        return habitado;
    }

    public Estrella getEstrella() {
        return estrella;
    }

    //--------------------------------------------SETTERS------------------------------


    public void setHabitado(boolean habitado) {
        this.habitado = habitado;
    }

    public void setEstrella(Estrella estrella) {
        this.estrella = estrella;
    }

    //--------------------------------------------METODOS-------------------------------


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planeta)) return false;
        if (!super.equals(o)) return false;
        Planeta planeta = (Planeta) o;
        return habitado == planeta.habitado &&
                Objects.equals(estrella, planeta.estrella);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitado, estrella);
    }

    @Override
    public String toString(){

        String datos = "objeto-Astro " + "{nombre: " + super.getNombre() + ", brillo: " + super.getBrillo() + ", distancia: " + super.getDistancia() + ", habitado: "+ this.habitado + ", estrella: " + this.estrella.getNombre() +  "}";
        return datos;
    }
}
