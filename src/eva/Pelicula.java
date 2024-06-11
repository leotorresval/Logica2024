package eva;

public class Pelicula {
    private String titulo, director;
    private int duracion;
    private double calificacion;
    private char clasificacion;
    private String genero, paisOrigen;
    private double presupuesto, recaudacion;

    public Pelicula(String titulo, String director, int duracion, double calificacion, char clasificacion, String genero, String paisOrigen, double presupuesto, double recaudacion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.clasificacion = clasificacion;
        this.genero = genero;
        this.paisOrigen = paisOrigen;
        this.presupuesto = presupuesto;
        this.recaudacion = recaudacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public char getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(char clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", calificacion=" + calificacion + ", clasificacion=" + clasificacion + ", genero=" + genero + ", paisOrigen=" + paisOrigen + ", presupuesto=" + presupuesto + ", recaudacion=" + recaudacion + '}';
    }
    
    
}
