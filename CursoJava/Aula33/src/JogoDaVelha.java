import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Campo[][] velha = new Campo[3][3];
        boolean game = true;
        char simboloAtual = 'X';
        String vitoria = "";
        Scanner scan = new Scanner(System.in);
        iniciarJogo(velha);

        while (game) {
            desenhaJogo(velha);
            vitoria = verificaVitoria(velha);
            if (!vitoria.equals("")) {
                System.out.printf("Jogador %s venceu%n", vitoria);
                break;
            }
            try {
                if (verificarJogada(velha, jogar(scan, simboloAtual), simboloAtual)) {
                    simboloAtual = (simboloAtual == 'X') ? 'O' : 'X';
                } else {
                    System.out.println("Posição já ocupada! Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        desenhaJogo(velha);
        System.out.println("Fim do Jogo");
    }

    public static void desenhaJogo(Campo[][] velha) {
        limparTela();
        System.out.println("    0   1   2");
        for (int i = 0; i < velha.length; i++) {
            System.out.printf("%d   %c | %c | %c %n", i, velha[i][0].getSimbolo(), velha[i][1].getSimbolo(), velha[i][2].getSimbolo());
            if (i < 2) {
                System.out.println("   ---|---|---");
            }
        }
    }

    public static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static int[] jogar(Scanner scan, char simboloAtual) {
        int[] p = new int[2];
        System.out.printf("%nJogador %c, informe a linha e coluna (0, 1, ou 2):%n", simboloAtual);
        System.out.print("Linha: ");
        p[0] = scan.nextInt();
        System.out.print("Coluna: ");
        p[1] = scan.nextInt();
        return p;
    }

    public static boolean verificarJogada(Campo[][] velha, int[] p, char simboloAtual) {
        if (velha[p[0]][p[1]].getSimbolo() == ' ') {
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        } else {
            return false;
        }
    }

    public static void iniciarJogo(Campo[][] velha) {
        for (int i = 0; i < velha.length; i++) {
            for (int j = 0; j < velha[i].length; j++) {
                velha[i][j] = new Campo();
            }
        }
    }

    public static String verificaVitoria(Campo[][] velha) {
        // Verifica linhas
        for (int i = 0; i < 3; i++) {
            if (velha[i][0].getSimbolo() == velha[i][1].getSimbolo() && velha[i][1].getSimbolo() == velha[i][2].getSimbolo() && velha[i][0].getSimbolo() != ' ') {
                return String.valueOf(velha[i][0].getSimbolo());
            }
        }
        // Verifica colunas
        for (int j = 0; j < 3; j++) {
            if (velha[0][j].getSimbolo() == velha[1][j].getSimbolo() && velha[1][j].getSimbolo() == velha[2][j].getSimbolo() && velha[0][j].getSimbolo() != ' ') {
                return String.valueOf(velha[0][j].getSimbolo());
            }
        }
        // Verifica diagonais
        if (velha[0][0].getSimbolo() == velha[1][1].getSimbolo() && velha[1][1].getSimbolo() == velha[2][2].getSimbolo() && velha[0][0].getSimbolo() != ' ') {
            return String.valueOf(velha[0][0].getSimbolo());
        }
        if (velha[0][2].getSimbolo() == velha[1][1].getSimbolo() && velha[1][1].getSimbolo() == velha[2][0].getSimbolo() && velha[0][2].getSimbolo() != ' ') {
            return String.valueOf(velha[0][2].getSimbolo());
        }
        return "";
    }
}
