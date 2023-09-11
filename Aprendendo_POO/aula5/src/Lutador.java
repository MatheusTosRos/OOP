public class Lutador {
//------------------------Atributos------------------------//
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empate;
//------------------------Construtor------------------------//
    public Lutador(String nome, String nacionalidade, int idade, float altura,
                   float peso, int vitorias, int derrotas, int empates){

        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empate = empates;

    }
//------------------------Métodos------------------------//
    public void apresentar(){
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretemente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
        System.out.println("Pesando " + this.getPeso());
        System.out.println(this.getVitorias() + " vitórias, ");
        System.out.println(this.getDerrotas() + " derrotas e ");
        System.out.println(this.getEmpate() + " empates!!");
    }
    public void status(){
        System.out.println(this.getNome() + " é peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes.");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes.");
        System.out.println("Empatou " + this.getEmpate() + " vezes.");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
    }
//------------------------Métodos------------------------//

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2f){
            this.categoria = "Inválido.";
        }else if (this.getPeso() <= 70.3f){
            this.categoria = "Leve.";
        } else if (this.getPeso() < 83.9f) {
            this.categoria = "Médio";
        } else if (this.getPeso() < 120.2) {
            this.categoria = "Pesado";
        }else{
            this.categoria ="Inváldo";
        }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
}
