package Week11;

public class WhileTrue {
    public static void main(String[] args) {
       
        int count = 1;   // ค่าเริ่มต้น
        while (true) {   // เงื่อนไข
            System.out.println("รอบที่ "+count+" Hello");   // ค่าที่ต้องการแสดงผล
            count++;    // update รอบ
            if (count==6) {
                break;
            }
        }
    }
}