public class CursoJava {
    public static void main(String[] args) throws Exception {
        Carro c[] = new Carro[3];
        c[0] = new Carro("Camaro");
        c[1] = new Carro(null);
        c[2] = new Carro(null);        
        

        CarroCombate cc[] = new CarroCombate[3];
        cc[0] = new CarroCombate(null, 0);
        cc[0].setNome("Ferrari");
        cc[0].setLigado(true);
        cc[0].setBlindagem(10);
        cc[0].atirar();
        cc[0].atirar();
        cc[0].atirar();
        cc[0].atirar();

        cc[0].info();
        
    }
}
