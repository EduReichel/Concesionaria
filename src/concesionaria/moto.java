
package concesionaria;


public class moto extends vehiculo {
    
    public moto(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }
    
    int cilindradas;

    public moto(String marca, String modelo,int cilindradas, double precio) {
        super(marca, modelo, precio);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString (){
    return ("Marca: " + moto.super.marca +
            " // Modelo: " + moto.super.modelo +
            " // Cilindrada: " + moto.this.cilindradas + "c" + 
            " // Precio: $" + moto.super.precio);
    }
    

}
