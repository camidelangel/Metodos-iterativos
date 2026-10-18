public class GaussSeidel {

        // Ejecuta el metodo iterativo de Gauss-Seidel.
        // Devuelve el numero de iteraciones realizadas.
        public int resolver(Sistema sistema) {

            double[][] A = sistema.getA();
            double[] b = sistema.getB();
            double[] x = sistema.getInicial();

            double tolerancia = sistema.getTolerancia();
            int n = sistema.getN();
            int iteracion = 0;
            int maxIteraciones = 100000;
            double error;

            // Verifica que no existan ceros en la diagonal principal.
            for (int i = 0; i < n; i++) {
                if (A[i][i] == 0) {
                    throw new IllegalArgumentException(
                            "La diagonal principal contiene un cero."
                    );
                }
            }

            System.out.println("\n===== METODO DE GAUSS-SEIDEL =====");
            System.out.printf("%-10s", "Iteracion");

            for (int i = 0; i < n; i++) {
                System.out.printf("%-15s", "x" + (i + 1));
            }

            System.out.println("Error maximo");

            // Repite el proceso hasta cumplir la tolerancia.
            do {
                // Guarda los valores anteriores para calcular el error.
                double[] anterior = x.clone();

                error = 0.0;

                for (int i = 0; i < n; i++) {
                    double suma = 0.0;

                    // Utiliza los valores actualizados inmediatamente.
                    for (int j = 0; j < n; j++) {
                        if (i != j) {
                            suma += A[i][j] * x[j];
                        }
                    }

                    // Actualiza la variable directamente en el vector x.
                    x[i] = (b[i] - suma) / A[i][i];

                    // Compara el valor nuevo con el anterior.
                    double cambio = Math.abs(x[i] - anterior[i]);

                    if (cambio > error) {
                        error = cambio;
                    }
                }

                iteracion++;

                // Imprime los valores obtenidos en esta iteracion.
                System.out.printf("%-10d", iteracion);

                for (int i = 0; i < n; i++) {
                    System.out.printf("%-15.6f", x[i]);
                }

                System.out.printf("%.8f%n", error);

                if (iteracion >= maxIteraciones && error >= tolerancia) {
                    throw new IllegalStateException(
                            "Gauss-Seidel no alcanzo la tolerancia establecida."
                    );
                }

            } while (error >= tolerancia);

            System.out.println("\nSolucion aproximada con Gauss-Seidel:");

            for (int i = 0; i < n; i++) {
                System.out.printf("x%d = %.8f%n", i + 1, x[i]);
            }

            System.out.println("Error final: " + error);
            System.out.println("Iteraciones: " + iteracion);

            return iteracion;
        }
}
