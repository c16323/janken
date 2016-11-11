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
public class JankenTester2{
    public static void main(String[] args){
        JankenPlayer player = new JankenPlayer();
        JankenCPU cpu1 = new JankenCPU();
        JankenCPU cpu2 = new JankenCPU();
        
        String[] handlist = {"グー","チョキ","パー"};
        int phand = player.play();
        int chand1 = cpu1.play();
        int chand2 = cpu2.play();
        System.out.println("player  : "+handlist[phand]);
        System.out.println("cpu1    : "+handlist[chand1]);
        System.out.println("cpu2    : "+handlist[chand2]);
        
        switcher(phand,chand1,chand2);
    }
    private static void switcher(int p,int c1,int c2){
        if (p==c1 && p==c2)System.out.println("draw");
        if (p!=c1 && c1!=c2 && c2!=p)System.out.println("draw");
        if ((p-c1+3)%3 == 1 || (p-c2+3)%3 == 1)System.out.println("you lose");
        if ((p-c1+3)%3 == 2 || (p-c2+3)%3 == 2)System.out.println("you win");
    }
}
