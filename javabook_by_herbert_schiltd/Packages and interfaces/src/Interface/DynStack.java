package Interface;
// implements a "growable" stack
public class DynStack {
    private int stck[];
    private int tos;

    // allocate and intitialize stack
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //push an item onto the stack
    public void push(int item) {
        // if stack is full, allocate a larger stack
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; // double size
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];



        }
                stck = temp;
                stck[++tos] = item;
            }else{
                stck[++tos] = item;
            }
        // pop an item from the stack
            }
        public int pop(){
            if(tos<0){
                System.out.println("Stack Underflow.");
                return 0;
        }
            else
                return stck[tos--];
    }
}
class Iftest2{
    public static void main(String[] args) {
        DynStack mystack1 =new DynStack(4);
        DynStack mystack2 =new DynStack(5);

        //these loops causes each loop to grow
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);

        }
        for (int i = 0; i < 22; i++) {
            mystack2.push(i);
        }
        System.out.println("Stack1:");
        for (int i = 0; i < 10; i++) {
            System.out.print(mystack1.pop()+" ");
        }
        System.out.println(" ");
        
        System.out.println("Stack2:");
        for (int i = 0; i < 22; i++) {
            System.out.print(mystack2.pop()+" ");
        }

    }

}
