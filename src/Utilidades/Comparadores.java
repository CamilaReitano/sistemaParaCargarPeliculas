
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPorDuracion = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t1.getDuracion().compareTo(t.getDuracion());
        }
        
    };
    
     public static Comparator<Pelicula> ordenarMenorDuracion = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getDuracion().compareTo(t1.getDuracion());
        }
        
    };
     
      public static Comparator<Pelicula> ordenarAlfabeticamenteTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getTitulo().compareTo(t1.getTitulo());
        }
        
    };
      
      
       public static Comparator<Pelicula> ordenarAlfabeticamenteDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getDirector().compareTo(t1.getDirector());
        }
        
    };
}
