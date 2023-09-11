public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampa;
//-----------------------------CONSTRUTOR--------------------------------//

    public Caneta(String modelo, float ponta, String cor, boolean tampa) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampa = tampa;
    }

    //-----------------------------GET & SET (modelo)--------------------------------//
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
//-----------------------------GET & SET (ponta)--------------------------------//
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
//-----------------------------MÉTODOS (tampa) & (status)--------------------------------//
    public void tampar(){
        this.tampa = true;
    }
    public void destampar(){
        this.tampa = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampa);
    }
}
