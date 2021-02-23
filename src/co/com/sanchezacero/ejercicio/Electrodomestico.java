package co.com.sanchezacero.ejercicio;

import java.util.Arrays;

public class Electrodomestico {
    protected final static char consumoEnergeticoDefault = 'f';
    protected final static String colorDefault = "blanco";
    protected final static int precioBaseDefault = 100;
    protected final static int pesoDefault = 5;

    protected int precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;
    protected String[] colores = {"blanco","negro","rojo","azul","gris"};
    protected char[] consumos = {'a','b','c','d','e','f'};

    public Electrodomestico(){
        precioBase = precioBaseDefault;    
        peso = pesoDefault;
        color = colorDefault;
        consumoEnergetico = consumoEnergeticoDefault;
    }


    public Electrodomestico(int precio,int peso){
        precioBase = precio;
        this.peso = peso;
        this.color = colorDefault;
        this.consumoEnergetico = consumoEnergeticoDefault;   
    }

    public Electrodomestico(int precio,int peso,char consumo,String color){
        precioBase=precio;
        this.peso=peso;

        comprobarConsumoEnergetico(consumo);
        comprobarColor(color);
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
        //System.out.println( "consumo "+existe);
        if(!existe){
            letra = consumoEnergeticoDefault;
        }
        consumoEnergetico = letra;
    }

    protected String comprobarColor(String color){
        String[] arrayColores = {"blanco","negro","rojo","azul","gris"};
        boolean existe = Arrays.asList(arrayColores).contains(color);
        if(!existe){
            color = colorDefault;
        }
        return color;
    }
    
    public int precioFinal(){
        int adicional = 0;
        if(consumoEnergetico == 'a'){
            adicional += 100;
        }else if(consumoEnergetico == 'b'){
            adicional += 80;
        }else if(consumoEnergetico == 'c'){
            adicional += 60;
        }else if(consumoEnergetico == 'd'){
            adicional += 50;
        }else if(consumoEnergetico == 'e'){
            adicional += 30;
        }else if(consumoEnergetico == 'f'){
            adicional += 10;
        }

        if(peso >= 0 && peso <=19){
            adicional += 10;
        }else if(peso >=20 && peso <= 49){
            adicional += 50;
        }else if(peso >= 50 && peso <= 79){
            adicional += 80;
        }else if(peso >= 80){
            adicional += 100;
        }

        return precioBase + adicional;
    }
   
}
