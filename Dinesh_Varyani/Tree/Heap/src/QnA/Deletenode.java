package QnA;

// give an lagorithm for deleting an arbitrary element from min heap

public class Deletenode {
    MinHeap mh= new MinHeap(5);
    int n = mh.n;
    public void  delete(int index,Integer[]heap){
        System.out.println(heap[index]);
        if (!mh.isEmpty()&& index>=1 &&index<=n){
        int temp =heap[index];
        heap[index]=heap[n];
        heap[n]=temp;
        n--;
                    }
//        return
    }


    public static void main(String[] args) {
        Deletenode dn= new Deletenode();
MinHeap mn =new MinHeap(5);

        mn.insert(2);
        mn.insert(3);
        mn.insert(4);
        mn.insert(5);
        mn.insert(6);
        mn.insert(7);
        mn.insert(8);
        mn.printheap();
        System.out.println("\n the size of the heap is" + " " +mn.size());
        dn.delete(1, mn.heap);
//        System.out.println();
        dn.delete(5, mn.heap);
    }
}
