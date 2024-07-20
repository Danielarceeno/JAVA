
public class App {

    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        v[2] = new Video("Aula 3");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("João", 18, "M", "juba");
        g[1] = new Gafanhoto("Juliana", 18, "F", "Jujuba");

        System.out.println(g[0].toString());

        System.out.println(v[0].toString());
    }
}
