// Write a Java program that calculates the Body Mass Index (BMI) based
// on the user's weight (in kilograms) and height (in meters). The program
// should then categorize the BMI into different ranges (Underweight,
// Normal, Overweight, and Obese) using an if-else-if ladder.
// bmi = w/(Math.pow(h,2))
// input = weight in kg
// height = height mtr


import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the weight in kg : ");
        double weight = sc.nextDouble();
	System.out.print("Enter the height in mtr : ");
        double height = sc.nextDouble();

	double BMI = weight/(Math.pow(height, 2));
	System.out.printf("%.3f\n", BMI);

    if (BMI < 18.5) {
	System.out.println("you are overweighted");
    } else if (BMI >= 18.5 && BMI <= 24.9) {
	System.out.println("you are normal");
    } else if (BMI >= 25 && BMI <= 29.9) {
	System.out.println("you are overweighted");
    } else {
	System.out.println("you are obese");
    }
	
	
    }
}
