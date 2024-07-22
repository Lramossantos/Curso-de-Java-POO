//Tratamento de Erros com Try Catch Finally [Aula prática] - Curso de Java - Aula 37

import java.util.ArrayList;

public class CursoJava {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer>idade = new ArrayList<>();
        idade.add(2);
        idade.add(3);
        idade.add(0,10);
        try {
            System.out.println(idade.get(0));
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getLocalizedMessage());
        } finally {
            System.out.println("Erro acima!");
        }
    }
}
