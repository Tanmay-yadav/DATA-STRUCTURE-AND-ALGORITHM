import java.util.NoSuchElementException;

public class circularlinkedlist {
    private listnode last;
    private int length;

    private class listnode{
        private listnode next;
        private int data;

        public listnode(int data){
            this.data=data;
        }
    }
    public circularlinkedlist(){
        this.last=null;
        this.length=0;
    }
    public boolean isempty(){
        return length==0;
    }
    public int length(){
        return length;
    }
//    public void createlist(){
//        listnode first =new listnode(1);
//        listnode second =new listnode(2);
//        listnode third =new listnode(3);
//        listnode fourth =new listnode(4);
//        listnode fifth =new listnode(5);
//        first.next=second;
//        second.next=third;
//        third.next=fourth;
//        fourth.next=fifth;
//        fifth.next=first;
//        last =fifth;
//    }
    public void display(){
        if (isempty()){
            System.out.println("the list is empty");
            return;
        }
        listnode first =last.next;
        while(first!=last){
            System.out.print(first.data+ "-->");
            first =first.next;
        }
        System.out.print(first.data+" \n");
    }
    public void insertatfirst(int value){
        listnode newnode =new listnode(value);
        if (last==null){
            last=newnode;
            newnode.next=last;
        }
        else{

            newnode.next=last.next;
            last.next=newnode;
        }
    }
    public void insertatlast(int value){
        listnode newnode =new listnode(value);
        if (last==null){
            last=newnode;
            last.next=newnode;
        }
        else{
            listnode first = last.next;


            newnode.next=first;
            last.next=newnode;
            last =newnode;
        }
    }

    public void deletefirst(){

        if (last==null){
//            System.out.println("no such element present");

            throw new NoSuchElementException();
        } else if(last!=last.next){
            listnode temp =last.next;
//
                last.next = temp.next;
                temp.next = null;
         }
        else {
            last =null;
        }
//        return temp;
    }
    public static void main(String[] args) {
circularlinkedlist cll =new circularlinkedlist();
//cll.createlist();
cll.insertatfirst(2);
cll.insertatfirst(1);
cll.insertatfirst(0);
cll.display();
cll.insertatlast(8);
cll.insertatlast(9);
cll.insertatlast(10);
//        System.out.println(" ");
cll.display();
cll.deletefirst();
cll.display();
cll.deletefirst();
cll.deletefirst();
cll.deletefirst();
cll.deletefirst();
cll.deletefirst();
cll.deletefirst();
cll.display();
    }
}
