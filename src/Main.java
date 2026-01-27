public class Main {
    public static void main(String[] args) {

        Alumno[] alumnos = new Alumno[5];

        alumnos[0] = new Alumno("Carlos", 10);
        alumnos[1] = new Alumno("Iván", 4);
        alumnos[2] = new Alumno("Iker", 8);
        alumnos[3] = new Alumno("Dani", 7);
        alumnos[4] = new Alumno("Isabella", 3);

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota() >= 5) {
                alumnos[i].mostrarDatos();
            }

        }
    }
}