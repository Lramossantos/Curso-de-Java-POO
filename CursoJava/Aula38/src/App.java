//THROW, lançando uma exceção em Java [Aula prática] - Curso de Java - Aula 38

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> nota = new ArrayList<>();
        nota.add(50);
        nota.add(70);
        int res = 0;
        if (nota.get(0)>50) {
            throw new IllegalArgumentException("Este é um erro forçado, valor invalido!");
        }if (nota.get(1)>50) {
            throw new IllegalArgumentException("Este é um erro forçado, valor invalido!");    
        }
        res = nota.get(0) + nota.get(1);
        System.out.println("Resultado: "+res);

        
    }
}
