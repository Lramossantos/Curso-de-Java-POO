package src;
public class Jogador {
    private int num = 0;
    private int vidas = 0;
    private int addVidas = 0;
    

    private final int maxValue = 3;
    private final int minValue = 0;
    static boolean alerta;
    static int qtdJogadores = 0;
    static int pontosJogadores = 0;

    

    public Jogador(int num) {
        this.num = num;
        this.vidas = 1;
        this.addVidas = addVidas;
        qtdJogadores+=10;
    }   

    public int getNum() {
        return num;
    }

    private void setNum(int num) {
        this.num = num;
    }

    public int getVidas() {        
        return vidas;
    }

    public void setVidas(int vidas) {
        if (vidas > maxValue) {
            System.out.println("Vida Cheia!");            
        } else if (vidas < minValue) {
            System.out.println("Vida Minima ja atingida!");
        }else {
            this.vidas = vidas;
        }                    
    }

    public int getAddVidas() {
        return addVidas;
    }

    public void setAddVidas(int addVidas) {
        if (getVidas() < maxValue && getVidas() > minValue || getVidas() > minValue && getVidas() < maxValue) {
            vidas++;    
            this.addVidas = addVidas;
        }else {
            System.out.println("Life s' full!");
        }
        
    }

    public static boolean isAlerta() {
        return alerta;
    }

    public static void setAlerta(boolean alerta) {        
        Jogador.alerta = alerta;
    }

    public static int getQtdJogadores() {
        return qtdJogadores;
    }

    public static void setQtdJogadores(int qtdJogadores) {
        Jogador.qtdJogadores = qtdJogadores;
    }

    public static int getPontosJogadores() {
        return pontosJogadores;
    }

    public static void setPontosJogadores(int pontosJogadores) {        
        Jogador.pontosJogadores = pontosJogadores+=10;
    }   

    public void info(){
        System.out.printf("Jogador:%d", this.num);
        System.out.printf("%nVidas:%d", this.vidas);
        System.out.printf("%nAlerta:%s",(alerta?"Yes, this is a player!":"No, this is not a player!"));
        System.out.printf("%nJogadores:%d", qtdJogadores);        
        System.out.printf("%nPonto dos jogadores:%d",pontosJogadores);
        System.out.printf("%n---------------------------------------%n");        
    }
}
