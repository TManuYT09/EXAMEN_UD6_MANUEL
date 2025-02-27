package org.example.mutxaAwards;

public class Presentador extends MutxaAwards implements AccionesAsistentes{
    private String nombre;

    public Presentador(String nombre, int edicion){
        super(edicion);
        this.nombre=nombre;
    }

    public void presentar(){
        System.out.println(nombre+"presentando la gala...");
    }

    public void entregarPremio(Premio premio){
        System.out.println("EL presentador "+nombre+" está entregando el premio "+premio.getCategoria()+" a "+premio.getGanador().getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void aplaudir() {
        System.out.println("Presentador "+nombre+" aplaudiendo... PLAS PLAS PLAS");
    }

    @Override
    public void alfombraRoja() {
        System.out.println("Presentador "+nombre+" pasando por la alfombra roja...");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println("El presentador da un discurso "+tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println("El presentador "+nombre+" esta celebrando el premio a "+premio.getCategoria());
    }

    @Override
    void obtenerDetalles() {
        System.out.println("Presentador: "+nombre);
    }
}
