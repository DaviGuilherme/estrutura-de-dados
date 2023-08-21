import java.util.Scanner;

public class ExemploMatriz {
    public static void main(String[] args) {
        //n Declaração de um veotr
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[5];

        // DECLARAÇÃO DE UMA MATRIZ 3X4
        int[][] matriz = new int[3][4];

        // DECLARAÇÃO DE UMA MATRIZ JA INICIALIZADA COM VALORES
        int[][] matriz2 = {{1,2},{3,4},{5,6},{7,8}};

        // DECLARAÇÃO DE UMA MATRIZ irregular com quntridadede coknas diferentes em cada linha
        int[][] matriz3 = {{1,2},{3,4,5,6,7},{8,6},{7,8,00}};



        // Solicita que o usúario digite os valores para
       // preencher a matriz
//       for(int linha =0;linha<matriz.length;linha++){
//           for(int coluna = 0; coluna < matriz[linha].length;coluna++){
//               System.out.printf("\nDigite o valor de matriz[%d][%d]",linha,coluna);
//               matriz[linha][coluna] = in.nextInt();
//           }
//       }
       // Exibe a matriz no formato de matrix
        exibeMatrix(matriz);
        System.out.println("=".repeat(60));
        exibeMatrix(matriz2);
        System.out.println("=".repeat(60));
        exibeMatrix(matriz3);
        System.out.println("=".repeat(60));
        exibeMatrixTransposta(matriz2);
    }
    public static void exibeMatrix(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
    public static void exibeMatrixTransposta(int[][]matriz){
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
}
