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
        this.energia = this.energia - c.atk;
    }

    @Override
    public void defender (Competidores c){
        c.atk = c.atk - this.defesa;
        this.energia = this.energia - c.atk;
    }
}
