// Write a Java program for a bookstore that calculates the total cost of a
// purchase based on the number of books bought and whether the customer
// is a member. The bookstore offers the following discounts:

// If the customer is a member, they get a 10% discount on the total cost.
// If the customer buys more than 5 books, they get an additional 5%
// discount on the already discounted price.
// If the customer buys 10 or more books, they get a flat Rs100 off in
// addition to the other discounts.
// The program should take as input the number of books and whether the
// customer is a member. It should then calculate and print the total cost
// after applying the appropriate discounts.


import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the price of one book : ");
        double bookprice = sc.nextDouble();
	System.out.print("Enter the No of books: ");
        double NoBooks = sc.nextDouble();
	System.out.print("custmer is member (y/n): ");
        char member = sc.next().charAt(0);

	double price = NoBooks*bookprice;
	double discountprice = 0.0;

    if (NoBooks > 5 && NoBooks <10) {
	
	if(member=='y') {

	   discountprice = price - ((0.1*price) + (0.05*price));
	   System.out.println("final price: " +discountprice);
        } else {

	  discountprice = price;
	  System.out.println("final price: " +discountprice);
          }

        }

	if(NoBooks >=10) {

   	  if(member=='y') {

	 discountprice = price - ((0.1*price)+100);
	 System.out.println("final price: " +discountprice);  
	  } else {

	   discountprice= price-100;
	   System.out.println("final price: " +discountprice);
	  }
        }

    if (NoBooks<=5) {
	System.out.println("final price: " +price);
    }




}

}
