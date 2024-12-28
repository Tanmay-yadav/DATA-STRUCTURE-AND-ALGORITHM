 public class detecting_loop {
    
        private listnode head;
        private static class  listnode{
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
    public void sortedinsertion(int data) {
        listnode node = new listnode(data);
    
        // If the list is empty or the new node needs to be inserted at the head
        if (head == null || head.data >= node.data) {
            node.next = head;
            head = node;
            return;
        }
    
        // Traverse the list to find the appropriate position
        listnode current = head;
        while (current.next != null && current.next.data < node.data) {
            current = current.next;
        }
    
        // Insert the new node
        node.next = current.next;
        current.next = node;
    }
    public boolean isloop(){
     listnode slwptr = head;
     listnode fastptr =head;
     while (fastptr!=null && fastptr.next !=null) {
        
        
        fastptr=fastptr.next.next;
        slwptr=slwptr.next;
        if (slwptr==fastptr) {
            return true;
        }

    
    }
    return false;
    }
    
    public static void main(String[] args) {
        detecting_loop se =new detecting_loop();
        // se.insert(1, 2);
        // se.insert(2, 3);
        // se.insert(3, 4);
        // se.insert(4, 5);
        // se.insert(5, 6);
        // se.insert(6, 7);
        se.head= new listnode(1);
        listnode second = new listnode(2);
        listnode third = new listnode(3);
        listnode fourth = new listnode(4);
        listnode fifth = new listnode(5);
        listnode sixth = new listnode(6);
        listnode seventh = new listnode(7);
        listnode eighth = new listnode(8);
        listnode ninth = new listnode(9);
        se.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
        seventh.next=eighth;
        eighth.next=ninth;
        ninth.next=sixth;
        if(se.isloop()){
            System.out.println("The loop is present");

        }else{
            System.out.println("There is no loop");
        }




        // System.out.println("before inserting the data into the sorted linkedlist:");
        // se.display();
        // System.out.println("After inserting the data into the sorted linkedlist");
        // se.sortedinsertion(1);
        // se.sortedinsertion(5);
        // se.sortedinsertion(9);
        
        // // se.display();
    
    }
    
    
    
    
    
    }
    
    

