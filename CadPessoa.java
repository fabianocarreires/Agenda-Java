package exercicio6;

import java.util.Scanner;

public class CadPessoa {

    static Pessoa individuo;
    static Pessoa agenda[] = new Pessoa[20];
    static int i = 0;

    public static void main(String[] args) {
        int opcao = 0;
        Scanner entrada;
        do {
            entrada = new Scanner(System.in);
            System.out.println("Menu de Opções");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - sair");
            
            try{
                opcao = entrada.nextInt();
                if (opcao == 1) {
                    cadastramento();
                }
                if (opcao == 2) {
                    listagem();
                }
                if (opcao == 0 || opcao >3 ){
                    System.out.println("Opção inválida!");
                }
            }catch(Exception e){
                System.out.println("Opção inválida! Digite 1, 2 ou 3");                
            }            
        } while (opcao != 3 );
    }

    public static void cadastramento() {

        Scanner scanner = new Scanner(System.in);
        individuo = new Pessoa();
        System.out.print("Digite o nome: ");
        individuo.nome = scanner.nextLine();
        System.out.print("Digite o endereço: ");
        individuo.endereco = scanner.nextLine();
        System.out.print("Digite a cidade: ");
        individuo.cidade = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        individuo.telefone = Long.parseLong(scanner.nextLine());
        System.out.print("Digite o e-mail: ");
        individuo.email = scanner.nextLine();
        agenda[i] = individuo;
        i++;
    }

    public static void listagem() {
        individuo = new Pessoa();
        for (int j = 0; j <i ; j++) {            
            individuo = agenda[j];
            System.out.println("Nome: " + individuo.nome);
            System.out.println("Endereço: " + individuo.endereco);
            System.out.println("Cidade: " + individuo.cidade);
            System.out.println("Telefone: " + individuo.telefone);
            System.out.println("E-mai: " + individuo.email);
        }
    }
}
