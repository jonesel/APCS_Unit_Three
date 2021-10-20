import java.util.Scanner;
public class AddToPositiveOrNegativeSum {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int neg = 0;
        int pos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if (num > 0) {
                pos += num;
            }
            if (num < 0) {
                neg += num;
            }
        }
        System.out.println("The sum of the negative numbers is " + neg);
        System.out.println("The sum of the positive number is " + pos);
    }
}

