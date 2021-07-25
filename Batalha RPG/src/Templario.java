public class Templario extends Humano {

    public Templario(){
    int atk = 15;
    int defesa = 5;
    int energia = 100;
    String nome = "Templario";
    }

    //@Override serve pra apontar que esse método está repetindo o método Pai no caso o Monstro
    @Override
    public void atacar (Humano h){
        energia = energia - atk;
    }

    @Override
    public void atacar (Monstro m){
        energia = energia - atk;
    }

    @Override
    public void defender (Humano h){
        energia = energia - atk + defesa;
    }

    @Override
    public void defender (Monstro m){
        energia = energia - atk + defesa;
    }
}
