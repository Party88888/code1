package Week10;

import javax.naming.spi.DirStateFactory.Result;

public class PositiveNumber {
    public static void main(String[] args) {
        // ให้รับค่าตัวเลข แล้วบอกให้ได้ว่าตัวเลขนั้นเป็นจำนวนเต็มบวกหรือไม่
        int number = -22;
        String result = "";
        // การเขียนแบบ else if อย่างเดียว

        if (number > 0) { // กรณีของตรวจสอบจำนวนเต็มบวก
            result = number+" เป็นจำนวนเจ็มบวก";
        } else if (number < 0) { // กรณีของตรวจสอบจำนวนเต็มลบ
            result = number+" เป็นจำรวนเต็มลบ";
        }else{ // กรณีของตรวจสอบจำนวนเต็มศูนย์55
            result = number+" เป็นจำรวนเต็มศูนย์";
        }
        System.out.println(result);

        // การเขียนแบบ IF อย่างเดียว
        // กรณีของตรวจสอบจำนวนเต็มบวก
        // if (number>0) {
        // System.out.println("เป็นจำนวนเจ็มบวก");
        // }
        // //กรณีของตรวจสอบจำนวนเต็มลบ
        // if (number < 0){
        // System.out.println("เป็นจำรวนเต็มลบ");
        // }
        // //กรณีของตรวจสอบจำนวนเต็มศูนย์
        // if (number < 0){
        // System.out.println("เป็นจำรวนเต็มศูนย์");
        // }
    }
}
