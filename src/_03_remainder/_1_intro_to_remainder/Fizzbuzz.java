package _03_remainder._1_intro_to_remainder;

public class Fizzbuzz {
	public static void main(String[] args) {
	for(int i=0; i<21; i++) {
	 if(i%5==0&&i%3==0) {
			System.out.println("Fizzbuzz");
		}
	 else if(i%3==0) {
		System.out.println("Fizz");
	}
	else if(i%5==0) {
		System.out.println("Buzz");
	}

	else {
		System.out.println(i);
	}
		}
	}
}
	


