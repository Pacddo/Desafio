package br.dio.loopsarrays;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numtab, fixo = 0,resultado;


        System.out.println("Insira o numero da Tabuada: ");
        numtab = scan.nextInt();
            System.out.println("Tabuada do " + numtab);
        do {
            resultado = numtab * fixo;
            System.out.println(numtab+" X "+ fixo + " = " + resultado);
            fixo++;

        }while (fixo < 11);
    }
}
