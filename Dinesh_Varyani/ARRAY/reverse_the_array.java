public class reverse_the_array {
    public static void printarray(int[]arr){
int n = arr.length;
for(int i=0;i<n;i++){
    System.out.println(arr[i]);
} System.out.println();
    }
    public static void reverse(int start,int numbers[],int end){
        while(start<end){
            int temp =numbers[start];
        numbers[start]=numbers[end];
        numbers[end]=temp;
            start++;
            end--;

        }
        
    }




    public static void main(String[]args){
        int array[]={13,24,3,54,57,68};
        printarray(array);
        reverse(0,array,array.length-1);
        printarray(array);
    }
}
