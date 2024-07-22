//THROW, lançando uma exceção em Java [Aula prática] - Curso de Java - Aula 38

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String>Carro = new ArrayList<>();
        Carro.add("Mustang");
        Carro.add("Ferrari");
        Carro.add("Camaro");
        
        int nota1, nota2, res;
        nota1=60;
        nota2=20;
        if (nota1 > 50) {
            throw new IllegalArgumentException("Valor da nota invalido");    
        }if(nota2 > 50){
            throw new IllegalArgumentException("Valor da nota invalido");
        }
        
        res = nota1+nota2;
        System.out.println("Resultado: "+ res);


    }
}
