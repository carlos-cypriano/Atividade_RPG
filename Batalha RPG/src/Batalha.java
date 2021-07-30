import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Batalha {
    
    /*Monstro [] m = new Monstro [2];
    Humano [] h = new Humano [4];*/

   // List<Monstro> monstro = new ArrayList<Monstro>();       
                                                                //Subtituindo Array pot ArrayList
                                                            
    List<Competidores> competidores = new ArrayList<Competidores>();

     Competidores f = new Competidores();
     Competidores f2 = new Competidores();
    Random r = new Random();
    boolean action, reaction;

    //int first_Player, second_Player;
    //int p1, p2, p3, p4, p5, p6;
    int luta =0;

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
          //competidores.add(new Engia());  //4
          //competidores.add(new Cerbero()); //5

        

            /*first_Player = r.nextInt(6);
            second_Player = r.nextInt(6);*/

        
           
            start();
    }

    public void start(){
      

        if (luta==0){
            System.out.println("PRIMEIRA LUTA!!!");
            luta =1;

        }
        //Função de inicio de batalha
        //Enquanto lutadores estiverem vivos, essas instruções serão executadas
       
        /*feedback vitoria do mago*/
        if(competidores.get(0).energia <= 0){
            System.out.println(competidores.get(1).nome + " venceu " + "energia: " + competidores.get(1).energia+ " XP: " + competidores.get(0).xp + 10);
            luta =2;
            System.out.println("SEGUNDA LUTA!!!");
    
        }

        /*feed back vitoria do ladino*/
        else if(competidores.get(1).energia <= 0){
            System.out.println(competidores.get(0).nome + " venceu " + "energia: " + competidores.get(0).energia + " XP: " + competidores.get(0).xp + 10 );
            luta =2;
            System.out.println("SEGUNDA LUTA!!!");
    
        }


        // primeira batalha
        while(competidores.get(0).energia > 0 && competidores.get(1).energia > 0 && luta ==1){
            action = r.nextBoolean();
            reaction = r.nextBoolean();


           
            
            if(action && !reaction){
                
                competidores.get(0).atacar(competidores.get(1));
                //System.out.println(monstro.get(second_Player).nome + " defendeu ");
                System.out.println(competidores.get(0).nome + " atacou " + competidores.get(1).nome + 
                " causou " + competidores.get(0).atk + " de dano");
                 
                
                //humano.get(first_Player).atk += 2;
            }
            
            else if(!action && reaction){
              
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

        // segunda batalha
        while(competidores.get(3).energia > 0 && competidores.get(2).energia > 0 && luta ==2){
    action = r.nextBoolean();
    reaction = r.nextBoolean();


   
    if(action && !reaction){
      
        competidores.get(3).atacar(competidores.get(2));
        //System.out.println(monstro.get(second_Player).nome + " defendeu ");
        System.out.println(competidores.get(3).nome + " atacou " + competidores.get(2).nome + 
        " causou " + competidores.get(3).atk + " de dano");
         
        
        //humano.get(first_Player).atk += 2;
    }
    
    else if(!action && reaction){
        
        competidores.get(2).atacar(competidores.get(3));
        //System.out.println(humano.get(first_Player).nome + " defendeu ");
        System.out.println(competidores.get(2).nome + " atacou " + competidores.get(3).nome + 
                           " causou " + competidores.get(2).atk + " de dano");
         //humano.get(first_Player).atk += 2;
    }
    
    if(!action && !reaction){
        System.out.println(competidores.get(3).nome + " e " + competidores.get(2).nome + 
                           " se defenderam e " + " ninguém se feriu");
        
    }
}


        /*feedback vitoria engia*/
        if(competidores.get(3).energia <= 0){
        System.out.println(competidores.get(2).nome + " venceu " + "energia: " + competidores.get(2).energia+ " XP: " + competidores.get(2).xp + 10);
        luta =3;
        System.out.println("LUTA FINAL!!!");

        }

        /*feedback vitoria guerreiro*/
        else if(competidores.get(2).energia <= 0){
        System.out.println(competidores.get(3).nome + " venceu " + "energia: " + competidores.get(3).energia + " XP: " + competidores.get(3).xp + 10 );
        luta =3;
        System.out.println("LUTA FINAL!!!");

        } 

        
        /*selecionando vencedores*/
        if (luta ==3){
            

            if(competidores.get(0).energia >0)
            f = competidores.get(0);

            else if(competidores.get(1).energia >0)
            f = competidores.get(1);

            if(competidores.get(2).energia >0)
            f2 = competidores.get(3);

            else if(competidores.get(3).energia >0)
            f2 = competidores.get(3);
        }

        // luta final
        while(f.energia > 0 && f2.energia > 0 && luta ==3){
       action = r.nextBoolean();
       reaction = r.nextBoolean();


   
    
        if(action && !reaction){
        
        f.atacar(f2);
        //System.out.println(monstro.get(second_Player).nome + " defendeu ");
        System.out.println(f.nome + " atacou " + f2.nome + 
        " causou " + f.atk + " de dano");
         
        
        //humano.get(first_Player).atk += 2;
        }
    
        else if(!action && reaction){
        
        f2.atacar(f);
        //System.out.println(humano.get(first_Player).nome + " defendeu ");
        System.out.println(f2.nome + " atacou " + f.nome + 
                           " causou " +f2.atk + " de dano");
         //humano.get(first_Player).atk += 2;
        }
    
        if(!action && !reaction){
        System.out.println(f.nome + " e " + f2.nome + 
                           " se defenderam e " + " ninguém se feriu");
        
        }
    }


    if(f2.energia <= 0 && luta==3){
        System.out.println(f.nome + " venceu o torneio!!!! " + "energia: " + f.energia+ " XP: " + f.xp + 30);
     }
    else if(f.energia <= 0 && luta ==3){
        System.out.println(f2.nome + " venceu o torneio!!!! " + "energia: " + f2.energia+ " XP: " + f2.xp + 30);
     }

    }
}
