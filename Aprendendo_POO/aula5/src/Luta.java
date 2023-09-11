import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
//--------------------------Métodos--------------------------//

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
            if(this.getAprovada()){
                System.out.println("###DESAFIADO###");
                this.getDesafiado().apresentar();
                System.out.println("###DESAFIANTE###");
                this.getDesafiante().apresentar();

                Random aleatorio = new Random();
                int vencedor = aleatorio.nextInt(3);
                switch (vencedor){
                    case 0://empate
                        System.out.println("Epatou!!");
                    case 1://desafiado vence
                        System.out.println(this.getDesafiado().getNome() + "vence contra" + this.getDesafiante().getNome());
                    case 2://desafiante vence
                }
            }
    }
//-----------------------------Get & Set-----------------------------//


    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
