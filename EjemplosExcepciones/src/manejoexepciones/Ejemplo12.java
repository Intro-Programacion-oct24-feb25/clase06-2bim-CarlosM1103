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
        boolean bandera = true;

         while (bandera) {
            try {
                for (int i = 0; i < resultados.length; i++){
                System.out.println("Ingrese valor 1:");
                int valor1 = entrada.nextInt(); // se espera un valor entero 
                System.out.println("Ingrese valor 2:");
                int valor2 = entrada.nextInt(); // se espera un valor entero // 0
                resultados [i] = valor1 / valor2;
                }
                System.out.printf("Resultado %d\n", resultado);
                bandera = false;
            } catch (InputMismatchException inputMismatchException) {

                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
            } catch (ArithmeticException arithmeticException) {

                System.out.println("Lo sentimos hay un error");
                System.out.printf("De tipo %s\n", arithmeticException);

            }
        }
        
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }
        
        
    

    }
}
