package Week12;
import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        System.out.println("Year");
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("พิมพ์ 1 แปลง พ.ศ เป็น ค.ศ");
            System.out.println("พิมพ์ 2 แปลง ค.ศ เป็น พ.ศ");
            System.out.println("พิมพ์ 0 จบการทำงาน");
            System.out.println("ใส่เลขที่ต้องการ : ");
            int number = kb.nextInt();
            if (number == 1) {
                while (true) {
                    System.out.println("พ.ศ เป็น ค.ศ");
                    System.out.println("พิมพ์ 0 เพื่อจบการทำงาน");
                    System.out.println("กรอกปี พ.ศ");
                    int ps = kb.nextInt();
                    if (ps < 0) {
                        System.out.println("พ.ศ ติดลบหรือเป็นศูนย์");
                    }
                    if (ps < 0) {
                        System.out.println("จบการทำงาน");
                        break;
                    } else {
                        System.out.println("ค.ศ " + (ps - 543));
                    }
                }
            }
            if (number == 2) {
                while (true) {
                    System.out.println("ค.ศ เป็น พ.ศ");
                    System.out.println("พิมพ์ 0 เพื่อจบการทำงาน");
                    System.out.println("กรอกปี ค.ศ");
                    int ks = kb.nextInt();
                    if (ks < 0) {
                        System.out.println("ค.ศ ติดลบหรือเป็นศูนย์");
                    }
                    if (ks < 0) {
                        System.out.println("จบการทำงาน");
                        break;
                    } else {
                        System.out.println("พ.ศ " + (ks + 543));
                    }
                    // break;
                }
            }
            if (number == 0) {
                break;
                
            } else {
                System.out.println("ใส่ใหม่อีกครั้ง");
            }
        }
        kb.close();
    }
}