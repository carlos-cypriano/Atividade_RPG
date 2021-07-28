public class Templario extends Competidores {

    public Templario(){
    atk = 23;
    defesa = 12;
    energia = 130;
    nome = "Templario";
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
