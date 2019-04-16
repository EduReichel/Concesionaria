
package concesionaria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Concesionaria {

    public static void main(String[] args) {
        
        List<vehiculo> vehiculo = new ArrayList<>(Arrays.asList(
        new auto("Peugeot", "206", 4, 200000),
        new moto ( "Honda", "Titan",125, 60000),
        new auto ("Peugeot", "208",5, 250000),
        new moto ( "Yamaha", "YBR",160, 80500.5)
        
        ));
        
       //Imprimir por pantalla cada vehiculo con sus atributos sin depender de la cantidad de autos
        
        for (int i=0; i < vehiculo.size(); i++) {
            
            System.out.println(vehiculo.get(i));
        }
     
       System.out.println("============================");
        
       // AUTO MÄS CARO Y MÁS BARATO
              
       int n= vehiculo.size();
       vehiculo.sort((o1, o2) -> Double.compare(o2.getPrecio(), o1.getPrecio()));
      
       System.out.println( "Vehículo más caro: "  + vehiculo.get(0).getMarca() + " " + vehiculo.get(0).getModelo());
       System.out.println( "Vehículo más caro: "  + vehiculo.get(n-1).getMarca() + " " + vehiculo.get(n-1).getModelo());
       //QUE CONTENGA LA LETRA Y
       
       int valores []= new int[vehiculo.size()];
       
       for (int i=0 ; i<vehiculo.size(); i++) {       
        String str = vehiculo.get(i).getModelo(); 
        
         if (str.matches(".*[Y].*") == true){
           valores[i]=0;
       } else {
           valores[i]=1;}
       }
       
       for (int i=0; i<vehiculo.size(); i++){
         if (valores[i] == 0){
           int posicion=i;
               System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + 
                       vehiculo.get(posicion).getMarca() + " " +
                       vehiculo.get(posicion).getModelo()+ " $" +
                       vehiculo.get(posicion).getPrecio()
                       );
            }
       }
       
      System.out.println("====================");
     
      //ORDENAR DE MAYOR A MENOR
     
          
      System.out.println("Vehículos ordenados por precio de mayor a menor: ");
       
      for (int i=0; i < vehiculo.size(); i++) {                   
            System.out.println(vehiculo.get(i).getMarca() + " " + vehiculo.get(i).getModelo());
        }
    }
}