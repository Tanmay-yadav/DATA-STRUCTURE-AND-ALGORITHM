public class Minarray {
public static void printarray(int arr[]){
    int n =arr.length ;
for(int i= 0;i<n; i++){
    System.out.println(arr[i]);

}
System.out.println();
}    

public static int minarray(int arr[]){
    int minimum=arr[0];
    for(int i=0;i<arr.length-1;i++){
        if(minimum>arr[i]){
            minimum=arr[i];
        }
    }
    return minimum;
}




public static void main(String[]args){
    int array[]={393,34,3,34,66,7,75};
    printarray(array);
   int result= minarray(array);
   System.out.print("the minimum value is :");
   System.out.println(result);
}
}
