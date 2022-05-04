package Examen;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Coche> concesionario = new ArrayList<>();

        // Almacen de objetos de la clase Coche
        concesionario.add(new Coche("bmw", 1234, 2000, 40000));
        concesionario.add(new Coche("audi", 4812, 2015, 35000));
        concesionario.add(new Coche("jaguar", 1314, 2006, 69000));
        concesionario.add(new Coche("ferrari", 3189, 1984, 97000));
        concesionario.add(new Coche("mercedes", 1013, 2022, 105000));
        concesionario.add(new Coche("kia", 4251, 2018, 20000));

        // Mostrar primero y último

        System.out.println(concesionario.get(0));
        System.out.println(concesionario.get(concesionario.size() - 1));

        // Eliminar los coches anteriores a 2010

        concesionario.removeIf(c -> c.getAño() < 2010);
        // Ordenar por matricula

        Collections.sort(concesionario);
        System.out.println(concesionario);

        // HashMap
        HashMap<Integer, Coche> map = new HashMap<>();

        for (int i = 0; i < concesionario.size(); i++) {

            Coche c = concesionario.get(i);
            map.put(c.getMatricula(), c);
        }

        // Solicitar id y mostrar información

        System.out.print("¿Que matricula quiere consultar?: ");

        int respuesta = sc.nextInt();

        if (map.get(respuesta) != null) {
            System.out.println(map.get(respuesta));
        } else {
            System.out.println("No se encuentra un coche con esa matricula");
        }
        sc.close();
    }

}
