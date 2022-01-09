package Week6;
import java.util.Scanner;
public class AreaCircle {
        public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
         final float PI = 3.141f;

         System.out.print("Enter radius : ");
        int radius = kb.nextInt();

        float result = PI*radius*radius;

        System.out.println("Result : "+ result);
        kb.close();
    }
}