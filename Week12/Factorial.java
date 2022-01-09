package Week12;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = kb.nextInt();

        int i =1;
        int result=1;
        while (i <=number){
            System.out.println(i+"x");
            i++;       
        }
        System.out.println(" = "+result);
    }
    
}
