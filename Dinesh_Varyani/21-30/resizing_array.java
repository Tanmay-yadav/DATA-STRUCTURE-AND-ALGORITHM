public class resizing_array {
  public static void printarray(int arr[]){
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]);
        System.out.print("  ");
    }

  } 
 public static int[] resizearray(int arr[],int capacity){
  int []array =new int [capacity];
  for(int i =0;i<arr.length;i++){
    array[i]=arr[i];
  }
  arr =array;
  return arr;
 }





    public static void main(String[]args){
    int array []={1,2,3,4,5,6,7};
    System.out.println("before resizing:");
    printarray(array);
    System.out.println("  ");
    System.out.print("leangth of the array:");
    System.out.println(array.length);
    // array = resizearray(array,10);
    System.out.println("after resizing:");
    printarray(resizearray(array,10));
    System.out.println();
    System.out.print("length of new array: ");

    System.out.println(resizearray(array,10).length);
    }
    
}
