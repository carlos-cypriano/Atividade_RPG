public class Cerbero extends Monstro{
 
    public Cerbero(){
    int atk = 26;
    int defesa = 8;
    int energia = 130;
    String nome = "Cerbero";
    }

    //@Override serve pra apontar que esse método está repetindo o método Pai no caso o Monstro
    @Override
    public void atacar (Humano h){
        h.energia = h.energia - h.atk;
    }

    @Override
    public void atacar (Monstro m){
        m.energia = m.energia - m.atk;
    }

    @Override
    public void defender (Humano h){
        h.energia = h.energia - h.atk + h.defesa;
    }

    @Override
    public void defender (Monstro m){
        m.energia = m.energia - m.atk + m.defesa;
    }
}
