public class largestnumber {

    public static void main(String[] args) {
        
   int arr[]={99,45,33,28,89,987,123};
   int max=0;
   for(int i=0;i<arr.length-1;i++){
    if (arr[i]>max) {
        max=arr[i];
        
    }
   }
   System.out.println(max);
}
}
