package co.com.sanchezacero.ejercicio;

import java.util.Arrays;

public class Electrodomestico {
    int precioBase;
    String color;
    char consumoEnergetico;
    int peso;
    String[] colores = {"blanco","negro","rojo","azul","gris"};
    char[] consumos = {'a','b','c','d','e','f'};

    public Electrodomestico(){
        precioBase=100;    
        color="blanco";
        consumoEnergetico='f';
        peso=5;
    }


    public Electrodomestico(int precio,int peso){
        precioBase = precio;
        this.peso = peso;
        
        color="blanco";
        consumoEnergetico='f';
    }

    public Electrodomestico(int precio,String color,char consumo,int peso){
        precioBase=precio;    
        this.color=color;
        consumoEnergetico=consumo;
        this.peso=peso;
    }

    public int getPrecioBase(){
        return precioBase;
    }
    public String getColor(){
        return this.color;
    }
    public char getConsumoEnergetico(){
        return consumoEnergetico;
    }
    public int getPeso(){
        return peso;
    }

    public void setPrecioBase(int precio){
        precioBase = precio;
    }

    protected void comprobarConsumoEnergetico(char letra){
        //boolean existe = Arrays.asList(consumos).contains(letra);
        boolean existe = false;
        for (int i = 0; i < consumos.length; i++) {
            if(consumos[i] == letra){
                existe = true;
                break;
            }    
        }
        System.out.println( "consumo "+existe);
        if(!existe){
            letra = 'f';
        }
        consumoEnergetico = letra;
    }
    protected String comprobarColor(String color){
        String[] arrayColores = {"blanco","negro","rojo","azul","gris"};
        boolean existe = Arrays.asList(arrayColores).contains(color);
        if(!existe){
            color = "blanco";
        }
        return color;
    }
    public int precioFinal(){
        
        if(consumoEnergetico == 'a'){
            setPrecioBase(100);
        }else if(consumoEnergetico == 'b'){
            setPrecioBase(80);
        }else if(consumoEnergetico == 'c'){
            setPrecioBase(60);
        }else if(consumoEnergetico == 'd'){
            setPrecioBase(50);
        }else if(consumoEnergetico == 'e'){
            setPrecioBase(30);
        }else if(consumoEnergetico == 'f'){
            setPrecioBase(10);
        }

        return precioBase;
    }
   
}
