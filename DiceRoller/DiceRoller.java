import javax.swing.JOptionPane;
import java.util.Random;


public class DiceRoller {
	
	Random random;
  int number;
  int guess;
  

	
		
		DiceRoller(){
    random = new Random();
    roll();
    }
 
    void roll() {
    	
    	do {
    	int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a Number"));
    	number = random.nextInt(6)+1;
    	
    	if ( number == guess ) {
    	JOptionPane.showMessageDialog(null, "You guessed Correct ");
    } else {
    	JOptionPane.showMessageDialog(null, "You guessed Wrong");
    }
    	  
    } while ( number != guess );
    
    }
		

	
}
	
	
