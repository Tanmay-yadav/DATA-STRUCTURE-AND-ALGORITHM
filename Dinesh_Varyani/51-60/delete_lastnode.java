public class delete_lastnode {
    private listnode head;
    private static class listnode {
        private int data;
        private listnode next;


        private  listnode(int data){
            this.data=data;
            this.next=null;

        }
        
    }
    public void display(){
        listnode current =head;
        while (current!=null) {
            System.out.print(current.data +"-->" );
            current =current.next;
            
        }
        System.out.println("null");
    }
    public void insert(int position,int data){
        listnode node =new listnode(data);
        if(position==1){
            node.next=head;
            head=node;

        }else{
            listnode previous =head;
            int count =1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            listnode current =previous.next;
            node.next=current;
            previous.next=node;
        }
        
    }
    public listnode delete(int position){
        listnode current =head;
        listnode previous =null;
        int count =1;
        if (head==null || head.next==null) {
            return head;
            
        }else if (position==1) {
            head =head.next;
            // previous.next=current;
            // return current;
            
        }else{ 
            while (count<position) {
                previous = current;
                current =current.next;
                count++;
            }
            previous.next=current.next;
            current.next=null;

        }
        return current;

    }

    public static void main(String[] args) {
        delete_lastnode dn=new delete_lastnode();
        // dn.head=new listnode(2);
        dn.insert(1,2);
        dn.insert(2,3);
        dn.insert(3,4);
        dn.insert(4,5);
        dn.insert(5,20);
        dn.insert(6,1);
        dn.display();
        dn.delete(5);
        // System.out.println("The deleted node is :"+ result);
        dn.display();

    }
}
