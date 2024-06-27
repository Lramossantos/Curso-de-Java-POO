public class CursoJava {
    public static void main(String[] args) throws Exception {                
        int n1, n2;
        n1=10; n2=5;
        int res = 0;
        String op = "+";        
        switch (op) {
            case "+":
                res = n1 + n2;
                break;            
            case "-":
                res = n1 - n2;
                break;
            case "*":
                res = n1 * n2;
                break;
            case "/":
                res = n1 / n2;
                break;
            default:
                res = 0;
                System.out.printf("%s%n", "Operacao Invalida!");
                break;
        }
        System.out.println("Operacao: "+ op +" : resultado: "+res+"");
    }
}
