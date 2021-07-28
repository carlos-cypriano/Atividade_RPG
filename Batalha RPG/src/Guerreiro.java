public class Guerreiro extends Competidores {

    public Guerreiro(){
    atk = 25;
    defesa = 8;
    energia = 140;
    nome = "Guerreiro";
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

