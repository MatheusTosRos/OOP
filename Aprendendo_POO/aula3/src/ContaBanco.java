public class ContaBanco {
    public int numConta;
    protected String tipo;
    private  String dono;
    private float  saldo;
    private boolean status;

    public void estadoAtual(){
        if (getStatus() == true){
            System.out.println("Conta está ativa");
            System.out.println("Conta " + this.getNumConta());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Dono: " + this.getDono());
            System.out.println("Saldo: " + this.getSaldo());
        }else{
            System.out.println("Conta está desativada.");
        }
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada! Ainda tem saldo.");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada! Saldo está negativo.");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito resalizado na conta de " + this.getDono() + ".");
        }else{
            System.out.println("Impossivel realizar depósito em uma conta fechada.");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono() + ".");
            }else{
                System.out.println("Saldo insuficiente para o saque de " + v + "reais.");
            }
        }else{
            System.out.println("Impossivel realizar depósito em uma conta fechada.");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(getSaldo() - v);
            System.out.println("Mensalidade paga para a conta " + this.getDono() + ".");
        }else{
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }
    //----------------Construtor-----------------//
    public void ContaBanco(){

    }
    //----------------Get & Set-----------------//

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }
}
