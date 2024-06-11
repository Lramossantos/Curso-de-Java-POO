import java.security.SecureRandom;

public class cursoJava {

    public static void main(String[] args) {
        final int linha = 3;
        final int coluna = 5;

        int nu[][] = {
        {0,1,2,3,4},
        {10,11,12,13,14},
        {100,101,102,103,104}};

        int numero[][] = new int[linha][coluna];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {                
                numero[i][j] = new SecureRandom().nextInt(100);
            }
        }
        //
        //for (int i = 0; i < linha; i++) {
        //    for (int j = 0; j < coluna; j++) {
        //        System.out.printf("%2d |",numero[i][j]);                
        //    }
        //    System.out.println("");
        //}

        for (int num[] : nu) {
            for (int v : num) {
                System.out.printf("%3d |", v);       
            }
            System.out.println();
        }
    }
}