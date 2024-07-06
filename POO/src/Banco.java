public class Banco{
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Daniel");
        p1.abrirConta("CC");
        p1.statusAtual();
    }
}
