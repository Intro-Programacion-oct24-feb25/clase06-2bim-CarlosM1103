/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];
        int i = 0;

        while (i < resultados.length) {
            try {
                System.out.printf("Ingrese los valores de la operacion %d\n",i+1);
                System.out.println("Ingrese valor 1:");
                int valor1 = entrada.nextInt(); // se espera un valor entero 
                System.out.println("Ingrese valor 2:");
                int valor2 = entrada.nextInt(); // se espera un valor entero // 0
                resultados[i] = valor1 / valor2;
                i = i + 1;
            } catch (ArithmeticException e) {
                System.out.printf("(ArithmeticException) Ocurrió una "
                        + "excepción %s\n", e);
                entrada.nextLine();
            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
                entrada.nextLine();
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
                entrada.nextLine();
            }
        }
        System.out.println("\nResultados:");
        for (i = 0; i < resultados.length; i++) {
            System.out.printf("%s\n",resultados[i]);
        }
    }

}
