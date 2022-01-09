package Week12;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = kb.nextInt();

        int i = number=1;
        int result=1;
        System.out.print(number+"! ==>");
        while (i >=1){
            if (i==number){
                System.out.print(i+"x");
            } else {
                System.out.println("x"+i);
            }
              result = result*i;
              i --;
            }
            System.out.println(" = "+result);
        }
    }

