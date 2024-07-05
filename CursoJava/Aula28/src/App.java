//Passagem por valor e por referência em Java. Será que existe em Java? - Curso de Java - Aula 28

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int notas[] = { 10, 85, 62, 45, 98, 78, 88, 60, 67, 82 };
        int resultados[] = { 0, 0 };
        conferirNotas(notas, resultados);

        System.out.println("------------------------");
        System.out.printf("Aprovados: %d%n");
        System.out.println("------------------------");
        System.out.printf("Reprovados: %d%n");
    }

    public static void conferirNotas(int[] nt, int[] res) {
        for (int i : nt) {
            if (i >= 60) {
                res[0]++;
            }else{
                res[1]++;
            }
            
        }
    }
};
