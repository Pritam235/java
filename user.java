import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        if (a==b) {
            System.out.println("Equal");
        }else{
            
            if (a<b) {
            System.out.println("lesser");
        }else{
            System.out.println("Greater");
        }
    }
    }
}
