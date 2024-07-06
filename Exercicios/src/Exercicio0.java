import javax.swing.JOptionPane;

public class Exercicio0 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[1][5];
        int[][] matriz2 = new int[1][10];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para a matriz1: "));
            }
        }

  
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para a matriz2: "));
            }
        }

    
        System.out.println("Matriz1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Matriz2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

    
        System.out.println("Soma das matrizes:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}