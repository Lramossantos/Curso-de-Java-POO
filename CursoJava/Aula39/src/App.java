//Trabalhando com String em Java #P1 [Aula prática] - Curso de Java - Aula 39
public class App {
    public static void main(String[] args) throws Exception {
        char[] texto_c = { 'c', 'u', 'r', 's', 'o', ' ', 'd', 'e', ' ', 'j', 'a', 'v', 'a' };
        char[] texto_c2;
        texto_c2 = new char[10];
        
        String texto_s = new String("CFB Cursos");
        String s1 = new String();
        String s2 = new String(texto_c);
        String s3 = new String(texto_s);

        System.out.println(s2.length());

        System.out.println(s3.charAt(0));

        texto_s.getChars(4, 10, texto_c2, 0);
        System.out.println(texto_c2);
    }
}
