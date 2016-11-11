/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;
import java.util.Random;
/**
 *
 * @author c16323
 */
public class JankenCPU extends Janken{
    Random rand = new Random();
    
    public JankenCPU(){
    }
    
    public int play(){
        System.out.println("");
        int hand = rand.nextInt(3);
        return hand;
    };        
}
