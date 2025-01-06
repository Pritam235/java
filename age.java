import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        int age=scan.nextInt();

        if (age>18) {
            System.out.println("adult");
            
        }else{
            System.out.println("not adult");
        }
    }
}
