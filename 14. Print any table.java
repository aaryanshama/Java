import java.util.Scanner;
public class Fun_Codes {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        //reading a number whose table is to be print
        int number=sc.nextInt ();
        //loop start execution form and execute until the condition i<=10
        for(int i=1; i <= 10; i++)
        {
            //prints table of the entered number
            System.out.println(number+" * "+i+" = "+number*i);

        }
    }
}
