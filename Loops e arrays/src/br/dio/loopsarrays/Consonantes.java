package br.dio.loopsarrays;

import java.util.Scanner;

public class Consonantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    String[] consoantes = new String[6];
    int quantconsoantes = 0;

    int count = 0;
    do {
        System.out.println("letra: ");
        String letra = scan.next();
        if (!(letra.equalsIgnoreCase("a")|
         letra.equalsIgnoreCase("e")|
         letra.equalsIgnoreCase("i")|
        letra.equalsIgnoreCase("o")|
         letra.equalsIgnoreCase("u"))){
            consoantes[count] = letra;
            quantconsoantes++;
                    count++;
        }


    }while (count < consoantes.length);

        for (String consoante : consoantes) {
            System.out.print(consoante + " ");

        }
    }
}
