public class newnode_at_end {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
       listnode current =head;
       while (current!=null) {
        System.out.print(current.data +"-->");
        current =current.next;
       }
       System.out.println("null");

    }
    public static void main(String[] args) {
        newnode_at_end nae=new newnode_at_end();
        // nae.head=null;
        // nae.head =new listnode(1);
        // listnode second=new listnode(2);
        // listnode third=new listnode(3);
        // listnode fourth=new listnode(4);
        // nae.head.next=second;
        // second.next=third;
        // third.next =fourth;
        System.out.println("original linkedlist:");
        nae.display();

        listnode newnode=new listnode(9);
        if (nae.head==null) {
        //   newnode.next=null;
          nae.head=newnode;
          System.out.println("linked list after adding newnode at the end");
       nae.display();
            return;
        }
       listnode current =nae.head;
       while (current.next!=null) {
        current =current.next;
        
       }
       current.next=newnode;

  System.out.println("linked list after adding newnode at the end");
       nae.display();
    }
}



