public abstract class RecursoDigital {
    private String identificador;
    private String titulo;
    private String estado;

    public RecursoDigital(String identificador, String titulo) {
        if (identificador == null || identificador.isEmpty() ||
                titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Identificador y título son obligatorios.");
        }
        this.identificador = identificador;
        this.titulo = titulo;
        this.estado = "disponible";
    }


    public String getIdentificador() { return identificador; }
    public String getTitulo() { return titulo; }
    public String getEstado() { return estado; }
    public void actualizarEstado(String nuevoEstado) { this.estado = nuevoEstado; }

    public abstract void mostrarInformacion();
}
