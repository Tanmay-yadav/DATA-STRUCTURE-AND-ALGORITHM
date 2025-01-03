package Doublylinkedlist;

public class implementation{
public class Doublylinkedlist{ //doublylinkedlist class////////////////
    private listnode head;
    private listnode tail;
    private int length;




    private class listnode{ // listnode class/////////////////
        private int data;
        private listnode next;
        private listnode previous;

        // this is the constructor for the listnode class  ////////////

        public listnode(int data){
            this.data=data;
        }
    }

    public Doublylinkedlist(){  // this is the constructor for doublylinkedlist class
        this.head=null;
        this.tail=null;
        this.length=0;
    }


    public boolean isEmpty(){
        return length==0;
    }
public int length(){
        return length;
}
public void insertatlast(int value){
        listnode newnode =new listnode(value);
        if (isEmpty()){
            head=newnode;
        }else{
            tail.next=newnode;
        }
        newnode.previous=tail;
        tail=newnode;
        length++;
}
public void displayforward(){
        if(head==null){
            return;
        }
        listnode temp =head;
        while(temp!=null){
            System.out.println(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
}

    public static void main(String[] args) {
        Doublylinkedlist dll=new Doublylinkedlist();
        dll.insertatlast(1);
        dll.insertatlast(10);
        dll.insertatlast(15);
        dll.insertatlast(25);
        
    }
}
}