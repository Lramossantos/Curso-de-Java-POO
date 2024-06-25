abstract class Animal implements SerVivo{
    private boolean vivo;
    private int massa;
    private int x;
    private int y;
    private int vel;
    private int forca;
    
    public Animal(int massa, int vel, int forca) {
        this.vivo = true;
        this.massa = massa;
        this.x = 0;
        this.y = 0;
        this.vel = vel;
        this.forca = forca;
    }
    

    @Override
    public void comer(int massa) {
        if (this.vivo) {
            this.forca+=massa;
        } else{
            System.out.println("-------------------------");
            System.out.println(this.getClass().toGenericString()+" esta morto, nao pode comer!");
            System.out.println("-------------------------");
        }        
    }

    @Override
    public void info() {
        System.out.printf("Tipo: %s%n", getClass().toString());
        System.out.printf("Vivo: %s%n", isVivo()?"Sim":"Nao");
        System.out.printf("Massa: %s%n", getMassa());
        System.out.printf("Vel: %s%n", getVel());
        System.out.printf("Forca: %s%n", getForca());
        System.out.println("------------------------------");        
    }

    @Override
    public void mover() {
        if (this.vivo) {
            this.x+=this.vel;
            this.y+=this.vel;
        } else {
            System.out.println("--------------------");
            System.out.printf(getClass().toGenericString(), " esta morto, nao pode mover!%n");
            System.out.println("--------------------");
        }
        
    }

    public void atacar(Animal a){
        if (this.vivo) {
            if(this.forca > a.forca){
                this.forca+=a.getMassa();
                a.vivo = false;
            }else {
                System.out.println("----------------");
                System.out.println(this.getClass().toGenericString() + "Esta morto, nao pode atacar!");
                System.out.println("----------------");
            }
        }
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


    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }


    public int getVel() {
        return vel;
    }


    public void setVel(int vel) {
        this.vel = vel;
    }


    public int getForca() {
        return forca;
    }


    public void setForca(int forca) {
        this.forca = forca;
    }

     

    


}
