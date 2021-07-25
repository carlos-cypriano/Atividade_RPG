public class Cerbero extends Monstro{
    
    private int atk = 15;
    private int defesa = 5;
    private int energia = 100;
    private String nome = "Cerbero";


    //Criei esse Construtor pra validar os atributos acima
    public Cerbero( int atk, int defesa, int energia, String nome){
        this.atk = atk;
        this.defesa = defesa;
        this.energia = energia; 
        this.nome = nome;
    }

    //@Override serve pra apontar que esse método está repetindo o método Pai no caso o Monstro
    @Override
    public void atacar (Humano h){
        this.energia = this.energia - this.atk;
    }

    @Override
    public void atacar (Monstro m){
        this.energia = this.energia - this.atk;
    }

    @Override
    public void defender (Humano h){
        this.energia = this.energia - this.atk + this.defesa;
    }

    @Override
    public void defender (Monstro m){
        this.energia = this.energia - this.atk + this.defesa;
    }
}
