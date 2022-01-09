package Week10;

public class ifStatement01 {
    public static void main(String[] args) {
        int time = 18;

        if (time <= 12){
            System.out.println("Good Morning");
        }else if (time <= 17){
            System.out.println("Good Afternoon");
        }else{
            System.out.println("Good Evening");
        }
    }
}