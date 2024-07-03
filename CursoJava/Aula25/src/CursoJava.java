//Como criar Array de tipo personalizado [Aprenda nesta aula] - Curso de Java - Aula 25


public class CursoJava {
    public static void main(String[] args) throws Exception {
        final int numCarros = 5;
        Carro carros[] = new Carro[numCarros];
        String nomeCarros[] = {"HRV", "Golf", "Camaro", "mustang", "Touro"};       
        

        for (int i = 0; i < nomeCarros.length; i++) {
            carros[i] = new Carro(nomeCarros[i]);
        }

        for (Carro c : carros) {
            c.info();
        }
    }
}
