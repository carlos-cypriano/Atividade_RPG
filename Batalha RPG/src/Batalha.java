import java.util.Random;


public class Batalha {
    
    Monstro [] m = new Monstro [2];
    Humano [] h = new Humano [4];

    Random r = new Random();
    boolean action, reaction;

    int first_Player, second_Player;


    public Batalha(){

        //Função de batalha sorteando e instanciando classes filhos de Humanoide e Monstro
        //Criando variáveis auxiliares para guardar o indice dessas classes filho na hora de sortear

            h [0] = new Guerreiro();
            h [1] = new Mago();
            h [2] = new Templario();
            h [3] = new Ladino();

            m [0] = new Engia();
            m [1] = new Cerbero();

            first_Player = r.nextInt(4);
            second_Player = r.nextInt(2);

            start();
    }

    public void start(){

        //Função de inicio de batalha
        //Enquanto lutadores estiverem vivos, essas instruções serão executadas

        if(h [first_Player].energia <= 0){
            System.out.println(m[second_Player].nome + " venceu " + "energia: " + m[second_Player].energia);
        }
        else if(m [second_Player].energia <= 0){
            System.out.println(h[first_Player].nome + " venceu " + "energia: " + h[first_Player].energia + " XP: " + h[first_Player].xp + 10 );
        }

        while(h[first_Player].energia > 0 && m[second_Player].energia > 0){
            action = r.nextBoolean();
            reaction = r.nextBoolean();


            if(action && reaction){
                System.out.println("os ataques de " +  h[first_Player].nome + " e " + 
                m[second_Player].nome + " se chocaram, resultando em redução de dano");
                
                h[first_Player].atk = 3;
                m[second_Player].atk = 3;
            }
            
            if(action && !reaction){
                h[first_Player].atacar(m[second_Player]);
                System.out.println(h[first_Player].nome + " atacou " + m[second_Player].nome + 
                " causou " + h[first_Player].atk + " de dano");
                 
                
                h[first_Player].atk += 2;
            }
            
            else if(!action && reaction){
                m[second_Player].atacar(h[first_Player]);
                System.out.println(m[second_Player].nome + " atacou " + h[first_Player].nome + 
                                   " causou " + m[second_Player].atk + " de dano");
                 h[first_Player].atk += 2;
            }
            
            if(!action && !reaction){
                System.out.println(h[first_Player].nome + " e " + m[second_Player].nome + 
                                   " não agiram " + " ninguém se feriu");
                
            }
        }

    }
}