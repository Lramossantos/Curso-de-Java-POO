package src;
public class CursoJava {
    public static void main(String[] args) {
        int num = 1;
        
        Jogador j[] = new Jogador[3];        
        j[0] = new Jogador(num++);
        j[1] = new Jogador(num++);
        j[2] = new Jogador(num++);
        
        Jogador.alerta = true;
        


        
        j[0].info();
        j[1].info();
        j[2].info();
        
    }
}
