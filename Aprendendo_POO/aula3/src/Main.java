
public class Main {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.abrirConta("CC");
        conta1.setNumConta(1234);
        conta1.setDono("Maria Eliane Toscano Rossini");


        conta1.depositar(100.00f);
        conta1.pagarMensal();
        conta1.estadoAtual();
    }
}