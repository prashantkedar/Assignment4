// Write a Java program to determine the price of a movie ticket based on the age of the person and the time of the movie. Implement the following


// pricing rules:
// Children (age 0-12): Rs 5.00
// Adults (age 13-59): Rs 10.00
// Seniors (age 60 and above): Rs 7.50

// Additionally, if the movie is scheduled between 3:00 PM and 6:00 PM, there is a Rs 2.00 discount on the ticket price. 
// If the movie is scheduled after 6:00 PM, there is a Rs 3.00 discount.
// The program should take the age and time of the movie in 24 hr (integer value) as input 
// and print the final ticket price.

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Age : ");
        int age = sc.nextInt();
	System.out.print("Enter the time in 24hrs eg- 1500, 1800  : ");
        int time = sc.nextInt();

	double ticket=0.0;
	double child = 5.0;
	double adult = 10.0;
	double senior = 7.50;

	double discount15 = 2.0;
	double discount18 = 3.0;

	if(age <= 12) {
	ticket = 5.0;
    }
	if(age >=12 && age <= 59) {
	ticket = 10.0;
    }
	if(age>=60) {
	ticket = 7.50;
    }

	if(time >= 1500 && time <= 1800) {
	ticket = ticket-discount15;
    }
	if (time == 1800) {
	ticket = ticket-discount18;
    }

	System.out.println("final ticket Price : " +ticket);




    }
}
