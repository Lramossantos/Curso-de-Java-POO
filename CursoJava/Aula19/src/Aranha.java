public class Aranha extends Animal{
    private int veneno;
    public Aranha(int massa, int vel, int forca) {
        super(massa, vel, forca);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void atacar(Animal a){
        if (this.isVivo()) {
            if(this.getForca() > a.getForca()){
                this.setForca(this.getForca() + a.getMassa());     
                a.setVivo(false);           
            }else{
                this.setVivo(false);
            }
        }else{
            System.out.println("-----------------------");
            System.out.println(this.getClass().toGenericString() + " esta morto, nao pode atacar!");
            System.out.println("-----------------------");
        }
    }

    @Override
    public void comer(int massa) {
        // TODO Auto-generated method stub
        super.comer(massa);
    }

    @Override
    public void mover() {
        // TODO Auto-generated method stub
        super.mover();
    }
    
    public int getVeneno() {
        return veneno;
    }

    public void setVeneno(int veneno) {
        this.veneno = veneno;
    }


}
