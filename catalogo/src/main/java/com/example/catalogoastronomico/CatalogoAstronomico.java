package com.example.catalogoastronomico;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class CatalogoAstronomico {

    private ArrayList catalogo;
    private HashSet galaxias;
    int numEstrellasSimpleVista;

    //--------------------------------------------GETTERS------------------------------------


    public ArrayList getCatalogo() {
        return catalogo;
    }

    public HashSet getGalaxias() {
        return galaxias;
    }

    public int getNumEstrellasSimpleVista() {
        return numEstrellasSimpleVista;
    }

    //-------------------------------------------CONSTRUCTOR----------------------------------

    public CatalogoAstronomico(){
        this.catalogo = new ArrayList();
        this.galaxias = new HashSet();
    }

    //---------------------------------------------METODOS------------------------------------

    public boolean esEstrellaSimpleVista(int i){

        if(((Astro) catalogo.get(i)).visibleCon() == "a simple vista"){
            return true;
        }else{
            return false;
        }
    } //Devuelve true si el Astro en una posición válida del catálogo es una estrella visible a simple vista


    public boolean anade(Astro a){

        int esta = 0;
        for (int i=0 ; i< catalogo.size(); i++){

            if(a == ((Astro) catalogo.get(i)) ){
                esta=1;
            }else{
                esta=2;
            }
        }

        if (esta==2){
            catalogo.add(a);
            return true;
        }else{
            return false;
        }
    } //Añade un astro al catálogo (comprueba que no esté repetido) y devuelve true si se ha podido añadir


    public void borrar(String nombre){
        for (int i=0; i < catalogo.size();i++){
            if( ((Astro)catalogo.get(i)).getNombre() == nombre){
                catalogo.remove(i);
            }
        }
    } //Elimina el astro con el nombre indicado


    public Astro buscaAstro(String nombre){
        Astro buscado = null;

        for (int i=0; i < catalogo.size(); i++){
            if (((Astro) catalogo.get(i)).getNombre() == nombre){
                buscado = ((Astro) catalogo.get(i));
            }
        }
        return buscado;
    } //Busca un astro por su nombre


    public Astro primeroMasBrillanteQue(Astro a){
        Astro masBrillante = null;

        for (int i=0; i< catalogo.size(); i++) {
            if (((Astro) catalogo.get(i)).masBrillante(a) == 1) {
                masBrillante = ((Astro) catalogo.get(i));
            } else {

            }
        }
        return masBrillante;
    } // Devuelve el primer Astro del catálogo que es más brillante en magnitud absoluta que un Astro dado (devuelve el primero que cumpla esa condición)


    public List<Astro> filtraEstrellaSimpleVista(){
        ArrayList simples = new ArrayList();
        for (int i=0; i< catalogo.size(); i++){
            if( ((Astro) catalogo.get(i)).visibleCon() == "a simple vista" ){
                simples.add( ((Astro) catalogo.get(i)) );
            }
        }
        return simples;
    } //Devuelve una lista de objetos Astro con las estrellas visibles a simple vista que contiene el catálogo


    public Astro brillaMas(){
        Astro elMas = null;

        for (int i=0; i< catalogo.size(); i++){
            elMas= ((Astro) catalogo.get(0));
            if (((Astro) catalogo.get(i)).masBrillante(elMas)==1){
                elMas= ((Astro) catalogo.get(i));
            }
        }
        return elMas;
    } //Devuelve el Astro que es más brillante en magnitud absoluta de todos los del catálogo

}