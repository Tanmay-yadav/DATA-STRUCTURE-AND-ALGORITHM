public class nth_node {
    
        private listnode head;
        private static  class listnode{
         private int data;
         private listnode next;
    
        public listnode(int data){
            this.data=data;
            this.next=null;
    
        }
    }
    public void insert(int position,int value){
        listnode node = new listnode(value);
        if(position==1){
            node.next=head;
            head= node;
        }else{
            listnode previous =head;
            int count=1;
            while (count<position-1) {
                previous=previous.next;
                count++;
            }
            listnode current = previous.next;
            node.next=current;
            previous.next=node;
        }
    }
    
    public void display(){
        listnode current =head;
        while (current !=null) {
            System.out.print(current.data + "-->");
            current =current.next;
        }
        System.out.println("null");
    }
    public listnode nthnode(int n){
listnode mainptr =head;
listnode refptr=head;
int count =0;
while(count<n){
    refptr=refptr.next;
    count++;
}
while(refptr!=null){
    refptr =refptr.next;
    mainptr=mainptr.next;
}
    return mainptr;
}

    public static void main(String[] args) {
        nth_node na= new nth_node();
        // na.head =new listnode(1);
        // listnode second =new listnode(2);
        // listnode third =new listnode(3);
        // listnode fourth =new listnode(4);
        // na.head.next=second;
        // second.next=third;
        // third.next=fourth;
        // System.out.println("original :");
        na.insert(1,2);
        na.insert(2,3);
        na.insert(3,4);
        na.insert(4,5);
        System.out.println("before ");
        na.display();
        // listnode previous =na.head;
        // listnode current =na.head.next;
        // previous.next=null;
        // na.head=current;
        // System.out.println("after deleting firstnode:");
        // na.display();
        listnode answer=na.nthnode(3);
    System.out.println("the nth  ode from end is:"+answer.data);
     
       
    
    
    }
        
    }
    

