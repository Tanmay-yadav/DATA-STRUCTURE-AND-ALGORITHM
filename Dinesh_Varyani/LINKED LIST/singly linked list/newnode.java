public class newnode {
    private listnode head;

    private static class listnode{
        private int data;
        private listnode next;


        public  listnode(int data){
            this.data=data;
            this.next= null;

        }}

        public void display(){
            listnode current = head;
            while (current!=null) {
                System.out.print(current.data+ "-->");
                current =current.next;
            }
            System.out.println("null");

        }

        public static void main(String[]args){
            newnode nn=new newnode();
            nn.head=new listnode(1);
            listnode second= new listnode(2);
            listnode third= new listnode(3);
            listnode fourth= new listnode(4);
            nn.head.next=second;
            second.next=third;
            third.next=fourth;
            System.out.println("original linked list:");
            nn.display();

            

            listnode newnode =new listnode(5);
            newnode.next = nn.head;
            nn.head =newnode;
            System.out.println("linked list after adding newnode:");
            nn.display();

            listnode newnode2 =new listnode(6);
            newnode2.next = nn.head;
            nn.head =newnode2;
            System.out.println("linked list after adding second newnode:");
            nn.display();
           
        }
    }
    

