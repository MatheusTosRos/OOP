public class Professor extends Pessoa{

    private String especialidade;
    private float salario;

    public void receberAumento(float aumento){
        this.salario += aumento;
    }
}
