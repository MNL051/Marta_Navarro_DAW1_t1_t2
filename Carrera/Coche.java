package Carrera;
import java.util.Scanner;
import java.lang.Math;


public class Coche {

    private String nombre, marca;
    private int matricula, cc, cv, velocidad, kmRecorridos;

    //constructor del vehiculo
    public Coche(String nombre, String marca, int matricula, int cc, int cv, int velocidad, int kmRecorridos){
        this.nombre = nombre;
        this.marca = marca;
        this.matricula = matricula;
        this.cc = cc;
        this.cv = cv;
        this.velocidad = velocidad;
        this.kmRecorridos = kmRecorridos;
    }

    public void mostrarDatos(){
        //función para imprimir los datos en la consola

        System.out.println("\n nombre: " + nombre);
        System.out.println("marca = " + marca);
        System.out.println("matricula = " + matricula);
        System.out.println("cc = " + cc);
        System.out.println("cv = " + cv);
        System.out.println("velocidad = " + velocidad);
        System.out.println("kmRecorridos = " + kmRecorridos);
    }

    public void acelerar(){
        /*metodo para aumentar la velocidad del coche y actualizar los km recorrido, con un parámetro a escribir
        que no sea inferior a 10, a partir del cv del vehículo */

        Scanner scanner = new Scanner(System.in); //para ingresar datos con el teclado
        System.out.print(nombre + " Ingrese la velocidad: " ); //ingresar valor a subir la velocidad
        int incremento = scanner.nextInt(); //al inngresar el dato (como numero entero) se guarda en la variable incremento

        if (incremento < 10) {

            System.out.println(nombre + " El incremento debe ser al menos 10.");
            return; //RECORDATORIO: return no sirve para volver a pedir los datos en caso de error
        }

        if (cv < 100){

            incremento = (int)(Math.random()*20)+1; // [0,20], de prueba

        }
        else{

            incremento = 10 + (int)(Math.random()*20)+1; // [10,20], de prueba
        }
        this.velocidad += incremento;
        this.kmRecorridos += this.velocidad * 0.5; //incremento los km recorridos en un 50% de la velocidad actual


        System.out.println("Nueva velocidad alcanzada: " + velocidad + " km/h");
        System.out.println("Kilometros recorridos hasta ahora: " + kmRecorridos + " km \n");

    }

    int getKmRecorridos(){
        return kmRecorridos;
    }
    String getNombre(){
        return nombre;
    }

}
