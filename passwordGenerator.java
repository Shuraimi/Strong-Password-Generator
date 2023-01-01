//Password Generator using digits , uppercase , lowercase and special characters
import java.util.*;
public class passwordGenerator {
	static int digitGenerate() {
		int digit = (int)(Math.random() * 10);
		return digit;
	}
	static char uppercaseGenerator() {
		int min = 65;
		int max = 91;
		int r = (int)(Math.random() * (max - min)) + min;
		char up = (char)r;
		// System.out.println(up);
		return up;
	}
	static char lowercaseGenerator() {
		int min = 97;
		int max = 123;
		int r = (int)(Math.random() * (max - min)) + min;
		char low = (char)r;
		// System.out.println(up);
		return low;
	}
	static char specialCharacterGenerator() {
		char ch[] = {'~', '`', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '+', '=', '{', '[', '}', ']', '|', ':', ';', '"', '<', ',', '>', '.', '?', '/', '}', ';'};
		int max = ch.length;
		int r = (int)(Math.random() * max);
		return ch[r];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter your");
		String password = "";
		int length = 0;
		do {
			System.out.println("Enter length of your password \nYour length should be between 6 and 32");
			length = sc.nextInt();
		} while (length < 6 || length > 32);


		for (int i = 1; i <= length; i++) {
			int min = 1;
			int max = 5;
			int choice = (int)(Math.random() * (max - min)) + min;
			//System.out.println(choice);
			switch (choice) {
			case 1:
				//System.out.println("Digit");
				password = password + digitGenerate();
				break;
			case 2:
				//System.out.println("Uppercase");
				password = password + uppercaseGenerator();
				break;
			case 3:
				//System.out.println("Lowercase");
				password = password + lowercaseGenerator();
				break;
			case 4:
				//System.out.println("Symbols");
				password = password + specialCharacterGenerator();
				break;
			}
		}
		System.out.println("Dear user your password is " + password);
		System.out.println("Copy the password and paste it where you want \nHave Funn!!");
		System.out.println("\t\t Thank You for using Password Generator");
	}
}
