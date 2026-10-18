public class Sistema {

        // Matriz de coeficientes del sistema de ecuaciones.
        private final double[][] A = {
                {5, 1, 1},
                {1, 4, 1},
                {1, 2, 5}
        };

        // Vector de términos independientes.
        private final double[] b = {7, 6, 8};

        // Vector de aproximacion inicial.
        private final double[] inicial = {0, 0, 0};

        // Tolerancia de error solicitada en la actividad.
        private final double tolerancia = 0.0001;

        // Devuelve una copia de la matriz de coeficientes.
        public double[][] getA() {
            double[][] copia = new double[A.length][];

            for (int i = 0; i < A.length; i++) {
                copia[i] = A[i].clone();
            }

            return copia;
        }

        // Devuelve una copia del vector independiente.
        public double[] getB() {
            return b.clone();
        }

        // Devuelve una copia del vector inicial.
        public double[] getInicial() {
            return inicial.clone();
        }

        // Devuelve la tolerancia establecida.
        public double getTolerancia() {
            return tolerancia;
        }

        // Devuelve el numero de ecuaciones del sistema.
        public int getN() {
            return b.length;
        }
}

