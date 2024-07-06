import javax.swing.JOptionPane;

public class Exercise3 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores: "));
        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];

        for (int i = 0; i < n; i++) {
            vetor1[i] = Integer
                    .parseInt(JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do primeiro vetor: "));
            vetor2[i] = Integer
                    .parseInt(JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do segundo vetor: "));
        }

        String resultado = "";
        for (int i = 0; i < n; i++) {
            int soma = vetor1[i] + vetor2[i];
            int subtracao = vetor1[i] - vetor2[i];
            int multiplicacao = vetor1[i] * vetor2[i];
            double divisao = (double) vetor1[i] / vetor2[i];

            resultado = resultado +
                    "Soma: " + soma + "\n" +
                    "Subtração: " + subtracao + "\n" +
                    "Multiplicação: " + multiplicacao + "\n" +
                    "Divisão: " + divisao + "\n\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}