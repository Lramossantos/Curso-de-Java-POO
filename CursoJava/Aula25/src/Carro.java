public class Carro {
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;
    
    public Carro(String nome) {
        this.nome = nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Boolean getLigado() {
        return ligado;
    }
    public void setLigado(Boolean ligado) {        
        this.ligado = ligado;
    }
    public Boolean getDestruido() {
        return destruido;
    }
    public void setDestruido(Boolean destruido) {
        this.destruido = destruido;
    }
    public int getBlindagem() {
        return blindagem;
    }
    public void setBlindagem(int blindagem) {
        this.blindagem = blindagem;
    }
    public Boolean getArmamento() {
        return armamento;
    }
    public void setArmamento(Boolean armamento) {
        this.armamento = armamento;
    }

    public void sofrerDanos(int dano){
        this.blindagem-=dano;
        if (this.blindagem<=0) {
            this.blindagem=0;
            this.ligado=false;
            this.destruido=true;
        }
    }

    public void info(){
        System.out.println("-----------------------");
        System.out.printf("nome: ............... %s %n",getNome());
        System.out.printf("ligado: ............. %s %n",getLigado()?"O carro esta ligado":"O carro esta desligado!");
        System.out.printf("destruido: .......... %s %n",getDestruido()?"O carro esta destruido":"esta em condicoes boas");
        System.out.printf("blindagem: .......... %d %n", getBlindagem());
        System.out.printf("armamento: .......... %s %n", getArmamento()?"Sim":"Nao");
    }   
    

}
