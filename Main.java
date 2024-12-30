public class Main {

    public static void main(String[] args){
        try{
            int balance = 5000;
            int withdrawal = 6000;

            if(withdrawal>balance){
                throw new Exception("insufficient fund");
            }
            System.out.println("succes");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
   
}
}