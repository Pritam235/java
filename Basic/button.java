package Basic;

import java.util.Scanner;

public class button {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int button=scan.nextInt();

        if (button==1) {
            System.out.println("namasthe");
        }else if (button==2) {
            System.out.println("Hello");
        }else if (button==3) {
            System.out.println("bonjour");
        }else{
            System.out.println("invalid");
        }
    
    }
}
