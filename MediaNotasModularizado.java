package tema2_debug;

import java.util.Scanner;

public class MediaNotasModularizado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numAlumnos = pedirNumeroAlumnos(sc);
        double media = calcularMedia(numAlumnos, sc);

        System.out.println("La media del grupo es: " + media);

        sc.close();
    }


    public static int pedirNumeroAlumnos(Scanner sc) {
        int numAlumnos;
        do {
            System.out.print("Introduce el número de alumnos: ");
            numAlumnos = sc.nextInt();
            if (numAlumnos <= 0) {
                System.out.println("El número de alumnos debe ser mayor que 0.");
            }
        } while (numAlumnos <= 0);
        return numAlumnos;
    }


    public static double pedirNotaAlumno(int numeroAlumno, Scanner sc) {
        double nota;
        do {
            System.out.print("Introduce la nota del alumno " + numeroAlumno + ": ");
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("La nota debe estar entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }


    public static double calcularMedia(int numAlumnos, Scanner sc) {
        double suma = 0;
        for (int i = 1; i <= numAlumnos; i++) {
            double nota = pedirNotaAlumno(i, sc);
            suma += nota;
        }
        return suma / numAlumnos;
    }
}
