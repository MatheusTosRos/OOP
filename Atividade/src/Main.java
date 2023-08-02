public class Main {
    public static void main(String[] args) {
        System.out.println("---------------");
        Pessoa pessoa = new Pessoa("Matheus", 18, "17/11/2004");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getDtnasc());
        System.out.println("---------------");
    }
}