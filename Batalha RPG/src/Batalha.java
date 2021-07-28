import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Batalha {
    
    /*Monstro [] m = new Monstro [2];
    Humano [] h = new Humano [4];*/

   // List<Monstro> monstro = new ArrayList<Monstro>();       
                                                                //Subtituindo Array pot ArrayList
                                                            
    List<Competidores> competidores = new ArrayList<Competidores>();


    Random r = new Random();
    boolean action, reaction;

    //int first_Player, second_Player;
    //int p1, p2, p3, p4, p5, p6;


    public Batalha(){

        //Função de batalha sorteando e instanciando classes filhos de Humanoide e Monstro
        //Criando variáveis auxiliares para guardar o indice dessas classes filho na hora de sortear

            /*h [0] = new Guerreiro();
            h [1] = new Mago();
            h [2] = new Templario();
            h [3] = new Ladino();
            m [0] = new Engia();
            m [1] = new Cerbero();*/

            competidores.add(new Mago ());  //0
            competidores.add(new Ladino()); //1
            competidores.add(new Templario());  //2
            competidores.add(new Guerreiro());  //3
            competidores.add(new Engia());  //4
            competidores.add(new Cerbero()); //5


            /*first_Player = r.nextInt(6);
            second_Player = r.nextInt(6);*/

            
            
            
            start();
    }

    public void start(){

        //Função de inicio de batalha
        //Enquanto lutadores estiverem vivos, essas instruções serão executadas

        /*Nesse if caso a vida do primeiro jogador do tipo humano seja menor ou igual a zero,
         e o nome desse jogador for um dos tipos citados abaixo, eu excluo esse jogador da partida
         em tese ta funcionando*/
        if(competidores.get(0).energia <= 0){
            competidores.remove(competidores.get(0));
            System.out.println(competidores.get(1).nome + " venceu " + "energia: " + competidores.get(1).energia);
            
        }

        /*Nesse if caso a vida do segundo jogador do tipo monstro seja menor ou igual a zero,
         e o nome desse jogador for um dos tipos citados abaixo, eu excluo esse jogador da partida
         em tese ta funcionando*/
        else if(competidores.get(1).energia <= 0){
            competidores.remove(competidores.get(1));
            System.out.println(competidores.get(0).nome + " venceu " + "energia: " + competidores.get(0).energia + " XP: " + competidores.get(0).xp + 10 );
            
        }

        while(competidores.get(0).energia > 0 && competidores.get(1).energia > 0){
            action = r.nextBoolean();
            reaction = r.nextBoolean();


            if(action && reaction){
                
            }
            
            if(action && !reaction){
                competidores.get(1).defender(competidores.get(0));
                competidores.get(0).atacar(competidores.get(1));
                //System.out.println(monstro.get(second_Player).nome + " defendeu ");
                System.out.println(competidores.get(0).nome + " atacou " + competidores.get(1).nome + 
                " causou " + competidores.get(0).atk + " de dano");
                 
                
                //humano.get(first_Player).atk += 2;
            }
            
            else if(!action && reaction){
                competidores.get(0).defender(competidores.get(1));
                competidores.get(1).atacar(competidores.get(0));
                //System.out.println(humano.get(first_Player).nome + " defendeu ");
                System.out.println(competidores.get(1).nome + " atacou " + competidores.get(0).nome + 
                                   " causou " + competidores.get(1).atk + " de dano");
                 //humano.get(first_Player).atk += 2;
            }
            
            if(!action && !reaction){
                System.out.println(competidores.get(0).nome + " e " + competidores.get(1).nome + 
                                   " se defenderam e " + " ninguém se feriu");
                
            }
        }

    }
}
