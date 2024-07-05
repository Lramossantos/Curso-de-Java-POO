//Quantos parâmetros podem ser passados para uma mesma função? - Curso de Java - Aula 29
public class App {
    public static void main(String[] args) throws Exception {
        
        //int numeros[] = {10,5,2,3,20};
        int res;
        res = soma(20,4,3,2,1);
        System.out.println(res);
    }
    public static int soma(int...n){
        int res = 0;
        for (int i : n) {
            res+=i;
        }
        return res;
    }
}
