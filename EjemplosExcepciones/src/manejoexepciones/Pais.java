/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Pais {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Boolean bandera = true;

        while (bandera) {
            try {
                System.out.println("Ingrese el nombre de un pais: ");
                String pais = entrada.nextLine();
                char vocal = pais.charAt(0);
                
        
                if (vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O'|| vocal == 'U') {
                    throw new Exception("El pais tiene que tener como inicial una consonante");
                } 
                else {
                bandera = false;
                }
                 
                
             

            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
            }
        }
    }

}
