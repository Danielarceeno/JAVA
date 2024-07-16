
public class App {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        GoldFish g = new GoldFish();
        Arara e = new Arara();


        m.setPeso(11f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();

        c.locomover();
        k.locomover();

    }
}
