public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" + "titulo='" + titulo + '\'' + "\n, autor='" + autor + '\'' +
                ",\n totalPag=" + totalPag + ",\n pagAtual=" + pagAtual +
                ",\n leitor=" + leitor.getNome() + '}';
    }

    public Livro(String titulo, String autor, int totalPag, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
