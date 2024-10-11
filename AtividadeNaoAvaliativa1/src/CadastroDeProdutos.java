import Objeto.Produto;

import java.util.ArrayList;
import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CadastroDeProdutos {
    public static  Scanner scanner = new Scanner(System.in);
    private static Produto produto = new Produto();



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        boolean running = true;

        while (running) {
            System.out.println("1. Cadastro de Produtos");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastroDeProduto(scanner, listaDeProdutos);
                    break;
                case 2:
                    exibirLista(scanner, listaDeProdutos);
                    break;
                    case 3:
                        running = false;
                        System.out.println("Encerrando o sistema...");
                        break;

            }



        }






    }

    public static void cadastroDeProduto (Scanner scanner, ArrayList<Produto> listaDeProdutos) {
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto: ");
        Double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();


        Produto produto = new Produto( preco, nome, quantidade);
        listaDeProdutos.add(produto);
    }

    public static void exibirLista(Scanner scanner, ArrayList<Produto> listaDeProdutos) {
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }

    }

    }