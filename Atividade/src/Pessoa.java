public class Pessoa {
    private String nome;
    private String dtnasc;
    private int idade;

    public Pessoa(String nome, int idade, String dtnasc) {
        this.nome = nome;
        this.idade = idade;
        this.dtnasc = dtnasc;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }

    public String getDtnasc() {
        return this.dtnasc;
    }
}