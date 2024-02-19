//Faça um programa que leia três números inteiros quaisquer, execute a soma e mostre o resultado ao final.

import java.util.Scanner;

public class Soma3Numeros {

    public static void main(String[] args) {

        int[] numeros = new int[3];

        int soma = 0;

        // chama a funcao Scanner(System.in) da biblioteca importada

        Scanner scanner = new Scanner(System.in);

        for (var i = 0; i < 3; i++) {

            System.out.println("Digite o numero " + i + ": ");

            numeros[i] = scanner.nextInt();

            soma = soma + numeros[i];

        }

        scanner.close();

        System.out.println("A soma dos numeros e: " + soma);

    }

}