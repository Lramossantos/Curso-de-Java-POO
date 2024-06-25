public class Formiga extends Animal{ 
    

    public Formiga(int massa, int vel, int forca) {
        super(massa, vel, forca);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comer(int massa) {
        // TODO Auto-generated method stub
        super.comer(massa);
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub
        
        System.out.printf("Vivo: %s%n", isVivo()?"Sim, esta vivo":"Nao, esta morto");
    }

    @Override
    public void mover() {
        // TODO Auto-generated method stub
        super.mover();
    }

    
    
}
