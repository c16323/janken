/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;
import java.util.Scanner;
/**
 *
 * @author c16323
 */
class JankenPlayer extends Janken{
    Scanner stdIn = new Scanner(System.in);
    
    public JankenPlayer(){
    }
    
    @Override
    public int play(){
        int hand;
        do{    
            System.out.println("出す手を指定するべし(1=グー 2=チョキ 3=パー)");
            hand = stdIn.nextInt()-1;
        }while(hand>3 || hand<0);
        return hand;
    };
}
