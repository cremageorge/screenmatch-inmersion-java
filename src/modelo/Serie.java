package modelo;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodio;

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas;
    }

    @Override
    public void muestraFichaTecnica(){
        System.out.println("");
        System.out.println("****FICHA TÉCNICA DE LA SERIE****");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Año de Lanzamiento: " + getAñoDeLanzamiento());
        System.out.println("Número de Temporadas: " + temporadas);
        System.out.println("Número de Episodios por Temporada: " + episodiosPorTemporada);
        System.out.println("Tiempo de Duración por Episodio: " + duracionEnMinutosPorEpisodio + " minutos");
        System.out.println("Tiempo de Duración Total: " + getTiempoDeDuracionEnMinutos() + " minutos");
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }
}
