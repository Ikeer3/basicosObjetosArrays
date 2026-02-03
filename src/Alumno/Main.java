package Alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Alumno[] alumnos = new Alumno[5];

        alumnos[0] = new Alumno("Carlos", 6);
        alumnos[1] = new Alumno("Iván", 9);
        alumnos[2] = new Alumno("Iker", 9);
        alumnos[3] = new Alumno("Dani", 7);
        alumnos[4] = new Alumno("Isabella", 5);

        int suma = 0;
        int mejorAlumno = 0;

        for (int i = 0; i < alumnos.length; i++) {
            suma = suma + alumnos[i].getNota();
            if (alumnos[i].getNota() >= 5) {
                alumnos[i].mostrarDatos();
            }
            if (alumnos[i].getNota() > alumnos[mejorAlumno].getNota()) {
                mejorAlumno = i;
            }

        }
        System.out.print("\n--------------------------------------------------");

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[mejorAlumno].getNota() == alumnos[i].getNota()) {
                System.out.print("\nLas notas más altas son de: " + alumnos[i].getNombre() + " con un " + alumnos[i].getNota());
            }
        }
        double media = (double) suma / alumnos.length;
        System.out.println();
        System.out.printf("\nMedia: %.2f", media);

        Scanner escaner = new Scanner(System.in);

        System.out.print("\n--------------------------------------------------");
        System.out.print("\nQue nombre quieres buscar?: ");
        String nombre = escaner.next();

        boolean encontrado = false;
        int posicion = 0;

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Alumno encontrado! Su nota es: " + alumnos[posicion].getNota());
        } else {
            System.out.println("Alumno no encontrado");
        }
    }
}