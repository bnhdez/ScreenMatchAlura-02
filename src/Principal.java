public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); //instancia de clase
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "The Matrix";
        otraPelicula.fechaDeLanzamiento =  1998;
        otraPelicula.duracionEnMinutos = 180;

        otraPelicula.muestraFichaTecnica();
    }
}
