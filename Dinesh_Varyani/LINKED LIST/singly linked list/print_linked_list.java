public class print_linked_list {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;
       
    
    public listnode(int data){
        this.data=data;
        this.next=null;
    }}

    public void display(){

        
        listnode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;

            
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        print_linked_list pll= new print_linked_list();
        pll.head =new listnode(1);
        listnode second =new listnode(2);
        listnode third =new listnode(3);
        listnode fourth =new listnode(4);
        listnode fifth =new listnode(5);
        pll.head.next =second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        pll.display();





    }
}
