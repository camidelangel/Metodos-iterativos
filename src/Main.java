public class Main {

        public static void main(String[] args) {

            // Crea el sistema que compartiran ambos metodos.
            Sistema sistema = new Sistema();

            // Crea los objetos de los metodos iterativos.
            Jacobi jacobi = new Jacobi();
            GaussSeidel gaussSeidel = new GaussSeidel();

            System.out.println("==================================");
            System.out.println(" PRACTICA: METODOS ITERATIVOS");
            System.out.println(" Sistema de ecuaciones lineales");
            System.out.println(" Tolerancia: 0.0001");
            System.out.println("==================================");

            // Ejecuta el metodo de Jacobi.
            int iteracionesJacobi = jacobi.resolver(sistema);

            // Ejecuta el metodo de Gauss-Seidel.
            int iteracionesGaussSeidel = gaussSeidel.resolver(sistema);

            // Compara las iteraciones de ambos metodos.
            System.out.println("\n===== COMPARACION FINAL =====");

            System.out.println(
                    "Iteraciones de Jacobi: " + iteracionesJacobi
            );

            System.out.println(
                    "Iteraciones de Gauss-Seidel: " + iteracionesGaussSeidel
            );

            if (iteracionesJacobi < iteracionesGaussSeidel) {
                System.out.println(
                        "Jacobi requirio menos iteraciones."
                );
            } else if (iteracionesGaussSeidel < iteracionesJacobi) {
                System.out.println(
                        "Gauss-Seidel requirio menos iteraciones."
                );
            } else {
                System.out.println(
                        "Ambos metodos requirieron el mismo numero de iteraciones."
                );
            }

            System.out.println("\nEjecucion finalizada.");
        }
}
