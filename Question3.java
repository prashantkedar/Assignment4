// Write a Java program to check whether a given character is a vowel or a
//consonant.



import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);

	if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {

    	System.out.println( ch + " is a vowel");
    } else {

	System.out.println( ch + " is a consonant");
    }

	
	
    }
}
