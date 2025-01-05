public class stack {
    int[] stck =new int [10];
    int tos;

    stack(){//intialize top of stack
        tos=-1;
    }
    void push(int item){
        if (item==9){
            System.out.println("stack is full!");
        }else{
            stck[++tos]= item;
        }
    }
    //pop an item from the stack
    int pop(){
        if (tos<0){
            System.out.println("stack is underflow");
            return 0;
        }else{
            return stck[tos--];
        }
    }

}
class teststack{
    public static void main(String[] args) {
        stack mystack1 = new stack();
        stack mystack2 =new stack();
        //push some numbers onto the stack
        for(int i=0 ;i<10;i++) {

            mystack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            mystack2.push(i);
        }

            System.out.println("pop stack1");
            for (int j = 0; j < 10; j++) {
                mystack1.pop();
            }
            System.out.println("pop from stack 2");
            for (int j = 0; j < 10; j++) {
                mystack2.pop();
            }
        }
    }

