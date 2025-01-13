package Queue;

import java.util.NoSuchElementException;

public class Queue {
    private listnode front;
    private listnode rear;
    private int length;
    private  class listnode {
        private listnode next;
        private int data;

        public listnode(int data){
            this.data=data;
            this.next=null;
        }

        }
        public int length(){
    return length;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public void enqueu(int value){
        listnode temp =new listnode(value);
        if (isEmpty()){
            front =temp;
        }
        else{
            rear.next=temp;

        }
        rear=temp;
        length++;
    }

    public int dequeu(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        int result = front.data;
        front=front.next;
        if(front==null){
            rear =null;

        }
        length--;

        return result;
    }
    public void show(){
        if (isEmpty()){
//            System.out.println("no element present ");
            return;
        }
        listnode temp =front;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Queue q =new Queue();
        q.enqueu(1);
        q.enqueu(2);
        q.enqueu(3);
        q.enqueu(4);
        q.show();

        q.dequeu();
        q.dequeu();
        q.dequeu();
        q.dequeu();
//        q.dequeu();
        q.show();

    }
}

