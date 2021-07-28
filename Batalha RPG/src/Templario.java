public class Templario extends Humano {

    public Templario(){
    int atk = 23;
    int defesa = 10;
    int energia = 120;
    String nome = "Templario";
    }

    //@Override serve pra apontar que esse método está repetindo o método Pai no caso o Monstro
    @Override
    public void atacar (Humano h){
        h.energia = h.energia - this.atk;
    }

    @Override
    public void atacar (Monstro m){
        m.energia = m.energia - this.atk;
    }

    @Override
    public void defender (Humano h){
        h.energia = h.energia - this.atk + this.defesa;
    }

    @Override
    public void defender (Monstro m){
        m.energia = m.energia - this.atk + this.defesa;
    }
}
