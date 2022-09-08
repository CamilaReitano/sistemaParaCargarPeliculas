/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicio;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioPelicula {
    ArrayList<Pelicula> peliculas = new ArrayList();
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula(){
        System.out.println("Introdusca el titulo");
        String titulo = leer.next();
        System.out.println("Introdusca el director");
        String director = leer.next();
        System.out.println("Introdusca la duracion");
        Integer duracion = leer.nextInt();
        
        return new Pelicula(titulo, director, duracion);
    }
    
    public void crearListaPelicula (){
        
        int op = 0;
        do{
            peliculas.add(crearPelicula());
            System.out.println("Desea cargar una pelicula nueva? 1-Si 2-No");
            op = leer.nextInt();
        } while (op==1);
    }
    
    //• Mostrar en pantalla todas las películas.
    
    public void mostrarPeliculas(){
        System.out.println("Peliculas de la lista");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
    
   // • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mayorUnaHora(){
        System.out.println("Peliculas mayor a una hora");
        for (Pelicula pelicula : peliculas) {
                if(pelicula.getDuracion()>1){
                System.out.println(pelicula);
            }
        }
    }
    
   // • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
    
    public void mayorAMenor(){
       Collections.sort(peliculas, Comparadores.ordenarPorDuracion);
        System.out.println("Ordenadas de mayor a menor");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
    
   // • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    
      public void menorAMayor(){
       Collections.sort(peliculas, Comparadores.ordenarMenorDuracion);
        System.out.println("Ordenadas de menor a mayor");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
      
   //   • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    
    public void alfabeticaenteTitulo(){
       Collections.sort(peliculas, Comparadores.ordenarAlfabeticamenteTitulo);
        System.out.println("Ordenadas por titulo alfabeticamente");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
    
    
     public void alfabeticaenteDirector(){
       Collections.sort(peliculas, Comparadores.ordenarAlfabeticamenteDirector);
        System.out.println("Ordenadas por director alfabeticamente");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
}
