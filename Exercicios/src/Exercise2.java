import javax.swing.JOptionPane;

public class Exercise2 {
    public static void main(String[] args) {

        String listaNomesCategorias = "";
        String categoria;

        int numPessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas: "));
        String[] nomes = new String[numPessoas];
        int[] idades = new int[numPessoas];

        for (int i = 0; i < numPessoas; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa: ");
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nomes[i] + ": "));
        }

        for (int i = 0; i < numPessoas; i++) {

            int idade = idades[i];
            if (idade >= 5 && idade <= 7) {
                categoria = "Infantil A";
            } else if (idade >= 8 && idade <= 10) {
                categoria = "Infantil B";
            } else if (idade >= 11 && idade <= 17) {
                categoria = "Juvenil";
            } else if (idade >= 18) {
                categoria = "Adulto";
            } else {
                categoria = "Idade inválida";
            }
            listaNomesCategorias += nomes[i] + " - " + categoria + "\n";
        }
        JOptionPane.showMessageDialog(null, "Nomes e categorias das pessoas: \n" + listaNomesCategorias);
    }
}