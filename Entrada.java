import Carrera.Coche;

public class Entrada {

    public static void main (String[] args){

        //constructores
        Coche coche1 = new Coche("Participante1","Honda",5555,150,70, 120,3000);
        Coche coche2 = new Coche("Participante2","Toyota",1234,102, 80, 120, 1200);

       coche1.mostrarDatos();
       coche1.acelerar();

    }
}

