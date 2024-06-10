import calculos.CalculadoraDeTiempo;
import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();
    public void muestraElMenu(){
        int opcion = 0;
        while (opcion != 9){
            Scanner teclado = new Scanner(System.in);
            String menu = """
                    
                    ===================================
                      Bienvenido(a) a Sreenmatch
                        Elija una opción:
                          1) Registrar nueva película
                          2) Registrar nueva serie
                          3) Calculadora de Tiempo
                          9) Salir
                    ===================================
                    
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la película");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingres el año de lanzamiento de la película");
                    int añoDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setAñoDeLanzamiento(añoDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    calculadoraDeTiempo.incluye(peliculaUsuario);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreS = teclado.nextLine();
                    System.out.println("Ingres el año de lanzamiento de la serie");
                    int añoDeLanzamientoS = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el número de temporadas de la serie");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el número de episodios por temporada de la serie");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos por episodio de la serie");
                    int duracionEnMinutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    Serie serieUsuario = new Serie();
                    serieUsuario.setNombre(nombreS);
                    serieUsuario.setAñoDeLanzamiento(añoDeLanzamientoS);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);
                    serieUsuario.muestraFichaTecnica();
                    calculadoraDeTiempo.incluye(serieUsuario);
                    break;
                case 3:
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("  Tiempo que necesitas para hacer una maratón con tu(s) título(s) registrado(s): " + calculadoraDeTiempo.getTiempoTotal() + " minutos");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }
    }

}
