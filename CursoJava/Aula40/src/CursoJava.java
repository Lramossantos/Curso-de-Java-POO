//Métodos para comparação de String em Java [String #P2] - Curso de Java - Aula 40
public class CursoJava {
    public static void main(String[] args) throws Exception {
        String s1 = new String("Bruno");
        String s2 = "bruno";
        String s3 = "CFB Cursos";
        String s4 = "cfb cursos";
        String s5 = "CFB Curso de Java";
        String s6 = "Bruno";

        System.out.println(s2);
        System.out.println();

         //equals: Compara se as strings s1 e s2 são exatamente iguais, diferenciando maiúsculas de minúsculas.
        if (s1.equals(s2)) {
            System.out.println("s1 igual s2");
        }else{
            System.out.println("s1 diferente s2");
        }
        System.out.println();

        //equalsIgnoreCase: Compara se as strings s1 e s2 são iguais, ignorando a diferença entre maiúsculas e minúsculas.
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s1 igual s2");
        }else{
            System.out.println("s1 diferente s2");
        }
        System.out.println();

        //compareTo: Compara lexicograficamente s1 e s2, retornando 0 se forem iguais, um valor negativo se s1 for menor, e positivo se s1 for maior.
        int res = s1.compareTo(s2);
        System.out.println(res);
        System.out.println();

        //compareToIgnoreCase: Compara lexicograficamente s1 e s4, ignorando maiúsculas e minúsculas, retornando 0 se forem iguais, um valor negativo se s1 for menor, e positivo se s1 for maior.
        int tot = s1.compareToIgnoreCase(s4);
        System.out.println(tot);
        System.out.println(); 

        //regionMatches
        if (s4.regionMatches(true,0, s5, 0, 10)) {
            System.out.println("s4 igual s5");
        }else{
            System.out.println("s4 diferente s5");
        }

    }
}
