public class Main {
    public static void main(String[] args) {

        Alumno[] alumnos = new Alumno[5];

        alumnos[0] = new Alumno("Carlos", 10);
        alumnos[1] = new Alumno("Iván", 8);
        alumnos[2] = new Alumno("Iker", 9);
        alumnos[3] = new Alumno("Dani", 7);
        alumnos[4] = new Alumno("Isabella", 6);

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i].mostrarDatos();
        }
    }
}