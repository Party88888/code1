package Week6;
import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนน้ำหนัก (kg)");
        double weight = kb.nextDouble();
        System.out.print("ป้อนส่วนสูง (cm)");
        double height = kb.nextDouble();
        height/=100; // height=height/100;

        double bmi=weight/(height*height);

        System.out.println("น้ำหนัก = "+weight);
        System.out.println("ส่วนสูง = "+height);
        System.out.println("ค่าดัชนีมวลกาย (BMI) = "+bmi);
    
    }
}
