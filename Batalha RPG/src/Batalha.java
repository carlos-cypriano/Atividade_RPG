import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Batalha {
    
    /*Monstro [] m = new Monstro [2];
    Humano [] h = new Humano [4];*/

    List<Monstro> monstro = new ArrayList<Monstro>();       /*
                                                                Subtituindo Array pot ArrayList
                                                            */
    List<Humano> humano = new ArrayList<Humano>();


    Random r = new Random();
    boolean action, reaction;

    int first_Player, second_Player;


    public Batalha(){

        //Função de batalha sorteando e instanciando classes filhos de Humanoide e Monstro
        //Criando variáveis auxiliares para guardar o indice dessas classes filho na hora de sortear

            /*h [0] = new Guerreiro();
            h [1] = new Mago();
            h [2] = new Templario();
            h [3] = new Ladino();
            m [0] = new Engia();
            m [1] = new Cerbero();*/

            humano.add(new Mago ());
            humano.add(new Ladino());
            humano.add(new Templario());
            humano.add(new Guerreiro());
            monstro.add(new Engia());
            monstro.add(new Cerbero());


            first_Player = r.nextInt(4);
            second_Player = r.nextInt(2);
            
            start();
    }

    public void start(){

        //Função de inicio de batalha
        //Enquanto lutadores estiverem vivos, essas instruções serão executadas

        /*Nesse if caso a vida do primeiro jogador do tipo humano seja menor ou igual a zero,
         e o nome desse jogador for um dos tipos citados abaixo, eu excluo esse jogador da partida
         em tese ta funcionando*/
        if(humano.get(first_Player).energia <= 0){
            System.out.println(monstro.get(second_Player).nome + " venceu " + "energia: " + monstro.get(second_Player).energia);
            if(humano.get(first_Player).nome.equals("Mago") || humano.get(first_Player).nome.equals("Ladino") || humano.get(first_Player).nome.equals("Guerreiro") || humano.get(first_Player).nome.equals("Templario")){
                humano.remove(humano.get(first_Player));
            }
        }

        /*Nesse if caso a vida do segundo jogador do tipo monstro seja menor ou igual a zero,
         e o nome desse jogador for um dos tipos citados abaixo, eu excluo esse jogador da partida
         em tese ta funcionando*/
        else if(monstro.get(second_Player).energia <= 0){
            System.out.println(humano.get(first_Player).nome + " venceu " + "energia: " + humano.get(first_Player).energia + " XP: " + humano.get(first_Player).xp + 10 );
            if(monstro.get(second_Player).nome.equals("Engia") || monstro.get(second_Player).nome.equals("Cerbero")){
                monstro.remove(monstro.get(second_Player));
            }
        }

        while(humano.get(first_Player).energia > 0 && monstro.get(second_Player).energia > 0){
            action = r.nextBoolean();
            reaction = r.nextBoolean();


            if(action && reaction){
                System.out.println("os ataques de " +  humano.get(first_Player).nome + " e " + 
                monstro.get(second_Player).nome + " se chocaram, resultando em redução de dano");
                
                humano.get(first_Player).atk = 3;
                monstro.get(second_Player).atk = 3;
            }
            
            if(action && !reaction){
                monstro.get(second_Player).defender(humano.get(first_Player));
                humano.get(first_Player).atacar(monstro.get(second_Player));
                System.out.println(monstro.get(second_Player).nome + " defendeu ");
                System.out.println(humano.get(first_Player).nome + " atacou " + monstro.get(second_Player).nome + 
                " causou " + humano.get(first_Player).atk + " de dano");
                 
                
                //humano.get(first_Player).atk += 2;
            }
            
            else if(!action && reaction){
                humano.get(first_Player).defender(monstro.get(second_Player));
                monstro.get(second_Player).atacar(humano.get(first_Player));
                System.out.println(humano.get(first_Player).nome + " defendeu ");
                System.out.println(monstro.get(second_Player).nome + " atacou " + humano.get(first_Player).nome + 
                                   " causou " + monstro.get(second_Player).atk + " de dano");
                 //humano.get(first_Player).atk += 2;
            }
            
            if(!action && !reaction){
                System.out.println(humano.get(first_Player).nome + " e " + monstro.get(second_Player).nome + 
                                   " se defenderam " + " ninguém se feriu");
                
            }
        }

    }
}