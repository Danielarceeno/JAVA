import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Questao_4 {
//menu de opções
    public static void main(String[] args) {
        ArrayList<Carro> lista = new ArrayList<Carro>();
        int op;
        do {
            op = menu();
            if(op == 1) {
                lista.add(lerCarro());
            } else if(op == 2) {
                localizarCarroPorPlaca(lista);
            } else if(op == 3) {
                verificarCarrosPorCondutor(lista);
            } else if(op == 4) {
                dadosCarrosAno2024(lista);
            } else if(op == 5) {
                listarCarrosPorCor(lista);
            } else if(op == 6) {
                msg("Saindo do programa.");
            } else {
                msg("Opção inválida.");
            }
        } while(op != 6);
    }
//menu de opções
    private static int menu() {
        String m = "1 - Cadastrar Carro\n"
                 + "2 - Localizar Carro pela Placa\n"
                 + "3 - Verificar Carros por Condutor\n"
                 + "4 - Dados de todos os carros fabricados no ano 2024\n"
                 + "5 - Listar todos os carros de uma determinada cor\n"
                 + "6 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }
//mensagens
    private static void msg(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
//leitura de string
    private static String lerString(String txt) {
        String str = JOptionPane.showInputDialog(txt);
        if (str.trim().equals("")) {
            return lerString(txt);
        }
        return str.toUpperCase();
    }
//leitura de int
    private static int lerInt(String txt, int min, int max) {
        int i = Integer.parseInt(JOptionPane.showInputDialog(txt));
        if (i < min || i > max) {
            return lerInt(txt, min, max);
        }
        return i;
    }
//leitura da informações dos carros
    private static Carro lerCarro() {
        Carro c = new Carro();
        c.marca = lerString("Marca");
        c.modelo = lerString("Modelo");
        c.anoFabricacao = lerInt("Ano de Fabricação", 1900, 2024);
        c.cor = lerString("Cor");
        c.placa = lerString("Placa");
        lerCondutores(c);
        return c;
    }
    //leitura do condutor
    private static void lerCondutores(Carro c) {
        int numCondutores = lerInt("Número de condutores", 1, 10);
        c.condutores = new String[numCondutores];
        for (int i = 0; i < numCondutores; i++) {
            c.condutores[i] = lerString("Nome do Condutores " + (i+1));
        }
    }
 // localizar carro pela placa
    private static void localizarCarroPorPlaca(ArrayList<Carro> lista) {
        String placa = lerString("Informe a placa");
        for (Carro c : lista) {
            if (c.placa.equalsIgnoreCase(placa)) {
                String condutores = "";
                for (String condutor : c.condutores) {
                    condutores += condutor + "\n";
                }
                msg("Condutores que podem dirigir o carro:\n" + condutores);
                return;
            }
        }
        msg("Nenhum carro encontrado com a placa: " + placa);
    }
 // verificar carros por condutor
    private static void verificarCarrosPorCondutor(ArrayList<Carro> lista) {
        String condutor = lerString("Informe o nome do condutor");
        String carros = "";
        for (Carro c : lista) {
            for (String nome : c.condutores) {
                if (nome.equalsIgnoreCase(condutor)) {
                    carros += c.marca + " " + c.modelo + " (Placa: " + c.placa + ")\n";
                    break;
                }
            }
        }
        msg(carros.isEmpty() ? "Nenhum carro encontrado para o condutor: " + condutor : "Carros que o condutor pode dirigir:\n" + carros);
    }
//dados dos carros fabricados no ano de 2024
    private static void dadosCarrosAno2024(ArrayList<Carro> lista) {
        String dados = "";
        for (Carro c : lista) {
            if (c.anoFabricacao == 2024) {
                dados += "Marca: " + c.marca + "\n"
                      + "Modelo: " + c.modelo + "\n"
                      + "Ano de Fabricação: " + c.anoFabricacao + "\n"
                      + "Cor: " + c.cor + "\n"
                      + "Placa: " + c.placa + "\n\n";
            }
        }
        msg(dados.isEmpty() ? "Nenhum carro fabricado no ano de 2024 encontrado." : "Carros fabricados no ano de 2024:\n" + dados);
    }
//listar todos os carros de uma determinada cor
    private static void listarCarrosPorCor(ArrayList<Carro> lista) {
        String cor = lerString("Informe a cor");
        String carros = "";
        for (Carro c : lista) {
            if (c.cor.equalsIgnoreCase(cor)) {
                carros += "Marca: " + c.marca + "\n"
                       + "Modelo: " + c.modelo + "\n"
                       + "Ano de Fabricação: " + c.anoFabricacao + "\n"
                       + "Placa: " + c.placa + "\n\n";
            }
        }
        msg(carros.isEmpty() ? "Nenhum carro encontrado com a cor: " + cor : "Carros com a cor " + cor + ":\n" + carros);
    }
}