package br.dio.loopsarrays;

import java.util.Scanner;

public class Maiormédia {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

     int numero;
     int maior = 0;
     int soma =0;
     int media;

     int count = 0;
     do {
        System.out.println("insira um numero: ");
        numero = scan.nextInt();
        soma = soma + numero;
        if (maior < numero) maior = numero;
        count = count +1;
     }while (count < 5);

        System.out.println("O maior número é: " + maior);
        media = soma/5;
        System.out.println("A média é: " + media);
    }
}
