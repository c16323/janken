/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;

/**
 *
 * @author c16323
 */
public class JankenTester {
    public static void main(String[] args){
        JankenPlayer human = new JankenPlayer();
        JankenCPU cpu = new JankenCPU();
        int phand,chand;
        String[] handlist = {"グー","チョキ","パー"};
        
        phand = human.play();chand = cpu.play();
        System.out.println("player  : "+handlist[phand-1]);
        System.out.println("cpu     : "+handlist[chand-1]);
 
        switch(phand - chand){
            case  0:System.out.println("DROW");break;
            case  1:
            case -2:System.out.println("YOU LOSE");break;
            case -1:
            case  2:System.out.println("YOU WIN");break;
        };
    }
}
