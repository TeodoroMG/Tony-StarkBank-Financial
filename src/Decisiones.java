public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoplan = "plus";

//código que prueba los operadores

        if (fechaDeLanzamiento >=2022) {
            System.out.println("Peliculas más populares");
       } else {
            System.out.println("Películas Retro que aún vale la pena ver");
        }

        if (incluidoEnElPlan && tipoplan.equals( "plus")){
            System.out.println("Disfrute de su película");
        } else {
            System.out.println( "Pelicula no disponible en el plan actual");
        }

    }

}
