import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scan.nextInt();
        System.out.println("Enter the second number: ");
        int b = scan.nextInt();
         if(a==b){
             System.out.println(a+" is equal to "+b);
         }
         if (a<b){
             System.out.println(a+" is less than "+b);
         }
         if (a>b){
             System.out.println(a+" is greater than "+b);
         }
    }
}
