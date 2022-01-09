package Week12;

public class NestedLoop01 {
    public static void main(String[] args) {
        //int number=2;
        for (int i = 2; i <=3; i++) {  //loopนอก แม่สูตรคูณ
            for (int j = 1; j <= 12; j++) {      // loopใน จำนวนครั้งที่จะคูณในแต่ละแม่
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }
    }
}
