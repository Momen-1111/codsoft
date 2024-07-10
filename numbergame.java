/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Momen
 */
import javax.swing.JOptionPane;

public class numbergame {
    public static void playgame() {
        int randomNumber = (int)(Math.random() * 10) + 1; 
      
          JOptionPane.showMessageDialog(null,"you have 3 attemps");
        int i=0;
        while (i<3) {
            try {int x=Integer.parseInt(JOptionPane.showInputDialog("Enter a number from 1 to 10:"));
              i++;
                int difference = Math.abs(x - randomNumber);
                
                if (difference == 0) {
  
                    JOptionPane.showMessageDialog(null,"Congratulations! You guessed the correct number.");
                    break; 
                } else if (difference <= 1) {
                   JOptionPane.showMessageDialog(null,"you are very close,try again");
                } else if (difference <= 2) {
                  JOptionPane.showMessageDialog(null,"you are close,try again");
                } else {
                    JOptionPane.showMessageDialog(null,"you are far away,try again");
                }
                if(i==3){
                    JOptionPane.showMessageDialog(null,"you lost all your attemps/the number is "+randomNumber);
                }

            } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null,"please enter a integer number");
                
            }
        }
         
        }
      
    
     public static void main(String[] args) {
           JOptionPane.showMessageDialog(null,"welcome to number game");
        while (true) {
            playgame();
         String playAgain =JOptionPane.showInputDialog("Do you want to play again? (yes/no)");
            
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
             
        }
        JOptionPane.showMessageDialog(null,"thank you.");
     }


}
