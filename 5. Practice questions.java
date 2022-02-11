import java.util.Scanner;

public class CWH_Ch1_PS {
    public static void main(String[] args) {
       Question 1.  Add 3 numbers .
       int a = 4;
       int b = 17;
       int c =6;
       int sum = a + b+c;
       System.out.println(sum);

       Question 2.  Calculate cgpa using marks of 3 subjects (out of 100) .
       float subject1 = 45;
       float subject2 = 95;
       float subject3 = 48;
       float cgpa = (subject1 + subject2 +subject3)/30;
       System.out.println(cgpa);

       Question 3  Ask user for name and then put a greeting format .
       System.out.println("What is your name");
       Scanner sc = new Scanner(System.in);
       String name = sc.next();
       System.out.println("Hello " + name + " have a good day!");

       Question 4.  Convert kilometers to miles .
       System.out.println("Please Enter Kilometers");
       Scanner sc = new Scanner(System.in);
       double kilometers = sc.nextDouble();
       double miles = kilometers/1.609;
       System.out.println(miles + " Miles");

       Question 5. Check whether a number is integer or not .
       System.out.println("Enter your number");
       Scanner sc = new Scanner(System.in);
       System.out.println(sc.hasNextInt());
    }
}
