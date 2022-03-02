package br.dio.loopsarrays;

import java.util.Scanner;

public class Notaa {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nota;

        System.out.println("Insira sua nota:");
        nota = scan.nextInt();

        while (nota <0 || nota >10) {
            System.out.println("Nota invalida,insira uma nota valida: ");
            nota = scan.nextInt();
        }
    }


}
