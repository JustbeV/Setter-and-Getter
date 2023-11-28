/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstsem;
import java.util.Scanner;

/**
 *
 * @author 10
 */
public class Main {

    
    public static void main(String[] args) {
        
       StudentRecord stA= new StudentRecord();
       StudentRecord stB= new StudentRecord();
       
        stA.setName("ana");
        stA.setAge(200);
        stA.setAddress("Moon");
        stA.setEnglishGrade(99);
        stA.setScienceGrade(99);
        stA.setMathGrade(99);
       
        System.out.println("name:"+ stA.getName());
        System.out.println("age:" +stA.getAge());
        System.out.println("address:" +stA.getAddress());
        System.out.println("Average:" + stA.getAve());
        double ave=stA.getAve();
        System.out.println("ave:"+ ave);
        System.out.println("Average:" + stA.getGrade(ave));

        
//        System.out.println("===============================================================================================");
//        stB.setName("Prince Carlo");
//        stB.setAge(19);
//        stB.setAddress("Gensan");
//        stB.setEnglishGrade(00);
//        stB.setScienceGrade(00);
//        stB.setMathGrade(99);
//        
//        System.out.println("Name:" +stB.getName());
//        System.out.println("age:" +stB.getAge());
//        System.out.println("address:" +stB.getAddress());
//        System.out.println("Average:" + stB.getAve());
//         double ave2=stB.getAve();
//        //ystem.out.println("ave:"+ ave2);
//        System.out.println("Average:" + stB.getGrade(ave2));
//        
//        Scanner sc=new Scanner(System.in);        
//         int opponentDamage;
//        
//         System.out.print("blabla damage:");
//         sc.opponentDamage;
//        
//        FightingMonster game= new FightingMonster();
//        
//        //the strength of the hero.
//        game.setStrength(50);
//        
//        //recieved damages from opponent.
//        //double recievDamages= game.getDamages();
//        game.setDamage(50);
//        
//        System.out.println("Hero's strength:"+ game.getStrength());
//        System.out.println("Hero's agility:"+ game.getAgility());
//        System.out.println("Hero's strength:"+ game.getStrength());
//        System.out.println("%$%$&@^#^@#FIGHTING(&@*^^@&#&:" +game.getDamages());
        
    }
}
