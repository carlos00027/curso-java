package co.com.sanchezacero.ejercicio;

public class ElectrodomesticosApp {
    public static void main(String[] args) {
        Electrodomestico listado[]=new Electrodomestico[10];
        
        listado[0] = new Electrodomestico(120,60,'c',"verde");
        listado[1] = new Lavadora(110,30);
        listado[2] = new Television(510,80,'e',"negro",42,false);
        listado[3] = new Electrodomestico();
        listado[4] = new Electrodomestico(410,20,'d',"gris");
        listado[5] = new Lavadora(310,40,'z',"blanco",40);
        listado[6] = new Television(150,70);
        listado[7] = new Lavadora(210,100,'a',"verde",15);
        listado[8] = new Television(210,60,'c',"naranja",30,true);
        listado[9] = new Electrodomestico(510,10);
        
        int totalElectro = 0;
        int totalTelevisores = 0;
        int totalLavadoras = 0;

        for (int i = 0; i < listado.length; i++) {
            if(listado[i] instanceof Electrodomestico){
                totalElectro+=listado[i].precioFinal();
            }
            if(listado[i] instanceof Lavadora){
                totalLavadoras+=listado[i].precioFinal();
            }
            if(listado[i] instanceof Television){
                totalTelevisores+=listado[i].precioFinal();
            }
        }

        System.out.println("total electrodomestico es: "+ totalElectro);
        System.out.println("total lavadora es: "+ totalLavadoras);
        System.out.println("total televisor es: "+ totalTelevisores);

        System.out.println("precion final total: "+(totalElectro+totalLavadoras+totalTelevisores));

    }
}
