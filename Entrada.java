import Carrera.Carrera;
import Carrera.Coche;

public class Entrada {

    public static void main (String[] args){

        //constructores
        Coche coche1 = new Coche("Participante1","Honda","11111A",150,102, 120,0);
        Coche coche2 = new Coche("Participante2","Toyota","22222B",102, 90, 120, 0);


        Carrera carrera = new Carrera(coche1,coche2,500,2);
        carrera.IniciarCarrera();

    }
}

