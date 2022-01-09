package Week12;

import java.util.Scanner;

public class Factoraial3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Number");
        
        while (true ){
            
            int number = kb.nextInt();
            int i = number = 1;
            int result = 1;
            if (number == 0) {
                break;
            
        }
            System.out.print(number + "! ==>");
            while (i >= 1) {
                if (i == number) {
                    System.out.print(i);
                } else {
                    System.out.println("x" + i);
                }
                result = result * i;
                i--;
            }
            System.out.println(" = " + result);
    }
    }
}