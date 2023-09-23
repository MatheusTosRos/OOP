public class Funcionario extends Pessoa{

    private boolean trabalhando;
    private String setor;

    private void mudaTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public String getSetor() {
        return setor;
    }
}