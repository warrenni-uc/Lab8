import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GuessingGame implements ActionListener {

 JTextField field;
 JButton buttonGuess, buttonPlay;
 JLabel labelGuess, labelFeedback, labelLastGuess;
 Random r = new Random();
 int randomInt = 0;
 

 GuessingGame() {
 randomInt = r.nextInt(100) + 1;
 JFrame frame = new JFrame("Guessing Game");
 frame.setLayout(new FlowLayout());
 frame.setSize(240,120);

 field = new JTextField(10);
 field.setActionCommand("myTF");

 buttonGuess = new JButton("Guess");
 buttonPlay = new JButton("Play Again");
 
 field.addActionListener(this);
 buttonGuess.addActionListener(this);
 buttonPlay.addActionListener(this);

 labelGuess = new JLabel("Enter your guess: ");
 labelFeedback = new JLabel("");
 labelLastGuess = new JLabel("");

 //add guess label
 frame.add(labelGuess);
 //add userguess field
 frame.add(field);
 //add guess buttonGuess
 frame.add(buttonGuess);
 //add high and low statement labels  
 frame.add(labelFeedback);
 //add last guess label
 frame.add(labelLastGuess);
 frame.add(buttonPlay);
 //make frame visible
 frame.setVisible(true);
 }

 public void actionPerformed(ActionEvent ae) {

 if(ae.getActionCommand().equals("Guess")) {
   int guess = Integer.parseInt(field.getText());
   if (guess < randomInt) {
   labelFeedback.setText("Too low!"); }
   else if (guess > randomInt) {
   labelFeedback.setText("Too high!"); }
   else if (guess == randomInt) {
   labelFeedback.setText("You got it!"); }
   
   labelLastGuess.setText("Last guess was " + guess);
   }
   
  else if (ae.getActionCommand().equals("Play Again")) {
   int randomInt = r.nextInt(100) + 1;
   labelFeedback.setText("");
   labelGuess.setText("");
   field.setText("");
   labelLastGuess.setText("");
  }

  else {
  labelFeedback.setText("You pressed Enter. Please Press the Guess Button.");
  }




   }
   }
 
