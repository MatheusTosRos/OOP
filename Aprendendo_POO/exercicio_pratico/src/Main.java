
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Matheus", 18, "Masculino");
        Livro[] l = new Livro[3];

        l[0] = new Livro("Diário de um Banana 1","Pedro da Silva",142,p1);
        l[1] = new Livro("Diário de um Banana 2","Pedro da Silva",123,p1);
        l[2] = new Livro("IT","Stephan King",1104,p1);

        System.out.println( l[2].detalhes());

    }
}