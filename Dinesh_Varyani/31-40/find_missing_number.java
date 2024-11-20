public class find_missing_number {

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print("  ");
        }
    
    }
    public static int find_the__missing_number(int arr[]){
     int n =arr.length+1;
        int sum = (n*(n+1))/2;
        for(int i=0;i<n-1;i++){
           int  num =arr[i];
            sum =sum - num ;
        }
        return sum;
    }







    public static void main(String []args){
             int array[]={1,4,3,5,6,7};
             System.out.println("the array is:");
             printarray(array);
             System.out.println();
             System.out.print("the number missing is :");
            int result= find_the__missing_number(array);
            System.out.println(result);
    }
}