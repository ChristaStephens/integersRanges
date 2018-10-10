package Lab3ConditionalStatements;

import java.util.Scanner;

public class integersRanges {

	public static void main(String[] args) {

		// Goal is to have the user enter an integer between 1 and 100
		// Be sure to use conditional statement(s) (if, else, if else)
		// If the user enters an odd int, println "Odd"(probably using mod %)
		// If the user enter an even int, println "Even" (probably using mod %)
		// Additionally, if the "Even" num is between 2 and 25 println "Even and less
		// than 25"
		// Next, if the "Even" num is between 26 and 60 println "Even"
		// Then, if the "Even" num is greater than 60 println "Even"
		// Lastly, if the num is "Odd" and greater than 60, println the num entered
		// And println "Odd and over 60."
		// end++ to end the loop

		int num;
		int even;
		int odd;
		String Name;

		System.out.println("Hey friend! Please enter your name.");
		Scanner scnr = new Scanner(System.in);
		Name = scnr.nextLine();
		System.out.println("Thank you " + Name + "!");
		System.out.println("Now, let's get started with finding even numbers and odd numbers " + Name + ".");
		System.out.println(" ");

		System.out.println("Please enter a number between 1 and 100.");
		num = scnr.nextInt();
		// System.out.println("Great number " + Name + "!" + " Now let's see if "+ num +
		// " is even or odd.");
		// System.out.println("Your number is" + num);

		if ((num > 100) || (num < 1)) {
			// in order to use the pipes and double ands, we need to have the conditionals
			// in their own (). Additionally, it makes it easier to read.
			// Remember that || means "or" and && means "and" saying that it is doing
			// One condition "or" the other/&& the other (respectively).

			while ((num > 100) || (num < 1)) {
				// Ok gal, this while loop tripped you up but you got it. While ALWAYS goes
				// BEFORE the block of code that you want to run in the loop. Has similar
				// conditional set up (bool) as if, else, etc. But it just keeps going until
				// It reaches its condition(s). Is num greater than 1 or less than 100?
				// Yes, break out of loop and go to next section. If out of parameter it println
				// invalid.
			}
				System.out.println("Invalid entry, try again.");
				num = scnr.nextInt();

				// num = num / 2 % 2;
			}
			if (num % 2 == 1 && num > 60) {
				System.out.println(Name + ", you have entered " + num + "the number is odd and greater than 60.");
			}
			else if (num % 2 == 0 && num < 25) {
				System.out.println(Name + "you have entered" + num + ", the number is even and less than 25.");
			} else if (num % 2 == 0 && num < 60) {
				System.out.println(Name + "you have entered" + num + ", the number is even.");
			} else if (num % 2 == 0 && num > 60) {
				System.out.println(Name + "you have entered" + num + ", the number is even and greater than 60.");
			} else if (num % 2 == 0 && num > 60) {
				System.out.println(Name + "you have entered" + num + ", the number is odd and greater than 60.");
			} else
				System.out.println(Name + ", you have entered" + num + "the number is odd.");
		
		// }

		{
			// System.out.println(checking to see if we made it out of the loop);
			// "this could be to end the program officially? It checks to show
			// that it ends?";
			// or closing scnr
		}

	}
}

//use modulus to take the number. if the number divides by modulus two is greater than 0 than its odd
//modulus 
//if the integer is odd then enter odd