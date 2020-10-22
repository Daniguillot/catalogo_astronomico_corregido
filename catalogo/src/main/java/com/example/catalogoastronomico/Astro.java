package com.example.catalogoastronomico;

import java.util.Objects;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */

public class Astro {

    //--------------------------------------------ATRIBUTOS-------------------------------
    private String nombre;
    private double brillo;
    private double distancia;

    //---------------------------------------------GETTERS--------------------------------

    public String getNombre() {
        return nombre;
    }

    public double getBrillo() {
        return brillo;
    }

    public double getDistancia() {
        return distancia;
    }

    //---------------------------------------------SETTERS--------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBrillo(double brillo) {
        this.brillo = brillo;
    }

    public void setDistancia(double distanciaTierra) {
        this.distancia = distanciaTierra;
    }

    //---------------------------------------------CONSTRUCTORES-------------------------

    public Astro(String nombre, double brillo, double distancia) {

        this.nombre = nombre;
        this.brillo = brillo;
        this.distancia = distancia;

    }

    public Astro() {

        this.nombre = "Sirius";
        this.brillo = -1.47;
        this.distancia = 8.7;
    }

    //------------------------------------------------METODOS-----------------------------

    //Devuelve true o false, en función de si nuestro astro está mas distante que el otro astro.
    public boolean masDistante(Astro otro) {

        if (this.distancia > otro.distancia) {
            return true;
        } else {
            return false;
        }
    }


    //Devuelve un valor entero que será 1 si nuestro astro es más brillante que otro, -1 si nuestro astro es menos brillante y 0 si ambos astros son igual de brillantes.
    public int masBrillante(Astro otro) {

        if (this.brillo > otro.brillo) {
            return 1;
        } else if (this.brillo < otro.brillo) {
            return -1;
        } else {
            return 0;
        }
    }


    /*Devuelve un `String` que describa la forma en la que el astro puede ser observado. Dicho string será:
     * `"a simple vista"`, si su brillo es menor que 5
     * `"con prismáticos"`, si su brillo es mayor o igual que 5 y menor que 7
     * `"con telescopio"`, si su brillo es mayor o igual que 7 y menor que 25
     * `"con grandes telescopios"`, si su brillo es mayor o igual que 25
     */
    public String visibleCon() {

        if (this.brillo < 5) {
            return "a simple vista";
        } else if (this.brillo >= 5 && this.brillo < 7) {
            return "con prismáticos";
        } else if (this.brillo >= 7 && this.brillo < 25) {
            return "con telescopio";
        } else if (this.brillo >= 25) {
            return "con grandes telescopios";
        } else {
            return null;
        }
    }


    //Devuelve un `String` con el siguiente formato: `"objeto-Astro {nombre: X, brillo: Z, distancia: K}"`; p.e., `"objeto-Astro {nombre: Sirius, brillo: -1.42, distancia: 8.7}"`
    public String toString() {

         return "objeto-Astro " + "{nombre: " + this.nombre + ", brillo: " + this.brillo + ", distancia: " + this.distancia + "}";
    }


    //Para comprobar si dos objetos `Astro` son iguales. Dos astros son iguales si todos sus atributos coinciden. Puedes generarlo automáticamente pulsando con el botón derecho del ratón en el editor y seleccionando la opción `generate/equals()`.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Astro astro = (Astro) o;
        return Double.compare(astro.brillo, brillo) == 0 &&
                Double.compare(astro.distancia, distancia) == 0 &&
                Objects.equals(nombre, astro.nombre);
    }


}