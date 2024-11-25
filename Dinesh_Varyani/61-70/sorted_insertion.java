public class sorted_insertion {
    private listnode head;
    private class listnode{
        private int data;
        private listnode next;
        public listnode(int data){
           this.data=data;
           this.next=null;

        }
    }
    public void insert(int position,int value){
        listnode node =new listnode(value);
        
      if(position==1){
        node.next=head;
        head =node;

      }else{
        listnode previous =head;
        int count =1;
      while(count<position-1){
          previous =previous.next;
          count++;
    }
     node.next=previous.next;
     previous.next =node;
}}

public void display(){
    listnode current =head;
    while(current!=null){
      System.out.print(current.data +"-->");
       current =current.next;
    }
    System.out.println("null");
}
public void sortedinsertion(int data){
    listnode node =new listnode(data);
    listnode current = head;
    while(current!=null && current.next!=null){
        if(current.data==current.next.data && node.data==current.data){
           node.next=current.next;
           node =current.next;
                       
        }else if (node.data>current.data && node.data<current.next.data) {
            node.next =current.next;
            node =current.next;
        }else if (node.data<current.data && node.data<current.next.data) {
            node.next=current;
            head=node;
            
        }
        current =current.next;
    }
    // System.out.println("The ");

}
public static void main(String[] args) {
    sorted_insertion se =new sorted_insertion();
    se.insert(1, 2);
    se.insert(2, 3);
    se.insert(3, 4);
    se.insert(4, 5);
    se.insert(5, 6);
    se.insert(6, 7);
    System.out.println("before inserting the data into the sorted linkedlist:");
    se.display();
    System.out.println("After inserting the data into the sorted linkedlist");
    se.sortedinsertion(1);
    se.display();

}





}
