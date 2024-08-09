/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Momen
 */
import java.util.Scanner;
public class studentgrade {
      public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      try{
      System.out.println("how many subject you want to enter?");
      int n=in.nextInt();
      double totalmarks=0;
      for(int i=0;i<n;i++){
          System.out.println("enter subject"+(i+1)+"mark out of 100");
       double x=in.nextDouble();
       totalmarks+=x;
      }
      String grade;
      double p=(totalmarks/(n*100))*100;
      if(p>=90){
           grade="A";
      }
      else if(90>p&&p>=85){
           grade="A-"; 
      }
      else if(85>p&&p>=80){
           grade="B+"; 
      }
      else if(80>p&&p>=75){
           grade="B"; 
      }
       else if(75>p&&p>70){
          grade="B-"; 
      } 
      else if(70>p&&p>=65){
           grade="C+"; 
      }  
      else if(65>p&&p>=60){
          grade="C"; 
      }    
      else if(60>p&&p>=56){
          grade="C-"; 
      }    
       else if(56>p&&p>=53){
         grade="D+"; 
      }
       else if(53>p&&p>=50){
          grade="D"; 
      }  
       else{
           grade="F"; 
           
       }
      System.out.println("total marks= "+totalmarks);
      System.out.println("grade= "+grade);
      System.out.println("average percentage,= "+p+"%");  
    }
      catch(Exception e){
          System.out.print("erorr");
      }
    }
    
}
