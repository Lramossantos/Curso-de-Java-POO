//Métodos que irão facilitar sua vida ao trabalhar com Arrays em Java - Curso de Java - Aula 30

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int num1[] = new int[10];
        int num2[] = new int[10];
        int num3[] = new int[10];
        int num4[] = new int[10];

        for (int i : num1) {
            Random random = new Random();
            i = random.nextInt(11);
            System.out.printf("%d  ", i);

        }

        
            int pos = Arrays.binarySearch(num1, 10);
            System.out.printf("%d esta no array? %s - posicao: %d%n",10 , pos >-1?"Sim":"Nao",pos);
        

        /* System.out.println();
        System.out.println("----------------------------------------");

        for (int i : num2) {
            Random random = new Random();
            i = random.nextInt(10);
            System.out.printf("%d  ", i);
        }
        System.out.println();
        System.out.println("----------------------------------------");
        for (int i : num3) {
            Random random = new Random();
            i = random.nextInt(10);
            System.out.printf("%d  ", i);
        }
        System.out.println();
        System.out.println("----------------------------------------");
        for (int i : num4) {
            Random random = new Random();
            i = random.nextInt(10);
            System.out.printf("%d  ", i);
        }
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.printf("num1 - %s%n",Arrays.equals(num1, num1)?"Diferente":"Igual"); 
        System.out.printf("num2 - %s%n",Arrays.equals(num1, num2)?"Diferente":"Igual"); 
        System.out.printf("num3 - %s%n",Arrays.equals(num1, num3)?"Diferente":"Igual"); 
        System.out.printf("num4 - %s%n",Arrays.equals(num1, num4)?"Diferente":"Igual");  */
    }
}
