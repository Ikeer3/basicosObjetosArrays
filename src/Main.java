public class Main {
    public static void main(String[] args) {

        Alumno[] alumnos = new Alumno[5];

        alumnos[0] = new Alumno("Carlos", 1);
        alumnos[1] = new Alumno("Iván", 4);
        alumnos[2] = new Alumno("Iker", 8);
        alumnos[3] = new Alumno("Dani", 7);
        alumnos[4] = new Alumno("Isabella", 3);

        int suma = 0;
        Alumno mejorAlumno = alumnos[0];

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i].mostrarDatos();
            suma = suma + alumnos[i].getNota();
            if (alumnos[i].getNota() > mejorAlumno.getNota()) {
                mejorAlumno = alumnos[i];
            }
            // if (alumnos[i].getNota() >= 5) {
            //    alumnos[i].mostrarDatos();
            // }
        }
        double media = (double) suma / alumnos.length;
        System.out.print("\n--------------------------------------------------");
        System.out.printf("\nMedia: %.2f", media);
        System.out.println("\nLa nota más alta es de: " + mejorAlumno.getNombre() + " con un " + mejorAlumno.getNota());
    }
}