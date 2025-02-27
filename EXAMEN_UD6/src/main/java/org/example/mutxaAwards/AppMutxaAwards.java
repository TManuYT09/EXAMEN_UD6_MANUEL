package org.example.mutxaAwards;

public class AppMutxaAwards {
    public static void main(String[] args) {
        // crear 1 presentador para la edicion de 2025 y obtenerDetalles()
        Presentador presentador1 = new Presentador("Roberto Leal", 2025);
        presentador1.obtenerDetalles();
        System.out.println("-----------");
        // crear 5 artistas para la edicion de 2025
        Artista artista1 = new Artista("Javier Bardem", 2025);
        Artista artista2 = new Artista("Antonio Banderas", 2020);
        Artista artista3 = new Artista("Maxi Iglesias", 2025);
        Artista artista4 = new Artista("Úrsula Corberó", 2025);
        Artista artista5 = new Artista("Hiba Abouk", 2025);
        System.out.println("-----------");
        // todos los asistentes pasan por la alfombra roja
        presentador1.alfombraRoja();
        artista1.alfombraRoja();
        artista2.alfombraRoja();
        artista3.alfombraRoja();
        artista4.alfombraRoja();
        artista5.alfombraRoja();
        System.out.println("-----------");
        // todos los asistentes aplauden
        presentador1.aplaudir();
        artista1.aplaudir();
        artista2.aplaudir();
        artista3.aplaudir();
        artista4.aplaudir();
        artista5.aplaudir();
        System.out.println("-----------");
        // el presentador empieza a presentar la gala
        presentador1.presentar();
        System.out.println("-----------");
        // el presentador da un discurso "para solidarizarse con los afectados de la DANA"
        presentador1.darDiscurso("para solidarizarse con los afectados de la DANA");
        System.out.println("-----------");
        // se crea el premio (new) con la categoria MEJOR_ACTOR
        Premio premio1 = new Premio(Categoria.MEJOR_ACTOR);
        System.out.println("-----------");
        // 4 de los artistas son nominados a la categoria MEJOR_ACTOR y actualizan su lista de categorias
        artista1.esNominado(premio1.getCategoria());
        artista2.esNominado(premio1.getCategoria());
        artista3.esNominado(premio1.getCategoria());
        artista4.esNominado(premio1.getCategoria());
        System.out.println("-----------");
        // 1 de los artistas nominados gana el premio y actualiza su lista de premios ganados
        artista3.ganarPremio(premio1);
        System.out.println("-----------");
        // se actualiza el atributo ganador en el premio MEJOR_ACTOR
        premio1.setGanador(artista3);
        System.out.println("-----------");
        // todos los asistentes aplauden y celebran el premio
        presentador1.aplaudir();
        artista1.aplaudir();
        artista2.aplaudir();
        artista3.aplaudir();
        artista4.aplaudir();
        artista5.aplaudir();
        System.out.println("-----------");
        // 1 de los artistas que estaba nominado intenta recoger el premio aunque no lo haya ganado
        /*artista1.recogerPremio(premio1);*/
        System.out.println("-----------");
        // el artista ganador recoge el premio
        artista3.recogerPremio(premio1);
        System.out.println("-----------");
        // el presentador entrega el premio
        presentador1.entregarPremio(premio1);
        // el artista ganador realiza un discurso "sobre el esfuerzo realizado para rodar la película"
        artista3.darDiscurso("sobre el esfuerzo realizado para rodar la película");
        System.out.println("-----------");
        // todos los asistentes aplauden
        presentador1.aplaudir();
        artista1.aplaudir();
        artista2.aplaudir();
        artista3.aplaudir();
        artista4.aplaudir();
        artista5.aplaudir();
        System.out.println("-----------");
        // el presentador da un discurso "para introducir el siguiente premio: MEJOR_PELICULA"
        presentador1.darDiscurso("para introducir el siguiente premio "+Categoria.MEJOR_PELICULA);
        System.out.println("-----------");
        // se crea el premio con la categoria MEJOR_PELICULA
        Premio premio2 = new Premio(Categoria.MEJOR_PELICULA);
        System.out.println("-----------");
        // 4 de los artistas son nominados a la categoria MEJOR_PELICULA y actualizan su lista de categorias
        artista2.esNominado(premio2.getCategoria());
        artista3.esNominado(premio2.getCategoria());
        artista4.esNominado(premio2.getCategoria());
        artista5.esNominado(premio2.getCategoria());
        System.out.println("-----------");
        // 1 de los artistas nominados gana el premio y actualiza su lista de premios ganados
        artista4.ganarPremio(premio2);
        System.out.println("-----------");
        // se actualiza el ganador en el premio MEJOR_PELICULA
        premio2.setGanador(artista4);
        System.out.println("-----------");
        // todos los asistentes celebran el premio
        presentador1.aplaudir();
        artista1.aplaudir();
        artista2.aplaudir();
        artista3.aplaudir();
        artista4.aplaudir();
        artista5.aplaudir();
        System.out.println("-----------");
        // el artista ganador recoge el premio
        artista4.recogerPremio(premio2);
        System.out.println("-----------");
        // el presentador entrega el premio
        presentador1.entregarPremio(premio2);
        System.out.println("-----------");
        // el artista ganador realiza un discurso "sobre lo duro que ha sido conseguir financiación"
        artista4.darDiscurso("sobre lo duro que ha sido conseguir financiación");
        System.out.println("-----------");
        // el presentador da un discurso "para despedir la gala"
        presentador1.darDiscurso("para despedir la gala");
        System.out.println("-----------");
        // mostrarDetalles() de cada artista después de la gala
        artista1.obtenerDetalles();
        artista2.obtenerDetalles();
        artista3.obtenerDetalles();
        artista4.obtenerDetalles();
        artista5.obtenerDetalles();
        System.out.println("-----------");
    }

}
