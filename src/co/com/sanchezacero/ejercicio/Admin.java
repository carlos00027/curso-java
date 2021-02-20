package co.com.sanchezacero.ejercicio;

public class Admin {
    public static void main(String[] args) {
        Electrodomestico aqui = new Electrodomestico();
        System.out.println("aaaaa"+aqui.getColor());
        aqui.comprobarConsumoEnergetico('a');
        System.out.println("ccc "+aqui.precioFinal());
        
    }
}
