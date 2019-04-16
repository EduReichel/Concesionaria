package concesionaria;




public class vehiculo implements Comparable<vehiculo> {
    
    public String marca;
    public String modelo;
    public double precio;
   
   
    public vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio =  precio;
    }

   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio =  precio;
    }
   
 

    @Override
    public int compareTo(vehiculo o) {
           if (precio < o.precio) {
                return -1;
            }
            if (precio > o.precio) {
                return 1;
            }
            return 0;
        }
}

 