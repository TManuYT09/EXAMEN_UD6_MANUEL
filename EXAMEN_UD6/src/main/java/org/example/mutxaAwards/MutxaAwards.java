package org.example.mutxaAwards;

abstract class MutxaAwards {


    private int año;

    public MutxaAwards(int año) {
        this.año = año;
    }

    abstract void obtenerDetalles();

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
