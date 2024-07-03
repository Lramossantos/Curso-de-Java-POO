//Você consegue resolver este desafio em Java? [Exercício Java] - Curso de Java - Aula 26

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;

        int nota = 0, cont = 0, tam = 5;

        String res[] = new String[tam];
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();

        String pergunta[] = new String[] {
                "Qual a maior estrela do nosso sistema solar?",
                "Qual a primeira letra do nosso alfabeto?",
                "2x10 é igual a?",
                "O fantastico mundo de ____ (desenho dos anos 80)",
                "Valor de PI?"
        };

        String resposta[] = new String[] {
                "a)Sol | b)Lua  | c)Marte", // 0 a
                "a)Z   | b)C    | c)A", // 1 c
                "a)10  | b)20   | c)12", // 2 b
                "a)Bob | b)Carl | c)Zech", // 3 a
                "a)3.10| b)3    | c)3.14" // 4 c
        };

        String gabarito[] = new String[] { "a", "c", "b", "a", "c" };

        for (int i = 0; i < gabarito.length; i++) {
            System.out.println("------------------------------------------------------------");
            System.out.println("Pergunta " + i);
            System.out.println(pergunta[i]);
            System.out.println();
            System.out.println(resposta[i]);
            res[i] = input.nextLine();

        }
        switch (res[0]) {
            case "a":
                cont += 2;
                break;
            default:
                System.out.println("Errou a questao {0}");
                break;
        }

        switch (res[1]) {
            case "c":
                cont += 2;
                break;
            default:
                System.out.println("Errou a questao {1}");
                break;
        }

        switch (res[2]) {
            case "b":
                cont += 2;
                break;
            default:
                System.out.println("Errou a questao {2}");
                break;
        }

        switch (res[3]) {
            case "a":
                cont += 2;
                break;
            default:
                System.out.println("Errou a questao {3}");
                break;
        }

        switch (res[4]) {
            case "c":
                cont += 2;
                break;
            default:
                System.out.println("Errou a questao {4}");
                break;
        }
        
        String metaFinal = "";
        if (cont <= 3) {
            // rerpovado
            metaFinal = "Reprovado";
        } else if (cont <= 5 && cont > 3) {
            // recuperação
            metaFinal = "Recuperacao";
        } else if (cont >= 6) {
            // aprovado
            metaFinal = "Aprovado";
        }
        System.out.printf("%s o valor da sua nota foi de %d, voce foi %s%n", nome, cont, metaFinal);
    }
}
