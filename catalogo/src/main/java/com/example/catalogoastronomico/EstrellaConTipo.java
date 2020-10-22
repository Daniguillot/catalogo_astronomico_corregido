package com.example.catalogoastronomico;

import java.util.Objects;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class EstrellaConTipo extends Estrella{
    // Atributos //
    private TipoEstrella tipoEstrella;

    // Constructor //
    public EstrellaConTipo(String nombre, double brillo, double distancia, int planetas, Galaxia galaxia, TipoEstrella tipoDeEstrella) {
        super(nombre, brillo, distancia, planetas, galaxia);
        this.tipoEstrella = tipoDeEstrella;
    }

    // Getters y setters //
    public TipoEstrella getTipo() {
        return tipoEstrella;
    }

    public void setTipo(TipoEstrella tipoEstrella) {
        this.tipoEstrella = tipoEstrella;
    }

    // Métodos //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EstrellaConTipo that = (EstrellaConTipo) o;
        return getTipo() == that.getTipo();
    }

    @Override
    public String toString() {
        return "objeto-Astro {" +
                "nombre: " + this.getNombre() +
                ", tipo: Estrella" +
                ", brillo: " + this.getBrillo() +
                ", distancia: " + this.getDistancia() +
                ", planetas: " + this.getPlanetas() +
                ", galaxia: " + this.getGalaxia().getNombre() +
                ", info: " + tipoEstrella +
                " }";
    }
}
