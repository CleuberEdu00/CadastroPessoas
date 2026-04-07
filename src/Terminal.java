import java.util.Scanner;

public class Terminal {


    GerenciadorUsuarios g1 = new GerenciadorUsuarios();
    Scanner sc = new Scanner(System.in);

    //Metodo que cria o usuario usando a leitura de dados
    public void criarUsuarioScanner() {
        sc.nextLine();
        String nome, cpf, email;
        System.out.println("== Criar usuario ==\n");
        System.out.print("Digite o nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o CPF: ");
        cpf = sc.nextLine();
        System.out.print("Digite o email: ");
        email = sc.nextLine();
        g1.criarUsuario(nome,cpf,email);
    }

    //Metodo que remove o usuario usando a leitura de dados
    public void removerUsuarioScanner(){
        sc.nextLine();;
        int idParaRemover;
        System.out.println("== Remover Usuario ==\n");
        System.out.println("Digite o ID do Usuario que deseja remover: ");
        idParaRemover = sc.nextInt();
        g1.removerUsuario(idParaRemover);
    }



    public void iniciar(){
        int opcao;
        do{
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    criarUsuarioScanner();
                    break;
                case 2:
                    g1.mostrarUsuarios();
                    break;
                case 3:

                    break;
                case 4:
                    removerUsuarioScanner();
                    break;
            }

        } while(opcao != 0);
    }
}


