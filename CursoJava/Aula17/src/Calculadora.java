import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Numero n[] = new Numero[3];
        Numero res[] = new Numero[3];

        n[0] = new Numero();
        n[1] = new Numero();
        res[0] = new Numero();

        String opc = "S";
        while (opc.equals("S") || opc.equals("s") ) {
            System.out.printf("Digite o valor 1: ");
            n[0].setValor(input.nextInt());

            System.out.printf("Digite o valor 2: ");
            n[1].setValor(input.nextInt());

            res[0].setValor(n[0].getValor() + n[1].getValor());

            System.out.printf("O valor de %d mais %d e igual a %d%n", n[0].getValor(), n[1].getValor(),
                    res[0].getValor());

            System.out.printf("Deseja adicionar outro valor?");
            opc = input.next();

            if (!(opc.equals("S") || opc.equals("s"))) {
                System.out.println("Calculadora encerrada!");
            }
        }
    }
}
