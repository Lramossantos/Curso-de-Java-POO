//ArrayList, um array especial e turbinado! [Aula prática] - Curso de Java - Aula 36
import java.util.ArrayList;
public class CursoJava {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>(100);

        numeros.add(11);
        numeros.add(22);
        numeros.add(33);

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add(1,"Argo");  
        carros.add("fusion");

        carros.trimToSize();
        
        for (int e : numeros) {
            System.out.println(e);
        }   

        System.out.println();   
        

        for (String e : carros) {            
            System.out.println(e);            
        }
        System.out.println();                
        System.out.println(carros.getLast());
        System.out.println();            

        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        System.out.println();
        System.out.println(carros.indexOf("Polo"));
        System.out.println();
        System.out.println(carros.remove(2 ));
    }
}
