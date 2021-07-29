public class Ladino extends Competidores {

    public Ladino(){
    atk = 23;
    defesa = 5;
    energia = 90;
    nome = "Ladino";
    }

    //@Override serve pra apontar que esse método está repetindo o método Pai no caso o Monstro
    @Override
    public void atacar (Competidores c){
        c.energia = c.energia - this.atk;
    }

    @Override
    public void defender (Competidores c){
        c.atk = c.atk - this.defesa;
        this.energia = this.energia - c.atk;
    }

}
