public class Cerbero extends Competidores{
 
    public Cerbero(){
    atk = 26;
    defesa = 8;
    energia = 130;
    nome = "Cerbero";

    }

    //@Override serve pra apontar que esse método está repetindo o método Pai no caso o Monstro
    @Override
    public void atacar (Competidores c){
        c.energia = c.energia - this.atk;
    }

   /* @Override
    public void atacar (Monstro m){
        m.energia = m.energia - this.atk;
    }*/

    @Override
    public void defender (Competidores c){
        c.energia = c.energia - this.atk + this.defesa;
    }

    /*@Override
    public void defender (Monstro m){
        m.energia = m.energia - this.atk + this.defesa;
    }*/
}
