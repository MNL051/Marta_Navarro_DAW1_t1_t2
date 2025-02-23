package Carrera;
import java.util.Scanner;
import java.lang.Math;


public class Coche {

    private String nombre, marca, matricula;
    private int cc, cv, velocidad, kmRecorridos;

    //constructor del vehiculo
    public Coche(String nombre, String marca, String matricula, int cc, int cv, int velocidad, int kmRecorridos){
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

        System.out.println("\nnombre: " + nombre);
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
        int incremento;

        do{
            System.out.print(nombre + " Ingrese la velocidad a acelerar (debe de ser más de 10): \n" ); //ingresar valor a subir la velocidad
            incremento = scanner.nextInt(); //al inngresar el dato (como numero entero) se guarda en la variable incremento
            if (incremento < 10) {

                System.out.println(nombre + " El incremento debe ser al menos 10.");
            }
        }while (incremento < 10);

        if (cv < 100){

            velocidad += (int)(Math.random()* incremento);

        }
        else{

            velocidad += 10 + (int)(Math.random()*incremento);
        }
        velocidad += incremento;
        kmRecorridos += velocidad * 0.5; //incremento los km recorridos en un 50% de la velocidad actual


        System.out.println("Kilometros recorridos hasta ahora: " + kmRecorridos + " km/h \n");

    }

    int getKmRecorridos(){
        return kmRecorridos;
    }

    String getNombre(){
        return nombre;
    }

    String getMatricula(){
        return matricula;
    }

}
