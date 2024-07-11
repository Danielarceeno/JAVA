public class ProjetoLivro {
public static void main(String[] args) {
    Pessoa[] p = new Pessoa[3];
    Livro[] l = new Livro[3];

    p[0] = new Pessoa("pedro", 22, "F");
    p[1] = new Pessoa("Maria", 21, "F");

    l[0] = new Livro("Aprendendo", "José", 200, p[0]);
    l[1] = new Livro("Aprendendo tudo", "Jofeino", 100, p[1]);

    l[0].abrir();
    l[0].folhear(399);
    System.out.println(l[0].detalhes());
}
}
