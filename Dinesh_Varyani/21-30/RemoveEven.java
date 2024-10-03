public class RemoveEven{


    public static void printarray(int[]arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static int []Removeeven(int [] arr){
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddcount++;
            }
        }
        int[]result = new int[oddcount];
        int idx =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[idx]=arr[i];
                idx++;
            }
        }
        return result;

    }
    public static void main(String []args){
           int arr[]={3,7,4,10,6,5};
           printarray(arr);
           int[]result=Removeeven(arr);
           printarray(result);
    }
}