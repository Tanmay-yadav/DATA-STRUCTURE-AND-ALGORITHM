public class remove_loop {
    

    
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
    public listnode isloop(){
     listnode slwptr = head;
     listnode fastptr =head;
     while (fastptr!=null && fastptr.next !=null) {
        
        
        fastptr=fastptr.next.next;
        slwptr=slwptr.next;
        if (slwptr==fastptr) {
            removeloop(slwptr);
            return getstart(slwptr);
        }

    
    }
    return null;
    }
    public listnode getstart(listnode slwptr){
        listnode temp =head;
        while (slwptr!=temp) {
            temp=temp.next;
            slwptr=slwptr.next;
            

        }
        return temp;
        

    }
    public void removeloop(listnode slwptr){
listnode temp =head;
 while (temp!=slwptr) {
    temp=temp.next;
    slwptr=slwptr.next;
if (slwptr.next==temp.next) {
    slwptr.next=null;
    
    
}
    
 }

    }
    
    public static void main(String[] args) {
        remove_loop se =new remove_loop();
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
        System.out.println("the loop start at:");
       System.out.println(se.isloop().data);
       System.out.println("The linked list after removing the loop is:");
        se.isloop();
         



        // System.out.println("before inserting the data into the sorted linkedlist:");
        // se.display();
        // System.out.println("After inserting the data into the sorted linkedlist");
        // se.sortedinsertion(1);
        // se.sortedinsertion(5);
        // se.sortedinsertion(9);
        
        se.display();
    
    }
    
    
    
    
    
    
    
    


}


