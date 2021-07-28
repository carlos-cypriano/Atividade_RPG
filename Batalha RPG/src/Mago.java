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
        c.energia = c.energia - this.atk;
    }

    /*@Override
    public void atacar (Monstro m){
        m.energia = m.energia - this.atk;
    }*/

    @Override
    public void defender (Competidores c){
        c.energia = c.energia - this.atk + this.defesa;
    }

   /* @Override
    public void defender (Monstro m){
        m.energia = m.energia - this.atk + this.defesa;
    }*/
}
