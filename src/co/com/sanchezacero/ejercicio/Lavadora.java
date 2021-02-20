package co.com.sanchezacero.ejercicio;

public class Lavadora extends Electrodomestico {
    private final int carga;

    public Lavadora(){
        super();
        carga = 5;
    }
    public Lavadora(int carga,int peso){
        super();
        this.carga = carga;
        this.peso = peso;
    }
    public Lavadora(int carga, int precio,String color,char consumo,int peso){
        super(precio, color, consumo, peso);
        this.carga = carga;
        
    }
    public int getCarga() {
        return carga;
    }
    public int precioFinal() {
        return carga;
    }
}