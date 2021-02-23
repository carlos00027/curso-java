package co.com.sanchezacero.ejercicio;

public class Television extends Electrodomestico {
    protected final static int resolucionDefecto = 20;
    protected final static boolean sintonizarDefecto = false;
    
    protected int resolucion;
    protected boolean sintonizador;

    public Television(){
        super(precioBaseDefault,pesoDefault,consumoEnergeticoDefault,colorDefault);
        this.resolucion = resolucionDefecto;
        this.sintonizador = sintonizarDefecto;
    }    
    public Television(int precio,int peso){
        super(precio,peso,consumoEnergeticoDefault,colorDefault);
        this.resolucion = resolucionDefecto;
        this.sintonizador = sintonizarDefecto;
    }

    public Television(int precio, int peso, char consumoEnergetico,String color,int resolucion,boolean sintonizador){
        super(precio,peso,consumoEnergetico,color);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int precioFinal(){
        
        int total = super.precioFinal();
  
        if (resolucion>40){
            total+=precioBase*0.3;
        }
        if (sintonizador){
            total+=50;
        }
  
        return total;
    }
}
