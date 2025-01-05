public class small {
    public static void main(String[] args) {

        int arr[]={9,65,7,6,65,66,87,34};
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<small) {
                small=arr[i];
                
            }
        }
        System.out.println(small);

        
    }
}
