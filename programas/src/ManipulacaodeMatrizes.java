// Faça um programa que leia os valores de duas matrizes de tamanho 3 x 3. Em seguida, compare os valores das duas matrizes, nas respectivas posições, conte e mostre quantos números iguais e que estão nas mesmas posições nas duas matrizes.

import java.util.Scanner;

public class ManipulacaodeMatrizes {
    
    public void comparaValores(int[][] a, int[][] b){

        int contadorIguais = 0;

        System.out.println("Posicoes onde o conteudo das matrizes sao iguais: ");
        for(var i=0; i<3; i++){
            for(var j=0; j<3; j++){
                if(a[i][j]== b[i][j]){
                    System.out.println("a["+i+"]["+j+"] e b["+i+"]["+j+"] = "+a[i][j] );
                    contadorIguais++;
                }
            }
        }

        System.out.println("TOTAL: " + contadorIguais);

    }
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        System.out.println("Digite os valores referentes a primeira matriz: ");
        for(var i=0; i<3; i++){
            for(var j=0; j<3; j++){
                System.out.println("a["+i+"]["+j+"]= ");
                a[i][j] =  scanner.nextInt();
            }
        }

        System.out.println("Digite os valores referentes a segunda matriz: ");
        for(var i=0; i<3; i++){
            for(var j=0; j<3; j++){
                System.out.println("b["+i+"]["+j+"]= ");
                b[i][j] =  scanner.nextInt();
            }
        }

        scanner.close();

        ManipulacaodeMatrizes ordenacaoConteudo = new ManipulacaodeMatrizes();

        ordenacaoConteudo.comparaValores(a, b);

    }
}
