public class middle {
    
        private listnode head;
        private static class listnode{
            private int data;
            private listnode next;
             
            public listnode(int data){
                this.data=data;
                this.next=null;
            }
    
        }
        public void insert(int position,int value){
            listnode node =new listnode(value);
            if (position==1) {
                node.next=head;
                head= node;
                
            }else{
                listnode previous=head;
                int count =1;
                while(count<position-1){
                    previous=previous.next;
                    count++;
                }
                listnode current =previous.next;
                node.next =current;
                previous.next=node;
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
        public boolean search(int value){
            // int count=1;
            while (head!=null) {
                if (head.data==value) {
                    System.out.println("true");
    
                }
                
                    head=head.next;
                
                
            }
            return false;
        }

        public listnode middle(){
        listnode slwptr=head;
        listnode fastptr=head;
        if (head==null) {
            return head;
        }
        while(fastptr!=null && fastptr.next!=null){
          slwptr= slwptr.next;
          fastptr =fastptr.next.next;
        }
    return slwptr;
}
        
        public static void main(String[] args) {
            middle se =new middle();
            se.insert(1, 1);
            se.insert(2, 2);
            se.insert(3, 3);
            se.insert(4, 4);
            se.insert(5, 5);
            se.insert(6, 5);
            System.out.println("the linked list is:");
            se.display();
            // System.out.println("the searched value is:");
        //    System.out.println(se.search(6));
        System.out.println("the middle of the linked list is:");
          listnode result= se.middle();
          System.out.println(result.data);
    
        }
    }
    

