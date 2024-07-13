public class ProjetoPessoas{
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Aluno();
        Pessoa p3 = new Professor();
        Pessoa p4 = new Funcionario();

        p1.setSexo("Homem");
        p2.setSexo("F");
        

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");



        System.out.println(p1.toString());
        


    }
}
