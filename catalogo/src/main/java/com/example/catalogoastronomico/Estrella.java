package com.example.catalogoastronomico;

import java.util.Objects;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class Estrella extends Astro{

    private int planetas;
    private Galaxia galaxia;

    //-------------------------------------------CONSTRUCTORES---------------------------

    public Estrella(String nombre , double brillo, double distancia, int planetas, Galaxia galaxia){
        super(nombre, brillo, distancia);
        this.planetas= planetas;
        this.galaxia = galaxia;
    }

    //-------------------------------------------GETTERS---------------------------------


    public int getPlanetas() {
        return planetas;
    }

    public Galaxia getGalaxia() {
        return galaxia;
    }

    //------------------------------------------SETTERS----------------------------------


    public void setPlanetas(int planetas) {
        this.planetas = planetas;
    }

    public void setGalaxia(Galaxia galaxia) {
        this.galaxia = galaxia;
    }

    //------------------------------------------METODOS-----------------------------------


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estrella)) return false;
        if (!super.equals(o)) return false;
        Estrella estrella = (Estrella) o;
        return planetas == estrella.planetas &&
                Objects.equals(galaxia, estrella.galaxia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planetas, galaxia);
    }

    @Override
    public String toString(){

        String datos = "objeto-Astro " + "{nombre: " + super.getNombre() + ", brillo: " + super.getBrillo() + ", distancia: " + super.getDistancia() + ", planetas: "+ this.planetas + ", galaxia: " + this.galaxia.getNombre() +  "}";
        return datos;
    }
}
