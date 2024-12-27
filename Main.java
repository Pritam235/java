public class Main {

    public static void main(String[] args){
        int age=807;
        if (age<=18) {
            System.out.println("NA");
        }
        else if(age>=18 && age<=99) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("default");
        }
        
    }
}