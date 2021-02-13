package co.com.sanchezacero.ejercicio;

public class Electrodomestico {
    int precioBase;
    private String color;
    char consumoEnergetico;
    int peso;

    public Electrodomestico(){
        color="blanco";
        consumoEnergetico='F';
        precioBase=100;
        peso=5;
    }

    public Electrodomestico(int precioBase,int peso){
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public int getPrecioBase(){
        return precioBase;
    }
    
    public String getColor(){
        return this.color;
    }
    public int getPeso(){
        return this.peso;
    }
   
}
