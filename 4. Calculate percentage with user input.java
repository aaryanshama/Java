import java.util.Scanner;

public class Calculate_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float total =500;
        System.out.println("Enter marks for 5 subjects: ");
        System.out.println("English: ");
        float a = sc.nextFloat();
        System.out.println("Mathematics: ");
        float b = sc.nextFloat();
        System.out.println("Physics: ");
        float c = sc.nextFloat();
        System.out.println("Chemistry: ");
        float d = sc.nextFloat();
        System.out.println("Java: ");
        float e = sc.nextFloat();

        float sum = a+b+c+d+e;
        System.out.println("Total marks: ");
        System.out.println(sum);

        float percentage = (sum/total)*100;
        System.out.println("Percentage is: ");
        System.out.print(percentage);
    }
}
