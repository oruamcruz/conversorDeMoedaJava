package br.com.macruz.conversormoeda.principal;

import br.com.macruz.conversormoeda.api.ConectaApi;

import java.io.IOException;
import java.util.Scanner;

public class ConversorDeMoeda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        ConectaApi api = new ConectaApi();

        String menu = """
                \n1 - Dólar =>>> Peso argentino
                2 - Peso argentino =>>> Dólar
                3 - Dólar =>>> Real brasileiro
                4 - Real brasileiro =>>> Dólar
                5 - Dólar =>>> Peso colombiano
                6 - Peso colombiano =>>> Dólar
                7 - Dólar =>>> Boliviano da Bolívia
                8 - Boliviano da Bolívia =>>> Dólar
                9 - Dólar =>>> Peso chileno
                10 - Peso chileno =>>> Dólar
                11 - Sair
                Escolha uma opção válida:
                """;

        while (true) {
            System.out.println("*****************************************************");
            System.out.println("Seja bem-vindo(a) ao conversor de moeda ;-)");
            System.out.println(menu);
            System.out.println("*****************************************************");

            String opcao = leitura.nextLine();

            if (opcao.equals("11")) {
                break;
            }

            System.out.print("Digite o valor: ");
            double valor = leitura.nextDouble();
            leitura.nextLine(); // limpar o buffer

            double cotacao;
            double convertido;

            switch (opcao) {
                case "1":
                    cotacao = api.buscarCotacao("USD", "ARS");
                    convertido = valor * cotacao;
                    System.out.printf("US$ %.2f equivale a ARS %.2f Peso argentino\n", valor, convertido);
                    break;
                case "2":
                    cotacao = api.buscarCotacao("ARS", "USD");
                    convertido = valor * cotacao;
                    System.out.printf("ARS %.2f Peso argentino equivale a US$ %.2f\n", valor, convertido);
                    break;
                case "3":
                    cotacao = api.buscarCotacao("USD", "BRL");
                    convertido = valor * cotacao;
                    System.out.printf("US$ %.2f equivale a R$ %.2f \n", valor, convertido);
                    break;
                case "4":
                    cotacao = api.buscarCotacao("BRL", "USD");
                    convertido = valor * cotacao;
                    System.out.printf("R$ %.2f equivale a US$ %.2f\n", valor, convertido);
                    break;
                case "5":
                    cotacao = api.buscarCotacao("USD", "COP");
                    convertido = valor * cotacao;
                    System.out.printf("US$ %.2f equivale a COP %.2f\n", valor, convertido);
                    break;
                case "6":
                    cotacao = api.buscarCotacao("COP", "USD");
                    convertido = valor * cotacao;
                    System.out.printf("COP %.2f equivale a US$ %.2f\n", valor, convertido);
                    break;
                case "7":
                    cotacao = api.buscarCotacao("USD", "BOB");
                    convertido = valor * cotacao;
                    System.out.printf("US$ %.2f equivale a BOB %.2f\n", valor, convertido);
                    break;
                case "8":
                    cotacao = api.buscarCotacao("BOB", "USD");
                    convertido = valor * cotacao;
                    System.out.printf("Bs %.2f equivale a US$ %.2f\n", valor, convertido);
                    break;
                case "9":
                    cotacao = api.buscarCotacao("USD", "CLP");
                    convertido = valor * cotacao;
                    System.out.printf("US$ %.2f equivale a $ %.2f Peso chileno\n", valor, convertido);
                    break;
                case "10":
                    cotacao = api.buscarCotacao("CLP", "USD");
                    convertido = valor * cotacao;
                    System.out.printf("$ %.2f equivale a US$ %.2f\n", valor, convertido);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        
        System.out.println("Saindo...");
    }
}
