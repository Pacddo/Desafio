package br.dio.loopsarrays;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int quantnumero,quantpares = 0, quantimpares = 0;
    int numero;

        System.out.println("Qauntidade de numeros: ");
        quantnumero = scan.nextInt();
    int count = 0;
        do {
            System.out.println("numero:");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantpares++;
            else quantimpares++;

            count++;

        }while (count < quantnumero);
        System.out.println("Quantidade pares: "+ quantpares);
        System.out.println("Quantidade impares: "+ quantimpares);
    }
}
