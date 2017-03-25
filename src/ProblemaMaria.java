import java.util.Scanner;

public class ProblemaMaria
{
    public static void main(String[] args)
    {
        Scanner MyConsole = new Scanner(System.in);

        int number;
        int currentMax =Integer.MIN_VALUE;

        do
        {
            System.out.print("Enter a number: ");
            number = MyConsole.nextInt();

            if (number!=0&&number > currentMax)
                currentMax = number;



        }
        while((number != 0));
        if (currentMax!=Integer.MIN_VALUE)
            System.out.println("currentMax is: " + currentMax);
        else
            System.out.println(" error");

    }
}