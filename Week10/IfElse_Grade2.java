package Week10;
import java.util.Scanner;

public class IfElse_Grade2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Score :");
        int score = kb.nextInt();
        String result = "";
        if ((score >= 80) && (score  <= 100)) {
            System.out.println("A");
        } else if ((score >= 70) && (score  <= 79)) {
            System.out.println("B");
        } else if ((score  >= 60) && (score  <= 69)) {
            System.out.println("C");
        } else if ((score  >= 50) && (score  <= 59)) {
            System.out.println("D");
        } else if ((score >= 0) && (score  <= 49)) {
            System.out.println("E");
        } else {
            System.out.println("ไม่มีค่า");
        }
    }    
}    