// Faça um programa para ler uma série de 10 números e após a leitura dos números mostre:

// - toda a série que foi lida;

// - todos os números ímpares da série;

// - todos os números pares da série;

// - o menor dos números pares;

// - o maior dos números ímpares.

import java.util.Scanner;

public class ManipulacaodeArray {

    public void separaImparesPares(int[] numeros){

        System.out.println("\n\nNumeros impares da serie:\n");
        for(var i=0; i<10; i++){
            if(numeros[i]%2!=0){
                System.out.println(numeros[i]);
            }
        }

        System.out.println("\n\nNumeros pares da serie:\n");
        for(var i=0; i<10; i++){
            if(numeros[i]%2==0){
                System.out.println(numeros[i]);
            }
        }
    }

    public void encontraMaiorMenor(int[] numeros){

        System.out.println("\n\nExtremos da serie:\n");
        int maior = numeros[0];
        int menor = numeros[0];
        for(var i=0; i<10; i++){
            if(numeros[i]>maior){
                maior = numeros[i];
            }
            if(numeros[i]<menor){
                menor = numeros[i];
            }
        }
        System.out.println("Maior: " + maior + "   -   Menor: " + menor);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        //* faz a leitura dos valores em uma array, por meio de um for */
        for(var i=0; i<10; i++){
            System.out.println("Digite o numero " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        } 
        scanner.close();

        System.out.println("\n\nAqui esta os valores enseridos!\n");
        for(var i=0; i<10; i++){
            System.out.println(numeros[i] + " ");
        }

        //* cria uma instância da classe @ManipulacaodeArray e atribui essa instância à variável chamada @ordenacaoConteudo. 
        //* depois de executar essa linha, você pode usar ordenacaoConteudo para chamar os métodos da classe ManipulacaodeArray e realizar operações nesse objeto específico.
        ManipulacaodeArray ordenacaoConteudo = new ManipulacaodeArray();

        //* chama os metodos
        ordenacaoConteudo.separaImparesPares(numeros);
        ordenacaoConteudo.encontraMaiorMenor(numeros);

    }
}
