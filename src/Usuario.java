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
        setNome(nome);
        setCpf(cpf);
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

    public boolean setNome(String nome) {
        if(nome.matches("[a-zA-Z\\s]+")) {
            this.nome = nome;
            return true; //sucesso
        }
        return false; //Falha na verificação

    }

    public boolean setCpf(String cpf){
        String SoNumeros =  cpf.replaceAll("\\D", "");
        if(SoNumeros.length() == 11){
            this.cpf = SoNumeros.substring(0, 3) + "." +
                    SoNumeros.substring(3, 6) + "." +
                    SoNumeros.substring(6, 9) + "-" +
                    SoNumeros.substring(9, 11);
            return true;
        }
        else{
            return false;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

}