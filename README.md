# Tarea 2 - Métodos Iterativos en Java

## Descripción
Programa en Java que resuelve un sistema de ecuaciones lineales mediante los métodos de Jacobi y Gauss-Seidel, utilizando programación modular.

## Estructura del proyecto
- `SistemaEcuaciones.java`: contiene la matriz, los valores iniciales y la tolerancia.
- `MetodoJacobi.java`: implementa el método de Jacobi.
- `MetodoGaussSeidel.java`: implementa el método de Gauss-Seidel.
- `MainJacobi.java`: ejecuta Jacobi.
- `MainGaussSeidel.java`: ejecuta Gauss-Seidel.
## Descripción de las clases

1. SistemaEcuaciones.java

Pertenece al módulo de definición del sistema. Contiene la matriz de coeficientes, el vector de términos independientes, el vector de aproximación inicial y la tolerancia.

2. MetodoJacobi.java

Implementa el método de Jacobi. Calcula las nuevas aproximaciones utilizando los valores de la iteración anterior y un vector auxiliar para almacenar los resultados.

3. MetodoGaussSeidel.java

Implementa el método de Gauss-Seidel. Actualiza las variables inmediatamente durante cada iteración, utilizando los valores nuevos que ya se han calculado.

4. MainJacobi.java

Es el programa principal para ejecutar el método de Jacobi.

5. MainGaussSeidel.java

Es el programa principal para ejecutar el método de Gauss-Seidel.

## Sistema de ecuaciones

5x + y + z = 7

x + 4y + z = 6

x + 2y + 5z = 8

**Valores iniciales:** x = 0, y = 0, z = 0.

**Tolerancia:** 0.0001.

## Compilación y ejecución

**1. Abrir la terminal** en la carpeta principal del proyecto `Tarea2Unidad3`.

**2. Compilar los archivos:**

```bash
javac -d . sistema\SistemaEcuaciones.java metodos\MetodoJacobi.java metodos\MetodoGaussSeidel.java ejecucion\MainJacobi.java ejecucion\MainGaussSeidel.java
```

**3. Ejecutar el método de Jacobi:**

```bash
java ejecucion.MainJacobi
```

**4. Ejecutar el método de Gauss-Seidel:**

```bash
java ejecucion.MainGaussSeidel
```

## Resultados

La solución aproximada es x = 1, y = 1, z = 1.

- Jacobi: 16 iteraciones.
- Gauss-Seidel: 6 iteraciones.

## Conclusión

Ambos métodos encontraron una aproximación a la solución del sistema. Gauss-Seidel necesitó menos iteraciones que 
Jacobi porque utiliza inmediatamente los valores nuevos calculados durante cada iteración.

## Nombre

camila amor del angel cervantes

sistemas computacionales 

3ro"B"

metodos numéricos

