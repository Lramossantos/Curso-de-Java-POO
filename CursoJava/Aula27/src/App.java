//Passando Arrays como parâmetros para funções - Curso de Java - Aula 27

public class App {
    public static void main(String[] args) throws Exception {
        int []num = {10, 5,15,20,100,25,14,8,3,98,75,62};
        parImpar(num);
        
    }

    public static void parImpar(int []n){
        for (int i : n) {
            if (i % 2 == 0) {
                System.out.println(i+"Par");
            }else {
                System.out.println(i+"Ímpar");
            }
        }
    }
}
