public class Formiga extends Animal{
    private boolean vivo;
    public Formiga() {
        this.vivo = true;
    }

    @Override
    public void comer(int massa) {
        // TODO Auto-generated method stub
        super.comer(massa);
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub
        
        System.out.printf("Vivo: %s%n", this.vivo?"Sim, esta vivo":"Nao, esta morto");
    }

    @Override
    public void mover() {
        // TODO Auto-generated method stub
        super.mover();
    }

    
    
}
