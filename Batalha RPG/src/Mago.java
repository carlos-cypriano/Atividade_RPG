public class Mago extends Competidores {

    
    public Mago(){
        atk = 30;
        defesa = 4;
        energia = 80;
        nome = "Mago";
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
