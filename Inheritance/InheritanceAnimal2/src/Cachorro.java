
public class Cachorro extends Lobo1 {

    @Override
    public void emitirSom() {
        System.out.println("Au,au,au");
    }

    public void reagir(String frase) {
        if (frase.equals("Toma Comida") || frase.equals("Ola")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
        } else {
            System.out.println("Abanar e Latir");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.err.println("Abanar");
        } else {
            System.out.println("Latir");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("ignorar");
            }
        }
    }
}
