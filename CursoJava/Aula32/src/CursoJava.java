//Aprendendo sobre MATRIZES em JAVA - Curso de Java - Aula 32
import java.security.SecureRandom;



public class CursoJava {
    public static void main(String[] args) throws Exception {
        
        int[][] numeros = new int[10][10];        
        geraDados(numeros, 2, 2);        
        impDados(numeros,4, 4);
    }

    public static void geraDados(int [][] mtz, int linhas, int colunas){
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                mtz[l][c] = new SecureRandom().nextInt(10);
            }
        }
    }

    public static void impDados(int[][] mtz, int linhas, int colunas){
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.printf("%d - ", mtz[l][c]);
            }
            System.out.println();
        }
    }
}
