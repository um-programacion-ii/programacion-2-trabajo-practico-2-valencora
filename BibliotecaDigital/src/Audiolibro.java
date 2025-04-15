public class Audiolibro extends RecursoDigital{
    private String narrador;
    private int duracion;

    public Audiolibro(String identificador, String titulo, String narrador, int duracion) {
        super(identificador, titulo);
        this.narrador = narrador;
        this.duracion = duracion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Audiolibro: " + getTitulo()
                + " | Narrador: " + narrador
                + " | Duración: " + duracion + " minutos"
                + " | Estado: " + getEstado());
    }

}
