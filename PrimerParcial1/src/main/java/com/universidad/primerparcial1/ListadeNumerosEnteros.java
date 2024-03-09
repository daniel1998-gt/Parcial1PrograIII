/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.universidad.primerparcial1;

/**
 *
 * @author DanielMancilla 98
 */

import java.util.*;

public class ListadeNumerosEnteros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese números enteros (escriba 'fin' para terminar):");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                numeros.add(Integer.parseInt(entrada));
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número entero válido.");
            }
        }

        Set<Integer> conjuntoNumeros = new HashSet<>(numeros);

        System.out.println("Lista sin duplicados:");
        conjuntoNumeros.forEach(System.out::println);
    }
}
