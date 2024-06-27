public class CursoJava {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Sapo sapo = new Sapo(2, 2, 2);
        Aranha aranha = new Aranha(5, 5, 5);
        Formiga formiga = new Formiga(10,10,10);
        Vegetal vegetal = new Vegetal(10);

        aranha.info();
        aranha.atacar(formiga);
        aranha.comer(formiga.getMassa());        
        aranha.info();
        //System.out.println(formiga.isVivo());
        
        
        
    }
}
