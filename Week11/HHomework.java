package Week11;
import java.util.Scanner;

public class HHomework {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = kb.nextInt();

        int result = 1;
        int i = 1;
        while (i<=number) {
           System.out.print(i+"X");
           result = result*i;
            i++;

        }
        System.out.println("=" + result);
    }
}