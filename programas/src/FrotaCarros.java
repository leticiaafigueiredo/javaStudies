//Faça um programa que leia em vetores os dados de uma frota de 5 automóveis.

// - ano de fabricação;   - número de portas;   - automático (sim/não);  

//Após a leitura dos dados da frota mostre:

// - todos os dados de cada automóvel;

// - o ano de fabricação dos carros automáticos;

// - o número de portas e o ano de fabricação dos carros não automáticos;

import java.util.Scanner;

public class FrotaCarros {
    public static void main(String[] args){

        Object[][] automoveis = new Object[5][3];

        Scanner scanner = new Scanner(System.in);

        for(var i=0; i<2; i++){

            System.out.println("\n\nDigite as informacoes referentes ao carro numero " + (i+1) + "!\n");
            
            System.out.print("Ano de fabricacao: ");
            automoveis[i][0] = Integer.parseInt(scanner.nextLine());
            

            System.out.println("Numero de portas: ");
            automoveis[i][1] = Integer.parseInt(scanner.nextLine());
            

            System.out.println("Automatico, responda com sim ou nao: ");
            automoveis[i][2] = scanner.nextLine();
            
            
        }

        scanner.close();
        System.out.println("\n");

        for(var i=0; i<2; i++){

            System.out.println("\n\nInformacoes referentes ao carro numero " + (i+1) + "!\n");
            
            System.out.print("Ano de fabricacao: " + automoveis[i][0]);

            System.out.println(" - Numero de portas: " + automoveis[i][1]);

            System.out.println(" - Automatico: " + automoveis[i][2]);
            
        }

        System.out.println("\n\nAno de fabricacao dos carros automáticos: ");
        for(var i=0; i<2; i++){

            
            //*compara a entrada com a palavra "sim" */
            if(automoveis[i][2].equals("sim")){
                System.out.println(automoveis[i][0] + " ");
            }
        }

        System.out.println("\n\n número de portas e o ano de fabricacao dos carros nao automáticos: ");
        for(var i=0; i<2; i++){

            
            //*compara a entrada com a palavra "nao" */
            if(automoveis[i][2].equals("nao")){
                System.out.println(automoveis[i][1] +", " + automoveis[i][0] + "\n");
            }
        }



    }
    
}
