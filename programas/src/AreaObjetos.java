//Faça um programa que permita calcular qualquer uma das áreas abaixo:
//- quadrado;  - retângulo;  - cubo;  - triangulo retângulo;

import java.util.Scanner;

public class AreaObjetos{
    public static void main (String[] args){

        int choice;
        float[] area = new float[4];

        Scanner scanner = new Scanner(System.in);
        //      1. Scanner: É como uma ferramenta que ajuda a ler coisas.
        //      2. new Scanner(): Estamos dizendo "Quero uma nova ferramenta Scanner para ler coisas."
        //      3. System.in: Indica que queremos ler coisas do teclado.
        //
        //      Assim, o Scanner ajuda a fazer a ponte entre o programa que escrevemos e as coisas que o usuário digita no teclado.

        //*entrada de dados quanto a escolha do objeto
        System.out.println("Escolha o objeto para calcular area: 1-QUADRADO 2-RETANGULO 3-CUBO 4-TRIANGULO RETANGULO");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:

                System.out.println("Digite o tamanho da aresta: ");
                float aresta = scanner.nextInt();

                area[0] = aresta * aresta;

                System.out.println("A area do quadrado e: " + area[0] + " centimetros quadrados");

            break;

            case 2:

                System.out.println("Digite o comprimento do retangulo:");
                int comprimento = scanner.nextInt();
                System.out.println("Digite o valor da altura:");
                int altura = scanner.nextInt();

                area[1] = comprimento * altura;

                System.out.println("A area do triangulo e: " + area[1] + " centimetros quadrados");

            break;

            case 3:

                System.out.println("Digite o tamanho da aresta: ");
                aresta = scanner.nextInt();

                area[2] = aresta * aresta * 6;

                System.out.println("A area da superficie do cubo e: " + area[2] + " centimetros quadrados");

            break;

            case 4:

                System.out.println("Digite o valor da base do triangulo:");
                int base = scanner.nextInt();
                System.out.println("Digite a altura:");
                altura = scanner.nextInt();

                area[3] = (base * altura)/2;

                System.out.println("A area do triangulo retangule e: " + area[3] + " centimetros quadrados");

            break;

            default:

                System.out.println("Valor invalido!");

            break;
        }

        scanner.close();

    }
}