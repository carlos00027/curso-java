package co.com.sanchezacero.ejercicio;

public class Lavadora extends Electrodomestico {
    private final static int cargaDefault = 5;

    private int carga;

    public Lavadora(){
        super(precioBaseDefault,pesoDefault,consumoEnergeticoDefault,colorDefault);
        this.carga = cargaDefault;
    }

    public Lavadora(int precioBase,int peso){
        super(precioBase,peso,consumoEnergeticoDefault,colorDefault);
        this.carga = cargaDefault;
    }
    
    public Lavadora(int precio, int peso, char consumo,String color, int carga){
        super(precio,peso, consumo,color);
        this.carga = carga;   
    }
    
    public int getCarga() {
        return carga;
    }
    public int precioFinal() {
        int adicional= super.precioFinal();
        if(carga >= 30){
            adicional += 50;
        }
        return adicional;
    }
}