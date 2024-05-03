import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión Java de ALURA!");
        //System.out.println("Película Matrix");

        //DECLARACION DE VARIABLES
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        double mediaEvaluacionUsuario = 0;
        int i = 0;
        double notaMatrix;

        System.out.println("Película: " + nombre);
        System.out.println("Fecha Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Se Incluye en Plán Básico: " + incluidoEnElPlanBasico);
        System.out.println("Media de la Evaluación de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película Popular en el momento");
        } else {
            System.out.println("Película Retro que vale la pena ver");
        }
        //EJEMPLO CON FOR
        //for (int i = 0; i < 3; i++) {
        //    Scanner teclado = new Scanner(System.in);
        //    System.out.println("Ingresa la nota que le darías a Matrix");
        //    double notaMatrix = teclado.nextDouble();
        //    mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        //}

        //EJEMPLO CON WHILE - FORMA 1
        //while (i < 3) {
        //    Scanner teclado = new Scanner(System.in);
        //    System.out.println("Ingrese la nota que le darías a Matrix");
        //    //double notaMatrix = teclado.nextDouble();
        //    notaMatrix = teclado.nextDouble();
        //    mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        //    i = i + 1;
        //}

        //EJEMPLO CON WHILE - FORMA 2
        while (true) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la nota que le darías a Matrix");
            notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
            i = i + 1;
            if (i == 3) {
                break;
            }
        }

        System.out.println("La media de la película " +
                "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}