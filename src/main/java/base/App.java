/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package base;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Exercise 21 - Numbers to Names
Many programs display information to the end user in one form but use a different form inside the program. For example,
you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color or an
internal value because you may need to represent the textual description in another language for Spanish-speaking visitors.

Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display
the corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display
an appropriate error message.

Example Output

Please enter the number of the month: 3
The name of the month is March.

Constraints

Use a switch or case statement for this program.
Use a single output statement for this program.

Challenges

Use a map or dictionary to remove the switch statement from the program.
Support multiple languages. Prompt for the language at the beginning of the program.
*/
public class App 
{
    static String[] months = new String[] {"January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};

    public static void main( String[] args )
    {
        Scanner number1 = new Scanner(System.in);

        //input number of the month
        System.out.print("What is the number of the month? ");
        int monthNumber =  number1.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("The name of the month is " + months[0] + ".");
                break;
            case 2:
                System.out.println("The name of the month is " + months[1] + ".");
                break;
            case 3:
                System.out.println("The name of the month is " + months[2] + ".");
                break;
            case 4:
                System.out.println("The name of the month is " + months[3] + ".");
                break;
            case 5:
                System.out.println("The name of the month is " + months[4] + ".");
                break;
            case 6:
                System.out.println("The name of the month is " + months[5] + ".");
                break;
            case 7:
                System.out.println("The name of the month is " + months[6] + ".");
                break;
            case 8:
                System.out.println("The name of the month is " + months[7] + ".");
                break;
            case 9:
                System.out.println("The name of the month is " + months[8] + ".");
                break;
            case 10:
                System.out.println("The name of the month is " + months[9] + ".");
                break;
            case 11:
                System.out.println("The name of the month is " + months[10] + ".");
                break;
            case 12:
                System.out.println("The name of the month is " + months[11] + ".");
                break;
            default:
                System.out.println("invalid inputs");
                break;
        }

    }

}
