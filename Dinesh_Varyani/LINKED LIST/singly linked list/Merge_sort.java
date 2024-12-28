import javax.management.remote.JMXServerErrorException;

public class Merge_sort {
private listnode b;
private listnode a;

private static class  listnode{
    private int data;
    private listnode next;

    public listnode(int data){
        this.data=data;
        this.next=null;
    }
}
public void display(listnode head){
    listnode current =head;
    while(current !=null){
        System.out.print(current.data+"-->");
        current=current.next;
    }
    System.out.println("null");
}
public listnode merge(listnode a,listnode b){
    listnode dummy =new listnode(0);
    listnode tail =dummy;
    while(a!=null && b!=null){
        if (a.data<=b.data){
            tail.next=a;
            a=a.next;
        }else{
            tail.next=b;
            b=b.next;
        }
        tail=tail.next;
    }
    if(a==null){
        tail.next=b;
    }else{
        tail.next=a;
    }
    return dummy.next;
}
public static void main (String args[]){
    Merge_sort ms =new Merge_sort();
//    listnode a;

    ms.a=new listnode(0);
    listnode second =new listnode(1);
    listnode third =new listnode(3);
    listnode fourth =new listnode(5);
    listnode fifth =new listnode(7);
    ms.a.next=second;
    second.next=third;
    third.next=fourth;
    fourth.next=fifth;
    System.out.println("second linked list");
     ms.display(ms.a);

    ms.b=new listnode(2);
    listnode second2=new listnode(4);
    listnode second3=new listnode(6);
    listnode second4=new listnode(8);
    listnode second5=new listnode(10);
    ms.b.next=second2;
    second2.next=second3;
    second3.next=second4;
    second4.next=second5;

    System.out.println("second linked list");
    ms.display(ms.b);
    listnode c = ms.merge(ms.a,ms.b);
    System.out.println("after merging :");
    ms.display(c);

}
}
