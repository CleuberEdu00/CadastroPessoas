public class Main {
    public static void main (String[] args){

        GerenciadorUsuarios g1 = new GerenciadorUsuarios();

        g1.criarUsuario("cleuber", "71253987157", "Cleuber@gmail.com");

        g1.criarUsuario("Alenilson", "74085236987", "Alenilson@gmail.com");

        g1.criarUsuario("Lucas", "78596326957", "Lucas@gmail.com");




        g1.mostrarUsuarios();

    }
}
