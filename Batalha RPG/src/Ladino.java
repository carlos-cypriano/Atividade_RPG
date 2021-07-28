public class Ladino extends Humano {

    public Ladino(){
    atk = 21;
    defesa = 5;
    energia = 80;
    nome = "Ladino";
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
