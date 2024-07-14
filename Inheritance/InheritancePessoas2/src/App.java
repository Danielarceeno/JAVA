public class App {
    public static void main(String[] args) throws Exception {
       // Pessoa p1 = new Pessoa();
     /*   Visitante v1 = new Visitante();
       v1.setNome("Juvenal");
       v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        Aluno a1 = new Aluno();
        a1.setNome("claudio");
        a1.setMatricula(1111);
        a1.setCurso("SYS");
        a1.setIdade(21);
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1222);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

    }
}
