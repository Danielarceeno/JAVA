import javax.swing.JOptionPane;

public class Exercise4 {
    public static void main(String[] args) {

        String[] nomes = new String[100];
        int[] cpfs = new int[100];
        int numContatos = 0;
        int n;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Cadastrar pessoa\n" +
                    "2 - Buscar pessoa por nome\n" +
                    "3 - Buscar pessoa por CPF\n" +
                    "4 - Sair"));

            if (n == 1) {
                if (numContatos < 100) {
                    nomes[numContatos] = JOptionPane.showInputDialog("Digite o nome da pessoa:");
                    cpfs[numContatos] = Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF da pessoa:"));
                    numContatos++;
                } else {
                    JOptionPane.showMessageDialog(null, "Limite de cadastro excedido");
                }
            } else if (n == 2) {
                String busca = JOptionPane.showInputDialog("Digite o nome da pessoa que você está procurando:");
                int encontrados = 0;
                for (int i = 0; i < numContatos; i++) {
                    if (nomes[i].equalsIgnoreCase(busca)) {
                        JOptionPane.showMessageDialog(null, "Nome: " + nomes[i] + "\nCPF: " + cpfs[i]);
                        encontrados++;
                        break;
                    }
                }
                if (encontrados == 0) {
                    JOptionPane.showMessageDialog(null, "Cadastro não encontrado");
                }
            } else if (n == 3) {
                int cpf = Integer
                        .parseInt(JOptionPane.showInputDialog("Digite o CPF da pessoa que você está procurando:"));
                int encontrados = 0;
                for (int i = 0; i < numContatos; i++) {
                    if (cpfs[i] == cpf) {
                        JOptionPane.showMessageDialog(null, "Nome: " + nomes[i] + "\nCPF: " + cpfs[i]);
                        encontrados++;
                        break;
                    }
                }
                if (encontrados == 0) {
                    JOptionPane.showMessageDialog(null, "Cadastro não encontrado");
                }
            } else if (n != 4) {
                JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (n != 4);
    }
}