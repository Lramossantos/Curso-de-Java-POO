//Você sabe usar BREAK e CONTINUE em Java? [Aprenda nesta aula] - Curso de Java - Aula 23

public class CursoJava {
    public static void main(String[] args) throws Exception {
        int cont = 100;
        for (int i = 0; i < cont; i++) {            
            if (i >= 10 && i <= 60) {
                continue;
            }
            System.out.printf("%d - ", i);
        }
    }
}
