import java.util.Scanner;

// Classe para implementa o menu
class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoologico zoologico = new Zoologico(); // Instancia um objeto Zoologico para gerenciar os animais

        // Loop principal do menu
        while (true) {
            // Exibe as opções do menu
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar um novo animal");
            System.out.println("2 - Listar todos os animais");
            System.out.println("3 - Buscar animais por espécie");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt(); // Lê a opção escolhida 

            switch (opcao) {
                case 1:
                    scanner.nextLine(); 
                    // Solicita informações do novo animal ao usuário
                    System.out.println("Digite o nome do animal:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a espécie do animal:");
                    String especie = scanner.nextLine();
                    System.out.println("Digite a idade do animal:");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    // Cria um novo objeto Animal com as informações fornecidas
                    Animal animal = new Animal(nome, especie, idade);
                    // Solicita os alimentos que o animal consome e os adiciona à lista de alimentos
                    System.out.println("Digite os alimentos que o animal consome (digite 'fim' para parar):");
                    String alimento;
                    while (!(alimento = scanner.nextLine()).equalsIgnoreCase("fim")) {
                        animal.adicionarAlimento(alimento);
                    }
                    // Adiciona o animal ao zoológico
                    zoologico.adicionarAnimal(animal);
                    break;
                case 2:
                    zoologico.listarAnimais(); // Lista todos os animais do zoológico
                    break;
                case 3:
                    scanner.nextLine(); 
                    // Solicita a espécie para buscar ao usuário e lista os animais dessa espécie
                    System.out.println("Digite a espécie para buscar:");
                    String especieBusca = scanner.nextLine();
                    zoologico.buscarPorEspecie(especieBusca);
                    break;
                case 4:
                    System.out.println("Saindo do programa..."); // Mensagem de saída
                    System.exit(0); // Encerra o programa
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida."); // Mensagem de opção inválida
            }
        }
    }
}
