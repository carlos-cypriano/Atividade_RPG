public class Competidores {
    
    int energia;
    String nome;
    int atk;
    int defesa;
    int xp;

    public Competidores(){

    }

    public void atacar(Competidores c){
        c.energia = c.energia - c.atk;
        }
    
        /*public void atacar(Monstro m){
        m.energia = m.energia - m.atk;
        }*/
    
        public void defender(Competidores c){
        c.energia = c.energia - c.atk + c.defesa;
        }
    
       /* public void defender(Monstro m){
        m.energia = m.energia - m.atk + m.defesa;
        }*/

}