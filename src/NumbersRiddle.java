
/***************************************************
 * Sample solution Project 1.1.6 Number Riddle:
 *
 * Choose any integer, double it, add six, divide it
 * in half, and subtract the number you started with.
 * The answer is always three!
 *****************************************************
 * 2 phase project:
 *
 * phase 1: write for num1 printing orig number and
 * results along the way
 *
 * phase 2: predict for other nums
 * then test with code, showing all values test in vars
 * num2, num3, etc.
 *
 * Screenshot their terminal window
 * When complete, review code with students for structure and ease of
 * modification with origNum
 */
public class NumbersRiddle{
    public static void main(String[] args) {
        //Create 6 variables to test the riddle with. 3 positive and 3 negative numbers. You will need 4 integers and 2 doubles. You will also need to test with 0 and 1.

        System.out.print("The starting number I choose = ");

        System.out.println(/*Put Variable here*/ + "."); //TESTING: Change varible name here. Using one of the 6 variables you created above.
        // line 24 converts the double to an int for one of the variables. You will need to do this for the other double variable as well.
        int OrigNum = (int) /*Variable goes here*/; //TESTING: Change variable name here.

        //Create a new variable to hold the new number after doubling the original number. It will need to be times 2.

        System.out.print("Doubled = ");
        System.out.println(/*Put New Variable*/ + ".");

        // Use the new variable you created above to add 6 to it.

        System.out.print("With 6 added = ");
        System.out.println(/*Put the new variable created above here*/ + ".");

        // Use the new variable you created above to divide it by 2.

        System.out.print("Divided by 2 = ");
        System.out.println(/*Pute the new variable created above here*/+ ".");

        //Subtract the original number using the new variable you created above.

        System.out.print("Sutract the orginal number and you get = ");
        System.out.println(/*Put the new variable created above here*/ + ".");

    }
}