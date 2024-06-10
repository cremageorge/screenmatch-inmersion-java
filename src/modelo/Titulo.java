package modelo;

public class Titulo {
    private String nombre;
    private int añoDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private int tiempoDeDuracionEnMinutos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoDeLanzamiento() {
        return añoDeLanzamiento;
    }

    public void setAñoDeLanzamiento(int añoDeLanzamiento) {
        this.añoDeLanzamiento = añoDeLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    //public void setEvaluacion(double evaluacion) {
    //    this.evaluacion = evaluacion;
    //}

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public void muestraFichaTecnica(){
        System.out.println("");
        System.out.println("****FICHA TÉCNICA DE LA PELÍCULA****");
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de Lanzamiento: " + añoDeLanzamiento);
        System.out.println("Tiempo de Duración Total: " + getTiempoDeDuracionEnMinutos() + " minutos");
    }
}
