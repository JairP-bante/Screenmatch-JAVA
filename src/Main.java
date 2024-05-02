import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión de JAVA");
        //System.out.println("Película Matrix");


        //Declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                Que harías si un dia descubres que todo lo que percibes no es real?
                """;
        double mediaEvaluacionUsuario = 0;



        //Impresión de valores de las  variables
        System.out.println("Película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Incluido en tu plan basico: " + incluidoEnElPlanBasico);


        //Operacion para sacar una media
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de evalucion de Matrix: " + mediaEvaluacion);


        //Condicionales IF-ELSE
        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Película popular del momento");
        } else {
            System.out.println("Película Retro que vale la pena ver");
        };



        //Ciclo automatizado para sacar una media mediante FOR
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }

        System.out.println("La media de la película " +
                "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);


    }
}



