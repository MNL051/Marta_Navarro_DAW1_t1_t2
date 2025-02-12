package Carrera;

public class Carrera {

    private Coche coche1;
    private Coche coche2;

    private int kmTotales;
    private int vueltas;

    //constructor
    public Carrera(Coche coche1, Coche coche2, int kmTotales, int vueltas){
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.kmTotales = kmTotales;
        this.vueltas = vueltas;
    }

    public void IniciarCarrera(){
        System.out.println("Inicia la carrera");

        coche1.mostrarDatos();
        coche2.mostrarDatos();

        for (int i=1; i <= vueltas; i++){
            System.out.println("\n Vuelta " + i);

            coche1.acelerar();
            coche2.acelerar();

            System.out.println("Kilometros restantes para "+ coche1.getNombre()+ " es de: " + Math.max(kmTotales - coche1.getKmRecorridos(),0));
            System.out.println("Kilometros restantes para "+ coche2.getNombre()+ " es de: " + Math.max(kmTotales - coche2.getKmRecorridos(),0));
            /* el metodo Math.max devuelve el número con el valor más alto de un par de números
            sout = Math.max(a,b); => sout = Math.max(resta de km faltantes,0)
            Así, si la resta da un valor negativo en la consola saldrá 0
             */
        }

        System.out.println("Fin de la carrera");
        System.out.println("Distancia total recorrida de: "+ coche1.getNombre() + " = " + coche1.getKmRecorridos() + " km");
        System.out.println("Distancia total recorrida de: "+ coche2.getNombre() + " = " + coche2.getKmRecorridos() + " km");


    }
}

