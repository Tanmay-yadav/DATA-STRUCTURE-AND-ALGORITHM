import java.util.EmptyStackException;

public class stack {
    private listnode top;
    private int length;

    private class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data=data;

        }

        }
    public stack(){
        top=null;
        length=0;
    }

    public void push(int value){
        listnode temp=new listnode(value);
        temp.next=top;
        top=temp;
        length++;

    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result=top.data;
        top =top.next;
        length--;
        return result;


}
public int peek(){
    if(isEmpty()){

        throw new EmptyStackException();
    }
    return top.data;
}
public void display(){
listnode temp = top;
while(temp!=null){

        System.out.print(temp.data + " -->");
        temp = temp.next;

}
    System.out.println(" null");
}
    public static void main(String[] args) {
stack stck =new stack();
stck.push(5);
stck.push(4);
stck.push(3);
stck.push(2);
stck.push(1);
        System.out.println("The top data of stack is :"+stck.peek());

stck.display();
stck.pop();
        System.out.println(" ");
stck.display();
        System.out.println("The top data of stack is :"+stck.peek());


    }
}
