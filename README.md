# Calculador de distancia entre cadenas

Este programa Java proporciona una implementación para calcular la distancia entre dos cadenas utilizando el algoritmo de distancia de edición.

## Descripción

El algoritmo de distancia de edición, también conocido como distancia de Levenshtein, mide la cantidad mínima de operaciones necesarias para transformar una cadena en otra. Estas operaciones pueden ser inserciones, eliminaciones o sustituciones de caracteres.

## Uso

Para utilizar esta funcionalidad en tu propio código, puedes seguir estos pasos:

1. Incluye la clase `distanciaEntreCadenas` en tu proyecto Java.
2. Llama al método `calculaDistancia(String s1, String s2)` proporcionando las dos cadenas que deseas comparar. Este método devolverá la distancia entre las cadenas.

```java
int distancia = distanciaEntreCadenas.calculaDistancia("cadena1", "cadena2");
System.out.println("La distancia entre las cadenas es: " + distancia);
```

## Ejemplo

```java
public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        System.out.println(distanciaEntreCadenas.calculaDistancia("hola", "holse")); // Salida: 2
    }
}
```

## Licencia

Este proyecto está bajo la licencia [MIT](LICENSE).
