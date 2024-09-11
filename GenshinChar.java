import java.util.Random;
import java.util.Scanner;
public class GenshinChar{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        String nome[] = {"barbara", "miku", "hutao","lisa", "furina","navia"};
        String cabelo[] = {"blonde", "blue","brown","brown","blue","blonde"};
        String corte[] = {"long", "long","long","long","short","long"};
        String olhos[] = {"blue", "blue","red","green","blue","blue"};
        String altura[] = {"smol", "smol","smol","tall","smol","tall"};
        String acessorio[] = {"nothing", "nothing", "hat","hat","hat","hat"};

        int resposta = r.nextInt(5);


         //mostras as opcoes possiveis
        System.out.println("As opcoes possiveis são: ");
        System.out.println();

        for(int i = 0; i < nome.length ; i++){
            
            System.out.println("name: " + nome[i]);
            System.out.println("haircolor: " + cabelo[i]);
            System.out.println("haircut: " + corte[i]);
            System.out.println("eyes: " + olhos[i]);
            System.out.println("height: " + altura[i]);
            System.out.println("accessory: " + acessorio[i]);

        
            System.out.println();

        }

        System.out.println("//////////////////////////////////////////////////");
        
        System.out.println("WEEEEELCOME TO MY FACE-TO-FACE GAME!");
        System.out.println("in this game you need to guess some characteristics to try to guess who is the character we are talking about.");

        System.out.println("/////////////////////////////////////////////////");

        System.out.println();



        //deduza o cabelo
        System.out.println("guess the hair color:");
        System.out.println("Options: 'blonde' 'brown' 'blue'");
        String cabeloResp = scan.next().toLowerCase();

        if(cabeloResp.equals(cabelo[resposta])){
            System.out.println("Yes.");
        }
        else{
            System.out.println("no.");
        }


        System.out.println();

        
        //deduza o corte
        System.out.println("Guess the haircut:");
        System.out.println("options: 'long' 'short'");
        String corteResp = scan.next().toLowerCase();

        if(corteResp.equals(corte[resposta])){
            System.out.println("right.");
        }
        else{
            System.out.println("wrong.");
        }


        System.out.println();


        //deduza os olhos
        System.out.println("guess the eye color:");
        System.out.println("options: 'red' 'blue' 'green'");
        String olhosResp = scan.next().toLowerCase();
        
        System.out.println();

        if(olhosResp.equals(olhos[resposta])){
            System.out.println("right.");
        }
        else{
            System.out.println("wrong.");
        }

        System.out.println();


        //deduza a altura
        System.out.println("guess the height:");
        System.out.println("options:'smol' 'tall'");
        String alturaResp = scan.next().toLowerCase();
        
        System.out.println();

        if(alturaResp.equals(altura[resposta])){
            System.out.println("right.");
        }
        else{
            System.out.println("left(wrong).");
        }

        System.out.println();


        //deduza o acessorio
        System.out.println("guess the accessory:");
        System.out.println("options: 'nothing' 'hat'");
        String acessorioResp = scan.next().toLowerCase();
        
        System.out.println();

        if(acessorioResp.equals(acessorio[resposta])){
            System.out.println("right.");
        }
        else{
            System.out.println("unright, so wrong.");
        }

        System.out.println();


        System.out.println("//////////////////////////");

        
        //deduza a pessoa
        System.out.println("Who is the character?");
        System.out.println("'barbara' 'miku' 'hutao' 'lisa' 'furina' 'navia'");
        String nomeResp = scan.next();

        if(nomeResp.equals(nome[resposta])){
            System.out.println("CONGRATS!!! YOU WON!! the character was " + nome[resposta]);
        }
        else{
            System.out.println("Sorry, my friend, it was " + nome[resposta]);
        }

        
        scan.close();
    }
}