import java.util.List;
import java.util.ArrayList;

public class GerenciadorUsuarios {
    

    //ArrayList para guardar usuarios 
    private List<Usuario> listaUsuarios = new ArrayList<>();


    //Adicionar um usuario na arrayList
    public void adicionarUsuarioList(Usuario usuario){
        this.listaUsuarios.add(usuario);
    }

    //remove um usuario de arraylist
    public void removerUsuarioList(Usuario usuario){
        this.listaUsuarios.remove(usuario);
    }



    //Criar um usuario por meio do metodo
    public void criarUsuario(String nome, String cpf, String email){
        Usuario usuario = new Usuario(nome, cpf, email);
        adicionarUsuarioList(usuario);

        System.out.println("Usuario criado com sucesso");
    }

    //Metodo responsavel por mostar todos os Usuarios presentes na lista
    public void mostrarUsuarios(){
       for(Usuario u : listaUsuarios){
            System.out.println("== Usuario ==");
            System.out.printf("ID: %s\n", u.getId());
            System.out.printf("Nome: %s\n", u.getNome());
            System.out.printf("CPF: %s\n", u.getCpf());
            System.out.printf("E-mail: %s\n", u.getEmail());
            System.out.println();
       }
    }

    //Metodo para fazer uma busca individual
    //Apenas retorna o usuario para poder ser usado em outros metodos
    public Usuario buscarUsuario(int idBusca){
        for(Usuario u : listaUsuarios){
            if(u.getId() == idBusca) {
              return u;
            }
        }
        return null;
    }


   /* System.out.printf("== Usuario %s ==\n", idBusca);
                System.out.printf("ID: %s\n", u.getId());
                System.out.printf("Nome: %s\n", u.getNome());
                System.out.printf("CPF: %s\n", u.getCpf());
                System.out.printf("E-mail: %s\n", u.getEmail());
                System.out.println();
    */

    //Metodo completo que recebe um ID do usuario e procura ele ao longo da lista para remove-lo
    public void removerUsuario(int idParaRemover){
        int idBusca = 0;
        Usuario encontrado = buscarUsuario(idParaRemover);
        //usa a Variavel que recebeu o número do ID
        if(encontrado != null){
            //Usa o metodo criado para remover um usuario especifico
            removerUsuarioList(encontrado);
            System.out.println("Usuario com id " + idParaRemover + " removido com sucesso");
        }
        else{
            System.out.println("Usuario não encontrado");
        }
    }


}
