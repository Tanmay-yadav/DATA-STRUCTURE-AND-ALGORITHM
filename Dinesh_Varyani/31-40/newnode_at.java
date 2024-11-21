public class newnode_at {
    private listnode head;
    private static  class listnode{
     private int data;
     private listnode next;

    public listnode(int data){
        this.data=data;
        this.next=null;

    }
}
public void display(){
    listnode current =head;
    while (current !=null) {
        System.out.print(current.data + "-->");
        current =current.next;
    }
    System.out.println("null");
}
public static void main(String[] args) {
    newnode_at na= new newnode_at();
    na.head =new listnode(1);
    listnode second =new listnode(2);
    listnode third =new listnode(3);
    listnode fourth =new listnode(4);
    na.head.next=second;
    second.next=third;
    third.next=fourth;
    na.display();

}
    
}
