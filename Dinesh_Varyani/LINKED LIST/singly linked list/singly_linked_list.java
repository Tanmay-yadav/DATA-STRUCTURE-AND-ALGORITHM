public class singly_linked_list {
    private ListNode head;
    private static class ListNode{
        private int data; //generic type
        private ListNode next;


        public ListNode(int data){
            this.data=data;
            this.next=null;

        }
    }

    public static void main(String[]args){
        singly_linked_list sll =new singly_linked_list();
        sll.head =new ListNode(10);
        ListNode second= new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        sll.head.next= second;
        second.next=third;
        third.next =fourth;
    }
    
}
