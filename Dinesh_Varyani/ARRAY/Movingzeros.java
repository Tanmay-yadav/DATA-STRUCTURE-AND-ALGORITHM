public class Movingzeros {
    
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            
        System.out.print ("  ");
        }
        System.out.println( "  ");
    }
    public static void movezero(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else if(arr[j]!=0){
                j++;
            }
        }
    }





public static void main(String []args){
    int array[] ={1,2,3,0,5,0,9,0,8};
    printarray(array);
     movezero(array);
    System.out.println("The new array is :");
    printarray(array);
}

}
