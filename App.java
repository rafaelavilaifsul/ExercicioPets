import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // criar o teclado
        Scanner teclado = new Scanner(System.in);

        Pet[] pets = new Pet[100]; // estimativa de tamanho suficiente...
        int contPets = 0;
        while (true) {
            // mostrar o menu
            System.out.println("\nEscolha uma opção:");
            System.out.println("1) Cadastrar um pet");
            System.out.println("2) Listar os pets cadastrados");
            System.out.println("3) Encerrar");
            System.out.print("Qual a sua escolha? ");
    
            // receber e guardar a escolha do usuário
            int escolha = teclado.nextInt();
            teclado.nextLine();
    
            // se opção = 1
            if (escolha == 1) {
                // perguntar os dados
                System.out.print("\nDigite o nome do pet: ");
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
    
                // adicionar o novo Pet à lista
                pets[contPets++] = p;
            } else if (escolha == 2) {
                // se opção = 2
                System.out.println("\nPets cadastrados:"); 
                for (int i = 0; i < contPets; i++) {
                    System.out.println(pets[i]);
                }
            } else {
                // se opção = 3
                System.out.println("Ok, tenha um bom dia!"); 
                // deseja boa noite ao usuário
                
                // encerrar
                break;
            }
        }
        // voltar para o menu
    }
}
