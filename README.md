# PROGRAMA EN JAVA - SCREENMATCH


*ESTA CODIFICACIÓN FORMA PARTE DEL RETO 1 DE LA INMERSIÓN DE JAVA DADA POR ALURA.
RECIBE LOS PUNTAJES DE TRES USUARIOS EN BASE A UNOS PARÁMETROS DE ENTRADA INDIVIDUAL,
PARA OBTENER FINALMENTE EL PROMEDIO DE PUNTUACIÓN PARA LA PELÍCULA MATRIX.*

**Como primera forma**, se realizan la declaración de las variables a utilizar, asimismo con su respectiva inicialización, en caso corresponda. Se hace uso del bucle FOR 
para capturar el ingreso de los usuarios, al ser tres las personas que ingresaran las puntuaciones de la película de Matrix, se debe contabilizar al interno del bucle,
que ***sólo permita dar tres veces la vuelta correspondiente***, caso contrario debe abortar.

`import java.util.Scanner;`
```
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

for (int i = 0; i < 3; i++) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingresa la nota que le darías a Matrix");
    double notaMatrix = teclado.nextDouble();
    mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
}
```
**Como segunda forma**, haremos uso del bucle WHILE, en reemplazo del FOR, cumpliendo con la misma finalidad pero con diferentes validaciones al interno del bucle.
```
while (i < 3) {
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese la nota que le darías a Matrix");
      notaMatrix = teclado.nextDouble();
      mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
      i = i + 1;
}
```
---
1. Se debe tener en cuenta las siguientes consideraciones:
   * Codificar en orden, que estén alineados cada bloque que vayamos agregando
   * No olvidar poner siempre el ; al final de cada sentencia
2. Guardar el programa cada cierto tiempo, para evitar pérdida de nuestros avances


![RETO](https://github.com/cremageorge/screenmatch-inmersion-java/assets/168378999/728b00ef-64d7-4f6a-abfb-ee24f4a52b30)


[VISITAR PÁGINA DE ALURA](https://www.aluracursos.com/)
>Agradecido con el apoyo brindado por Génesis y Christian
