public class Main {
    public static void main(String[] args) {

        Lutador l1 = new Lutador("Matheus", "Brasil", 18, 1.82f, 76.8f,
                12, 3,5);
        Lutador l2 = new Lutador("Lucas", "Brasil", 18, 1.82f, 72.8f,
                8, 5, 2);

        Luta luta01 = new Luta();
        luta01.marcarLuta(l1,l2);
        luta01.lutar();
    }
}