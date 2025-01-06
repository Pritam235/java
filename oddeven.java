import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        int x=scan.nextInt();
        if (x%2==0) {
            System.out.println("odd");
            
        }else{
            System.out.println("even");
        }
    }
}
