 package com.example.catalogoastronomico;
/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
class Principal {
   public static void main(String[] main) {
      Astro marte, otro;
      marte = new Astro("marte", 2.3, 0.5);
      otro = new Astro();
      System.out.println(otro.toString());
      System.out.println(marte.toString());


      if(marte.masBrillante(otro)==1){
         System.out.println(marte.getNombre() + " es más brillante que " + otro.getNombre());
      }else {
         System.out.println(marte.getNombre() + " no es más brillante que " + otro.getNombre());
         System.out.println("Concretamente a una distancia de " + marte.getDistancia() + " años luz.");
      }

      if(marte.masDistante(otro)== true){
         System.out.println(marte.getNombre() + " esta mas lejos de la Tierra que " + otro.getNombre());
      }else{
         System.out.println(otro.getNombre() + " está más lejos de la Tierra que " + marte.getNombre());
         System.out.println("Concretamente a una distancia de " + otro.getDistancia() + " años luz.");
      }

      Galaxia ViaLactea = new Galaxia("ViaLactea", 20.1, 34.2);
      Estrella Sol = new Estrella("Alpha", 7.8, 14, 8, ViaLactea);
      Planeta Jupiter = new Planeta("Jupiter", 2.3, 0.9, false, Sol);
      System.out.println(ViaLactea.toString());
      System.out.println(Sol.toString());
      System.out.println(Jupiter.toString());

      System.out.println(ViaLactea.getNombre());
      System.out.println(Jupiter.getBrillo());
      System.out.println(Sol.getDistancia());


   }



}