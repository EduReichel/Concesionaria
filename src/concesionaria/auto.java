
package concesionaria;


public class auto extends vehiculo {
    
    public auto(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }
    
    int cantPuertas;

    public auto( String marca, String modelo,int cantPuertas ,double precio) {
        super(marca, modelo, precio);
        this.cantPuertas = cantPuertas;
    }
    
    @Override
    public String toString (){
    return ("Marca: " + auto.super.marca +
            " // Modelo: " + auto.super.modelo +
            " // Puertas: " + auto.this.cantPuertas + 
            " // Precio: $" + auto.super.precio);
    }
    
    
}

