import java.util.Scanner;

public class SlopeOfALine {

    /**
     * Calculates slope (y2-y1)/(x2-x1) of a line as long as x2 - x1 != 0
     * @param x1 - x-coordinate of first point
     * @param y1 - y-coordinate of first point
     * @param x2 - x-coordinate of second point
     * @param y2 - y-coordinate of second point
     * @return - Different strings based on whether the line is vertical or not
     */
    public static String slope(int x1, int y1, int x2, int y2)
    {
        if (x2-x1!=0)
        {
            double slope = ((double) y2-y1)/(x2-x1);
            return "The line defined by the points "+"("+x1+","+y1+") and "+"("+x2+","+y2+") has a slope of "+slope;
        }
        else
        {
            return "The line defined by the points "+"("+x1+","+y1+") and"+"("+x2+","+y2+") is a vertical line and the slope is undefined.";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the x1 coordinate: ");
        int x1 = scan.nextInt();
        System.out.println("Please enter the corresponding y1 coordinate: ");
        int y1 = scan.nextInt();
        System.out.println("Please enter the x2 coordinate: ");
        int x2 = scan.nextInt();
        System.out.println("Please enter the corresponding y2 coordinate: ");
        int y2 = scan.nextInt();
        System.out.println(slope(x1,y1,x2,y2));
        // Call and print the result of the slope method as shown in the instructions.
    }
}
