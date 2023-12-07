// Write a Java program that takes a letter grade (A, B, C, D, or F) as input
//and converts it to the corresponding Grade Point Average (GPA) according to the following scale:
//A: 4.0
//B: 3.0
//C: 2.0
//D: 1.0
//F: 0.0
//The program should print the GPA based on the input letter grade. If the
//input is not a valid letter grade, the program should print "Invalid Grade."

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the grade : ");
        String grade = sc.next();

	
	switch (grade) {
	
	case("A"):
	System.out.println(" GPA = 4.0");
	break;

	case("B"):
	System.out.println(" GPA = 3.0");
	break;

	case("C"):
	System.out.println(" GPA = 2.0");
	break;

	case("D"):
	System.out.println(" GPA = 1.0");
	break;

	case("F"):
	System.out.println(" GPA = 0.0");
	break;
	default:
	
	System.out.println("Invalid Grade");

    } 

	

}
}
