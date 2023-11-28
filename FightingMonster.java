/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstsem;

/**
 *
 * @author 10
 */
public class FightingMonster {
    
    private double strength;
    private double agility;
    private double damages;
    private int speed;
    private static int flying;
    
//    public static int getFlying(int flying){
//        
//    }
    public double getStrength(){
       return this.strength;
    }
     public double getAgility(){
       return this.agility;
    }
//      public double getDamages(){
//       return this.damages;
//    }
       public double getSpeed(){
       return this.speed;
    }
    
    
//    public double getDamages(){
//        damages=(strength +agility+speed)/3;
//        return this.damages;
//    }
    
    public void setStrength(double strength){
        strength=this.strength;
    }
    public void setAgility(double agility){
        agility=this.agility;
    }

    public void setSpeed(int speed){
        speed=this.speed;
        
    }
    public void setDamage(double damages){
        damages=this.damages;
    }
}
