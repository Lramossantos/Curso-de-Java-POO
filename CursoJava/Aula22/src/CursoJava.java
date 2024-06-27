public class CursoJava {
    public static void main(String[] args) throws Exception {                
        int nota = 2;
        String res;
        switch (nota) {
            case 10: case 9: case 8: case 7: 
                res="Aprovado";
                break;
                case 6: case 5: case 4: 
                res="Recuperacao";
                break;
                case 3: case 2: case 1: case 0:
                res="Reprovado";
                break;
            default:
                res = "Nota Invalida";
                break;
        }
        System.out.println("A nota foi " +nota+ " e voce esta " +res);
    }
}
