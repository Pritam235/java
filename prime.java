import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        int num= scan.nextInt();
        for(int i=2;i>num;i++){

        if (num%2==0) {
            System.out.println(num + "its prime number");
            
        }else{
            System.out.println(num + "its not prime number");
        }
    }
        
            
        }
    }
    

