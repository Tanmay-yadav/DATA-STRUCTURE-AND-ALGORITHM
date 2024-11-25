public class duplicate {
    private listnode head;
    private class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data=data;
            this.next=null;


        }
        
    }
    public  void insert(int position,int value){
       listnode node =new listnode(value);
       if(position==1){
        node.next=head;
        head=node;
       }else{
        listnode previous=head;
        int count=1;
        while(count<position-1){
            previous =previous.next;
            count++;
        }
        listnode current =previous.next;
        node.next=current;
        previous.next=node;
       }
    } 
    public void display(){
        listnode current =head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current =current.next;
            
        }
        System.out.println("null");
    }
    public void removeduplicate(){
        listnode current =head;
        while(current!=null && current.next!=null){
            if (current.data ==current.next.data) {
                current.next =current.next.next;
            }else{
                current=current.next;
            }
        }
    }
    
    public static void main(String[] args) {
        duplicate na =new duplicate();
        na.insert(1,2);
        na.insert(2,2);
        na.insert(3,4);
        na.insert(4,5);
        System.out.println("before deleting duplicate node");
        na.display();
        System.out.println("after deleting duplicate node:");
        na.removeduplicate();
        na.display();
        
       
    }
}
