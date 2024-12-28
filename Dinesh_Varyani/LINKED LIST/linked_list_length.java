public class linked_list_length {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;

        public  listnode(int data){
           this.data =data;
           this.next =null;
}
    }


    public  int count(){
        listnode current =head;
        int count =0;
        while (current!=null) {
            count++;
            current=current.next;
        }
          return count;
    }

    public static void main(String[]args){
        linked_list_length lll=new linked_list_length();
        lll.head= new listnode(1);
        listnode second =new listnode(2);
        listnode third =new listnode(2);
        listnode fourth =new listnode(2);
        listnode fifth=new listnode(2);
        lll.head.next=second;
        second.next =third;
        third.next= fourth;
        fourth.next=fifth;
        int count =lll.count();
        System.out.println(count);

    }
}
