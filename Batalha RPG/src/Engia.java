public class Engia extends Competidores{
    

    public Engia( ){
    atk = 22;
    defesa = 4;
    energia = 110;
    nome = "Engia";
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
