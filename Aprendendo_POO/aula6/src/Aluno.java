public class Aluno extends Pessoa{

    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada.");
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}
