import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The class AverageTenNumbers
 */

public class AverageTenNumbers
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner keyboardWords = new Scanner(System.in);    //Scanner object delimited by spaces(default)
        //keyboardWords.useDelimiter(" *");
        //keyboardWords.useDelimiter("\\D");
        //keyboardWords.useDelimiter(",");
        //keyboardWords.useDelimiter("\\n");

        Scanner keyboardNumbers = new Scanner(System.in);
        //keyboardNumbers.useDelimiter(" *");
        //keyboardNumbers.useDelimiter("\\D");
        //keyboardNumbers.useDelimiter(",");
        //keyboardNumbers.useDelimiter("\\n");
        keyboardNumbers.useDelimiter("\\D *");

        Scanner readFile = new Scanner(new File("InputFile"));

        String nameFirst;
        String nameLast;

        int sum;
        int average;

        int n1;
        int n2;
        int n3;
        int n4;
        int n5;    //Same could be accomplished on single line by int n1, n2, n3, ... , n10
        int n6;    //but the book says that the individual declarations are better.
        int n7;
        int n8;
        int n9;
        int n10;


        System.out.println("Hello, my name is 0010001, " +
                "What is yours? (first, space, last please)");

        nameFirst = keyboardWords.next();
        nameLast = keyboardWords.next();


        System.out.println("Hello " + nameFirst + " " + nameLast + ", It's nice to meet you!");
        System.out.println();

        System.out.println("Math is hard " + nameFirst + ",");
        System.out.println("Isn't it?");
        System.out.println("I'll help you with some of it.");
        System.out.println();
        System.out.println("Let's figure out how many hours you spend on average " +
                "studying for CSC200 every ten days.");
        System.out.println("Enter ten whole numbers, separated by commas, (no spaces)" +
                " \nwhich represent the number of hours spent per day over " +
                "the last ten days studying Java. \n" +
                "The hours can be spent reading, writing programs, or watching " +
                "professor Kanchanawanchai's videos on Youtube.");

        n1 = keyboardNumbers.nextInt();
        n2 = keyboardNumbers.nextInt();
        n3 = keyboardNumbers.nextInt();
        n4 = keyboardNumbers.nextInt();
        n5 = keyboardNumbers.nextInt();
        n6 = keyboardNumbers.nextInt();
        n7 = keyboardNumbers.nextInt();
        n8 = keyboardNumbers.nextInt();
        n9 = keyboardNumbers.nextInt();
        n10 = keyboardNumbers.nextInt();

        sum = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10);
        average = (sum / 10);

        System.out.println();
        System.out.println("Got it.");
        System.out.println("You entered: \"" + n1 + "\" , \"" + n2 + "\" , \"" + n3 + "\" , \""
                + n4 + "\" , \"" + n5 + "\" , \"" + n6 + "\" , \"" + n7 + "\" , \"" + n8 + "\" , \""
                + n9 + "\" , \"" + n10 + "\"");
        System.out.println();
        //System.out.println("The average amount of time you have spent futilely attempting" +
        //        " to force-feed Java into your feeble human memory banks is:\n" + average +
        //        " hours.  \nObviously it's not enough, and it will never be enough" +
        //        " \nso just quit now and go cry yourself to sleep.");




        keyboardWords.close();
        keyboardNumbers.close();
    }

}
