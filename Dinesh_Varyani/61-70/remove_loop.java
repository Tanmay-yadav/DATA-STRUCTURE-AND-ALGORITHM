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
    

public void display(){
    listnode current =head;
    while(current!=null){
      System.out.print(current.data +"-->");
       current =current.next;
    }
    System.out.println("null");
}

public void removeloop(){
 listnode slwptr = head;
 listnode fastptr =head;
 while (fastptr!=null && fastptr.next !=null) {
    
    
    fastptr=fastptr.next.next;
    slwptr=slwptr.next;
    if (slwptr==fastptr) {
         removeloop(slwptr);
        return;

         
    }


}

}
private void removeloop(listnode slowptr){
    listnode temp= head;
    while (temp.next!=slowptr.next) {
          temp =temp.next;
          slowptr =slowptr.next;        
    }
    slowptr.next=null;
}

public listnode getstart(listnode slwptr){
    listnode temp =head;
    while (slwptr!=temp) {
        temp=temp.next;
        slwptr=slwptr.next;
        

    }
    return temp;
    

}

public static void main(String[] args) {
    remove_loop se =new remove_loop();
  
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
   se.removeloop();
   se.display();
     



   

}










}
