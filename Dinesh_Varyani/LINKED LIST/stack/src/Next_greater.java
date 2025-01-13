import java.util.Stack;

public class Next_greater {
    public int[]GreaterElement(int[]arr){
        int[] result =new int[arr.length];

        Stack<Integer> stack =new Stack<>();
        for(int i =arr.length-1;i>=0;i--){
           if (!stack.isEmpty()){
               while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                   stack.pop();
               }
           }
           if (stack.isEmpty()){
               result[i]=-1;
           }
           else{
               result[i]=stack.peek();
           }
           stack.push(arr[i]);
        }
        return result;
    }
    public void show(int []arr){
        for (int i =0; i<=arr.length-1; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println(" ");

    }


    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6,66,6};
        Next_greater ng =new Next_greater();

        ng.show(arr);
        int[]result=ng.GreaterElement(arr);

        ng.show(result);
    }
}
