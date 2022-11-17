package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	// 1. Adjust this pop-up to find out what mood the user is in.
	int happy = JOptionPane.showOptionDialog(null, "Are you happy?", "Happy test",0,
			JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes"," No" }, null);
	 System.out.println(happy);
	   if(happy == 1) {
	      int angry = JOptionPane.showOptionDialog(null,"Do you want to be happy?", "Happy test",0,
	      JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes"," No" }, null);
	      
		   if(angry == 1) {
		         JOptionPane.showMessageDialog(null,"Keep doing whatever you doing");
		          }
		   if(angry == 0) {
		         JOptionPane.showMessageDialog(null,"Change something");
		          }
	      
	          }
	   
	   
	  
	   if(happy == 0) {
	         JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing");
	          }
	   
	
}
}

