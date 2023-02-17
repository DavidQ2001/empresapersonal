package Entidades;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int edadMinima = 50;
        //declaracion de un arraylist

        ArrayList<Celular> candidatos = new ArrayList<Celular>();
        ArrayList<Empleado> personalSoft = new ArrayList<Empleado>();

        //arreglo que tendra los cargos para los empleados
        String[] cargos = {"Jefe", "Developer Intemediate", "Developer Junior", "Coordinador", "Director IT", "QA"};

        //creamos personas para la lista de candidatos
        Celular p1 = new Celular(1, "43243244", "Carolina", "Yeimmy", "Triana", "Rodriguez", "3422343232", "Tunja", 35);
        Celular p2 = new Celular(1, "43248765", "David", "Esteban", "Quintero", "Quintero", "3422346666", "Medellin", 18);
        Celular p3 = new Celular(1, "43899944", "Erika", "Viviana", "Quintero", "Pancha", "3422348888", "Medellin", 60);
        Celular p4 = new Celular(1, "43543244", "Andres", "Felipe", "Espejo", "Quintero", "3445643232", "Tolima", 28);
        Celular p5 = new Celular(1, "41023244", "Juan", "Esteban", null, "Gomez", "3422300032", "Envigado", 23);
        Celular p6 = new Celular(1, "43247774", "Andrea", "Nathalia", "Gomez", "Pimiento", "3422999232", "Medellin", 29);

        //añadir el elemento
        candidatos.add(p1);
        candidatos.add(p2);
        candidatos.add(p3);
        candidatos.add(p4);
        candidatos.add(p5);
        candidatos.add(p6);

        for (int i = 0; i < candidatos.size(); i++) {
            //validar la edad de los candidatos para crear una seleccion y agregar al grupo de personal soft
            if (candidatos.get(i).getEdad() > edadMinima) {
                Empleado aux = new Empleado();
                aux.setTipoDocumento(candidatos.get(i).getTipoDocumento());
                aux.setNumeroDocumento(candidatos.get(i).getNumeroDocumento());
                aux.setPrimerNombre(candidatos.get(i).getPrimerNombre());
                aux.setSegundoNombre(candidatos.get(i).getSegundoNombre());
                aux.setPrimerApellido(candidatos.get(i).getPrimerApellido());
                aux.setSegundoApellido(candidatos.get(i).getSegundoApellido());
                aux.setTelefono(candidatos.get(i).getTelefono());
                aux.setDireccion(candidatos.get(i).getDireccion());
                aux.setEdad(candidatos.get(i).getEdad());

                personalSoft.add(aux);


            }

        }

        for (int i = 0; i < personalSoft.size(); i++) {
            //Generamos numero aleatorio para comparar con el arreglo de los cargos
            int numeroArreglo = (int) (Math.random() * 6);
            personalSoft.get(i).setCargo(cargos[numeroArreglo]);
        }

        int value = 0;

        while (value < personalSoft.size()) {
            boolean valide = false;
            int exp = (int) (Math.random() * 20) + 1;

            if (valide) {
                personalSoft.get(value).generarExperiencia(valide, (value + 1));

            } else {
                personalSoft.get(value).generarExperiencia(valide, (value));

            }
            value++;
        }

        for (int i = 0; i < personalSoft.size(); i++) {
            personalSoft.get(i).mostrarDatos();

        }

    }

}