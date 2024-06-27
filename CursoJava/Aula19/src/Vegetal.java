public class Vegetal implements SerVivo{
    private boolean vivo;
    private int massa;

    public Vegetal(int massa){
        this.massa = massa;        
    }
    
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public int getMassa() {
        return massa;
    }
    public void setMassa(int massa) {
        this.massa = massa;
    }

    @Override
    public void info() {
        System.out.printf("Tipo..:%s%n", getClass().toGenericString());
        System.out.printf("Vivo..:%s%n", this.isVivo()?"Sim":"Nao");
        System.out.printf("Massa..:%s%n", this.getMassa());
        System.out.printf("--------------------------------------------");
        
    }

    @Override
    public void mover() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mover'");
    }

    @Override
    public void comer(int massa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }
    
     
    
}
