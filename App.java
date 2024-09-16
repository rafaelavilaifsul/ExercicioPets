import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // criar o teclado
        Scanner teclado = new Scanner(System.in);

        while (true) {
            // mostrar o menu
            System.out.println("Escolha uma opção:");
            System.out.println("1) Cadastrar um pet");
            System.out.println("2) Encerrar");
            System.out.print("Qual a sua escolha? ");
    
            // receber e guardar a escolha do usuário
            int escolha = teclado.nextInt();
            teclado.nextLine();
    
            // se opção = 1
            if (escolha == 1) {
                // perguntar os dados
                System.out.print("Digite o nome do pet: ");
                String nome = teclado.nextLine();
                System.out.print("Digite o tipo do pet: ");
                String tipo = teclado.nextLine();
                System.out.print("Digite a idade do pet: ");
                int idade = teclado.nextInt();
                teclado.nextLine();
                System.out.print("Digite o nome do dono: ");
                String dono = teclado.nextLine();
                System.out.print("Digite o telefone do dono: ");
                String telefone = teclado.nextLine();
    
                // criar um objeto Pet
                Pet p = new Pet(nome, tipo, idade, dono, telefone);
    
                // mostrar os dados na tela
                System.out.println(p);
            } else {
                // se opção = 2
                System.out.println("Ok, tenha um bom dia!"); 
                // deseja boa noite ao usuário
                
                // encerrar
                break;
            }
        }
        // voltar para o menu
    }
}
