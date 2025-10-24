package tema2_debug;

import java.util.Scanner;

public class MediaNotasModularizado {

	public static void main(String[] args) { //en el main llamo a las funciones ppedirNumeroAlumnos y calcularMedia
        Scanner sc = new Scanner(System.in);

        int numAlumnos = pedirNumeroAlumnos(sc);
        double media = calcularMedia(numAlumnos, sc);

        System.out.printf("La media del grupo es: %.2f", media);

        sc.close();
    }


    private static int pedirNumeroAlumnos(Scanner sc) { //pido el numero de alumnos y se verifica que sea un numero valido
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

    private static double calcularMedia(int numAlumnos, Scanner sc) { //se calcula la media de los alumnos, para ello, llamo a la funcion pedirNotaAlumno
        double suma = 0;
        for (int i = 1; i <= numAlumnos; i++) {
            double nota = pedirNotaAlumno(i, sc);
            suma += nota;
        }
        return suma / numAlumnos;
    }
    
    private static double pedirNotaAlumno(int numeroAlumno, Scanner sc) { //se pide la nota del alumno correspondiente y se verifica que sea valida para poder usarse en el calculo de la media
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


    
}
