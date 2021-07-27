public class Humano {
    
    int energia;
    String nome;
    int atk;
    int defesa;
    int xp;

    public Humano(){

    }

    public void atacar(Humano h){
        h.energia = h.energia - h.atk;
        }
    
        public void atacar(Monstro m){
        m.energia = m.energia - m.atk;
        }
    
        public void defender(Humano h){
        h.energia = h.energia - h.atk + h.defesa;
        }
    
        public void defender(Monstro m){
        m.energia = m.energia - m.atk + m.defesa;
        }

}