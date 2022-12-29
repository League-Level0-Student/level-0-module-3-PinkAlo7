
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 15th";
		String dadsBirthday = "December 32";
		String myBirthday = "February 7th";
		String lelesBirthday = "April 11th";
		String manasBirthday = "March 21st";
        String atisBirthday = "August 1st";
        String auntiesBirthday = "May 9th";
        String manisBirthday = "May 25th";
        String popsBirthday = "October 9th";
        
		// 2. Find out which birthday the user wants and and store their response in a variable
	   String birthday = JOptionPane.showInputDialog("Which one of my family member's birthday would you like to know");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(birthday.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
		else if(birthday.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		else if(birthday.equalsIgnoreCase("yours")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else if(birthday.equalsIgnoreCase("your birthday")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else if(birthday.equalsIgnoreCase("The person who is asking me these questions")) {
				JOptionPane.showMessageDialog(null, myBirthday);
		}
		else if(birthday.equalsIgnoreCase("lele")) {
			JOptionPane.showMessageDialog(null, lelesBirthday);
		}
		else if(birthday.equalsIgnoreCase("mana")) {
			JOptionPane.showMessageDialog(null,manasBirthday);
		}
		else if(birthday.equalsIgnoreCase("ati")) {
			JOptionPane.showMessageDialog(null,atisBirthday);
		}
		else if(birthday.equalsIgnoreCase("auntie")) {
			JOptionPane.showMessageDialog(null, auntiesBirthday);
		}
		else if(birthday.equalsIgnoreCase("mani")) {
			JOptionPane.showMessageDialog(null, manisBirthday);
		}
		else if(birthday.equalsIgnoreCase("pop")) {
			JOptionPane.showMessageDialog(null,popsBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null,"Sorry, I don't remember that person's birthday!");
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
}
