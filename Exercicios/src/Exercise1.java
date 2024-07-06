import javax.swing.JOptionPane;

public class Exercise1 {
    public static void main(String[] args) {

        String mes[] = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho",
                "agosto", "setembro", "outubro", "novembro", "dezembro" };

        int[] acidentes = new int[12];
        int totalAcidentes = 0;
        int maxAcidentes = 0;
        int minAcidentes = 0;
        String mesMaxAcidentes = "";
        String mesMinAcidentes = "";

        for (int i = 0; i < 12; i++) {
            acidentes[i] = Integer
                    .parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes no mês de " + mes[i]));
            totalAcidentes += acidentes[i];
            if (i == 0) {
                minAcidentes = acidentes[i];
                mesMinAcidentes = mes[i];
                maxAcidentes = acidentes[i];
                mesMaxAcidentes = mes[i];
            } else {
                if (acidentes[i] > maxAcidentes) {
                    maxAcidentes = acidentes[i];
                    mesMaxAcidentes = mes[i];
                } else if (acidentes[i] == maxAcidentes) {
                    mesMaxAcidentes += ", " + mes[i];
                }
                if (acidentes[i] < minAcidentes) {
                    minAcidentes = acidentes[i];
                    mesMinAcidentes = mes[i];
                } else if (acidentes[i] == minAcidentes) {
                    mesMinAcidentes += ", " + mes[i];
                }
            }
        }

        double percentualFevereiro = (double) acidentes[1] / totalAcidentes * 100;

        JOptionPane.showMessageDialog(null,
                "Mês(es) com mais acidentes: " + mesMaxAcidentes + " com " + maxAcidentes + " acidentes");

        JOptionPane.showMessageDialog(null,
                "Mês(es) com menos acidentes: " + mesMinAcidentes + " com " + minAcidentes + " acidentes");

        JOptionPane.showMessageDialog(null, "Total de acidentes do ano: " + totalAcidentes);

        JOptionPane.showMessageDialog(null,
                "Percentual de acidentes em Fevereiro(Carnaval): " + percentualFevereiro + "%");
    }
}