/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstsem;

import java.util.ArrayList;

/**
 *
 * @author 10
 */
public class StudentRecord {
    
    private String name; 
    private String address;
    private int age;
    private double englishGrade;
    private double mathGrade;
    private double  scienceGrade;
    private double ave;
   
    private static int studentCount;
        
//    public int getStudentCount(){
//    
//}
    public String getName(){
        
        return this.name;
        
    }
    public String getAddress(){
        return this.address;
    }
    public int getAge(){
        return this.age;
    }
    public double getEnglishGrade(){
        return this.englishGrade;
    }
    public double getMathGrade(){
        return this.mathGrade;
    }
    public double getScienceGrade(){
        return this.scienceGrade;
    }
    public double getAve(){
        
        ave=(englishGrade+ mathGrade+ scienceGrade) / 3;
        return this.ave;
    }
    
    public void setName(String name){
        
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setAge(int age){
        
        this.age=age;
    }
    public void setEnglishGrade(double englishGrade){
        this.englishGrade=englishGrade;
    }
    public void setMathGrade(double mathGrade){
        this.mathGrade=mathGrade;
    }
    public void setScienceGrade(double ScienceGrade){
        this.scienceGrade=ScienceGrade;
    }
    public void setAve(double ave){
        this.ave=ave;
    }
    public void setStudentCount(int studentCount){
        this.studentCount=studentCount;
}
  public String getGrade(double ave){
       if(ave >= 75)
           return "passed!";
       
       else
           return "failed";
       
   }

}
