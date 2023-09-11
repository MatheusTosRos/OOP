public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampa;

    public void status(){
        System.out.println("É uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampa);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo: " + this.modelo);


    }
    public void rabiscar(){
        if (this.tampa == true){
            System.out.println("Caneta precisa ser despamada primeiro.");
        }else{
            System.out.println("Rabiscando...");
        }
    }
    protected void tampar(){
        this.tampa = true;
    }
    protected void destampar(){
        this.tampa = false;
    }
}
