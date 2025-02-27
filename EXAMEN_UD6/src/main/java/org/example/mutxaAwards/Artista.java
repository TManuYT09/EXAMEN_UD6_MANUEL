package org.example.mutxaAwards;

import java.util.ArrayList;

public class Artista extends MutxaAwards implements AccionesAsistentes{
    private String nombre;
    private ArrayList<Premio> listaPremios;
    private ArrayList<Categoria> categorias;

    public Artista(String nombre, int edicion){
        super(edicion);
        this.nombre = nombre;
        listaPremios = new ArrayList<>();
        categorias = new ArrayList<>();
    }

    public void esNominado(Categoria categoria){
        System.out.println("Artista "+nombre+" es nominado a "+categoria);
        categorias.add(categoria);
    }

    public void ganarPremio(Premio premio){
        System.out.println("Artista "+nombre+" ha ganado a el premio "+premio.getCategoria());
        listaPremios.add(premio);
    }

    public void recogerPremio(Premio premio){
        if (nombre.equals(premio.getGanador().getNombre())){
            System.out.println("El artista "+nombre+" sube a recoger el premio "+premio.getCategoria());
        }else {
            throw new RecogerPremioException();
        }

    }

    @Override
    public void aplaudir() {
        System.out.println("El artista "+nombre+" aplaudiendo... PLAS PLAS PLAS");
    }

    @Override
    public void alfombraRoja() {
        System.out.println("Artista "+nombre+" pasando por la alfombra roja...");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println("El artista "+nombre+" está dando un discurso sobre "+tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println("El artista "+nombre+" esta celebrando el premio a "+premio.getCategoria());
    }

    @Override
    void obtenerDetalles() {
        System.out.print("Artista: "+nombre+", con "+categorias.size()+" nominaciones a : "+categorias+" y "+listaPremios.size()+" premios ganados ");
        for (Premio prem:listaPremios){
            System.out.print(prem.getCategoria());
        }
        System.out.println();
    }

    public String getNombre() {
        return nombre;
    }
}
