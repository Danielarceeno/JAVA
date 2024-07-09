import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

public void marcarLuta(Lutador l1,Lutador l2){
    if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
        this.aprovada = true;
        this.desafiado = l1;
        this.desafiante = l2;
    } else {
        this.aprovada = false;
        this.desafiado = null;
        this.desafiante = null;
    }
}
public void lutar(){
    if (this.aprovada){
        this.desafiado.apresentar();
        this.desafiante.apresentar();

        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        switch(vencedor){
            case 0:
            System.out.println("empatou");
            this.desafiado.empatarLuta();
            this.desafiante.empatarLuta();
            break;
            case 1:
            System.out.println("Vitoria do " + this.desafiado.getNome());
            this.desafiado.ganharLuta();
            this.desafiante.perderLuta();
            break;
            case 2:
            System.out.println("vitoria do" + this.desafiante.getNome());
            this.desafiante.ganharLuta();
            this.desafiado.perderLuta();
            break;

        }

    } else{
        System.out.println("a luta não pode acontecer!");
    }
}

public Lutador getDesafiado(){
    return desafiado;
}

public void setDesafiado(Lutador desafiado){
    this.desafiado = desafiado;
}

public Lutador getDesafiante(){
    return desafiante;
}

public void setDesafiante(Lutador desafiante){
    this.desafiante = desafiante;
}

public int getRounds(){
    return rounds;
}

public void setRounds(int rounds){
    this.rounds = rounds;
}

public boolean getAprovada(){
    return aprovada;
}

public void setAprovada(boolean aprovada){
    this.aprovada = aprovada;
}

}
