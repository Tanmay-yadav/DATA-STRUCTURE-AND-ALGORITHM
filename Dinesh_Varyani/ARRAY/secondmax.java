public class secondmax {
    public static void printarray(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static int Secondmax(int arr[]){
        int max=Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                secondmax=max;
                max=arr[i];
            }else if(arr[i]>secondmax && arr[i]!=max ){
                secondmax =arr[i];

            }
        }
        return secondmax;
    }
    public static void main(String[]args){
        int array[]={45,2,8,6,88,79,55};
        printarray(array);
        System.out.print("the second maximum number is :");
       int result= Secondmax(array);
       System.out.println(result);

    }







}
