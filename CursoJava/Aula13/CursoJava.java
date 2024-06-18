public class CursoJava {
    public static void main(String[] args) {
        int num = 1;
        Jogador j1 = new Jogador(num++);
        Jogador j2 = new Jogador(num++);     
        Jogador j3 = new Jogador(num++);     
        Jogador j4 = new Jogador(num++);                      
        
        j1.setVidas(4);
        j1.info();
        j2.info();
        j3.info();
        j4.info();
            
    }
}
