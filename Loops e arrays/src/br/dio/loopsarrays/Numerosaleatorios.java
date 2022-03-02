package br.dio.loopsarrays;

import java.util.Random;

public class Numerosaleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosaleatorios = new int [20];

         for (int i= 0;i <numerosaleatorios.length;i++){
          int numero = random.nextInt(100);
          numerosaleatorios [i] = numero;}

        System.out.print("\nNumeros aleatorios ");
        for (int numero : numerosaleatorios) {
            System.out.print(numero +" ");

        }



         }

    }

