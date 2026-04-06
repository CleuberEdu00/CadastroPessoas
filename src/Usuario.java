public class Usuario {

    //Atributos do usuário
    private String nome;
    private String cpf;
    private String email;

    //Usando o static porque é um contador geral da classe e não de um objeto.
    //Isso é para que não corra o risco de ter Ids duplicados.
    private static int contadorId = 1;
    private int id;


    //construtor usuario
    public Usuario(String nome, String cpf, String email){
        this.id = contadorId;
        contadorId++;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    // metodos gets
    public String getNome() {
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public int getId(){
        return id;
    }

    //metodos sets

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEmail(String email){
        this.email = email;
    }

}