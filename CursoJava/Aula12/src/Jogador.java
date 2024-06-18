public class Jogador {
    private int num = 0;
    private int vidas = 0;
    private final int maxValue = 3;

    public Jogador(int num){
        this.num=num;
        this.vidas = 1;
        System.out.printf("Jogador numero %d criador%n", num);
    }

    public int getVidas(){
        return this.vidas;  
    }    

    public void addVidas(){       
        if (this.vidas < maxValue) {
            this.vidas++;
        }else {
            System.out.println("Valor de vidas, cheias!");
            System.out.println();
        }
    }
}
