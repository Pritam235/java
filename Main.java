import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name");
        String name=scan.next();
        System.out.println("enter your address");
        String address=scan.next();
        System.out.println("enter your age");
        int age=scan.nextInt();
        System.out.println("enter your contact");
        long contact=scan.nextLong();
        System.out.println("enter you gmail");
        String gmail=scan.next();
        System.out.println("enter your marks");
        double marks=scan.nextDouble()
    
        System.out.println("name " + "=" + name );
        System.out.println("address " + "=" + address);
        System.out.println("age " + "=" + age);
        System.out.println("contact " + "=" + contact);
        System.out.println("gmail" + "=" + gmail);
        System.out.println("marks" + "=" + marks);
    



        Scanner scan=new Scanner(System.in);
        System.out.println("first element");
        int a=scan.next();
        System.out.println("second element");
        int b=scan.next();
        System.out.println("third element");
        int c=scan.nextInt();
       
        System.out.println("a"+"b"+"c");
    }
}