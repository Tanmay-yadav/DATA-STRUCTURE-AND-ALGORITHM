public class doublylinkedlist {
    private listnode head;
    private listnode tail;
    private int length;

    private class listnode{
        private int data;
        private listnode previous;
        private listnode next;


        public listnode(int data){
            this.data=data;
        }
    }
    public doublylinkedlist(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isempty(){
        return length==0;
    }
    public int length(){
        return length;
    }
    public void insertlast(int value){
        listnode newnode=new listnode(value);
        if (isempty()){
            head=newnode;
        }
        else{
            tail.next=newnode;
        }
        newnode.previous=tail;
        tail=newnode;
        length++;

    }
    public void displayforward(){
listnode temp =head;
while(temp!=null){
    System.out.print(temp.data+"-->");
    temp=temp.next;
}
        System.out.println("null");
    }
    public void displaybackward(){
        listnode temp =tail;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.previous;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doublylinkedlist dll =new doublylinkedlist();
        dll.insertlast(1);
        dll.insertlast(2);
        dll.insertlast(3);
        dll.insertlast(4);
        dll.displayforward();
        dll.displaybackward();

    }
}

