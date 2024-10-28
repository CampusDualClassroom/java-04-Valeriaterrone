package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {


        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + sumNum(5));
        System.out.println("La suma de los primeros 20 números pares es: " + sumEvenNum(20));
        System.out.println("El número factorial de 7 es: " + factorial(7));
    }

    public static int sumNum(int num) {
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma += i; // aqui lo sumo y luego lo asigno;
        }
        return suma;
    }

    public static int sumEvenNum(int num1) {

        int suma = 0;
        int par = 2; // Primer número par.
        for (int i = 1; i <= num1; i++) {
            suma += par;
            par += 2; // Incrementamos de 2 en 2 para obtener el siguiente número par.
        }
        return suma;
    }

    public static int factorial(int num2) {
        int resultado = 1;
        for (int i = 1; i <= num2; i++) {
            resultado *= i; // Multiplico resultado por el valor actual de i.
        }

        return resultado;
    }

    public static int recursiveFactorial(int num3) {
        if (num3 == 0 || num3 == 1) {
            return 1;
        }
        return num3 * recursiveFactorial(num3 - 1);
    }
}


