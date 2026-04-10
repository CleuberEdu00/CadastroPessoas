import java.util.Scanner;

public class Terminal {


    GerenciadorUsuarios g1 = new GerenciadorUsuarios();
    Scanner sc = new Scanner(System.in);

    //Metodo que cria o usuario usando a leitura de dados
    public void cadastrarUsuarioScanner() {
        sc.nextLine();
        String nome, cpf, email;
        Boolean sucesso = false;
        do {
            System.out.println("== Cadastar usuario ==\n");
            System.out.print("Digite o nome: ");
            nome = sc.nextLine();
            System.out.print("Digite o CPF: ");
            cpf = sc.nextLine();
            System.out.print("Digite o email: ");
            email = sc.nextLine();
            sucesso = g1.cadastrarUsuario(nome, cpf, email);
            if(sucesso){
                System.out.println("Usuario cadastrado com sucesso");
            }
            else{
                System.out.println("Falha ao cadastar usuario");
            }
        }while (!sucesso);
    }

    //Metodo que remove o usuario usando a leitura de dados
    public void removerUsuarioScanner(){
        sc.nextLine();;
        int idParaRemover;
        System.out.println("== Remover Usuario ==\n");
        System.out.println("Digite o ID do Usuario que deseja remover: ");
        idParaRemover = sc.nextInt();
        if(g1.removerUsuario(idParaRemover)){
            System.out.println("Usuario com id " + idParaRemover + " removido com sucesso");
        }
        else{
            System.out.println("Usuario não encontrado");
        }
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
                    cadastrarUsuarioScanner();
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


