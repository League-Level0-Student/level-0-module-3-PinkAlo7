package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
  public static void main(String[] args) {
	  int dragon = JOptionPane.showOptionDialog(null, "Once upon a time, there was a girl named Lele who loved dragons and she wanted to find a dragon and keep it for herself,"
	  		+ "\nso she went out and decided that she was going to find a dragon for herself. Then she walking on a path which lead to 2 paths, one going right, the "
	  		+ "\nother going left, she didn't know which path she should take. Which path do you think she should take?",
	  		"The Dragon Girl",0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Left"," Right" }, null);
		 System.out.println(dragon);
		 if(dragon == 1) {
		             JOptionPane.showMessageDialog(null,"So Lele she took the right path and she found the most horrible looking thing...not a dragon...AN ORPHANAGE!"
		    		+"she was terrified at the sight, but when she tried to go back, a creepy, cripled, old lady had already closed it! 'Please,let me out! I did not "
		    		+ "\nmean to come here!!'exlaimed Lele. 'Oh, it's alright my sweet darling, you will live a wonderful life at the orphanage, and wait until you see the owner of "
		    		+ "\nthe orphanage, oh isn't she so pretty!'said the old lady"
		    		+ "\nso Lele was taken to the orphanage and when she saw the owner of the orphanage, she gasped, the pale lady had black pig-tail braids, brown eyes, and the lady"
		    		+ "\nwas...Wednesday! Yes I mean the one and only wednesday from Adams Family. "
		    		+ "\n'And who is this you have here?' asked Wednesday. 'My lady, this is, uh what is your name?', asked the old lady. 'L-Lele' stammered Lele. 'Her name is Lele"
		    		+ "\n'This is Lele my lady.', 'I have the perfect place for her...she can mop the floors and dust the windows in the orphanage!' 'What!'exlaimed Lele. 'Take her "
		    		+ "\naway!' ordered Wednesday. "
		    		+ "\nAnd for the rest of lele's life, she mopped and dusted, and never was able to find her dragon, the end.");
}



if(dragon == 0) {
    int ldragon = JOptionPane.showOptionDialog(null,"So Lele took the left path, and she couldn't believe her eyes, it looked like a dream land! It was so beautiful and full of teal"
    		+ "\n(teal was her favorite color)clouds, and there was so much warm, well done steak! But there was something else by the steak...not a dragon...A GIANT! The Giant saw "
    		+ "\nher said 'I'm tired of eating steak for dinner, I want to eat that little girl for dinner! Come here you! Lele screamed and ran for her life."
    		+ "\nThe giant was running after her and he was getting closer. Then she saw a sword next to a gun. She didn't know which weapon she should use. You "
    		+ "should choose for her. Should Lele use a gun or a sword? "
    		
    		
    		 "The Dragon Girl", 0,
    JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Left"," Right" }, null);
}
}
}