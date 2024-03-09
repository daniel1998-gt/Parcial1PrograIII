/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.universidad.primerparcial1;

/**
 *
 * @author DanielMancilla 98
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PrimerParcial1  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear una lista para almacenar los números ingresados
        List<Integer> numeros = new ArrayList<>();
        
        // Solicitar al usuario ingresar elementos a la lista
        System.out.println("Ingrese números enteros (escriba 'fin' para terminar):");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número entero válido.");
            }
        }
        
        // Eliminar elementos duplicados usando un conjunto (Set)
        Set<Integer> conjuntoNumeros = new HashSet<>(numeros);
        
        // Crear una lista sin duplicados a partir del conjunto
        List<Integer> numerosSinDuplicados = new ArrayList<>(conjuntoNumeros);
        
     
      
        // Mostrar la lista resultante
        System.out.println("Lista sin duplicados:");
        for (Integer numero : numerosSinDuplicados) {
            System.out.print(numero);
        }
    }
}
