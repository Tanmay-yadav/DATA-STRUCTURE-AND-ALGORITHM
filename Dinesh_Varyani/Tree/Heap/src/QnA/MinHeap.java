package QnA;

public class MinHeap {
     Integer heap[];
     int n;
     public MinHeap(int capacity){
         heap =new Integer[capacity+1];
         n=0;
     }
     public boolean isEmpty(){
         return n==0;
     }
     public int size(){
         return n;
     }


     public void insert(int x){
        if (n==heap.length-1){
            resize(2* heap.length);
        }
        n++;
        heap[n]=x;
        sink(n);
     }


    private void resize(int capacity) {
         Integer []temp= new Integer[capacity];
         for (int i=0;i<heap.length;i++){
             temp[i]=heap[i];
         }
         heap=temp;
     }

    private void sink(int k) {
         while(k>1 && heap[k/2]>heap[k]){
             int temp =heap[k];
             heap[k]=heap[k/2];
             heap[k/2]=temp;
         }
         k=k/2;
    }
    public void printheap(){
         for(int i=1; i<=n;i++){
             System.out.print(heap[i] + " ");
         }


    }
    public int delete(int index){
         if (isEmpty()){
             return 000;
         }
        System.out.println(" The index to be deleted is "+ " "+ index);
         if (index>1 &&index<=n){
             int temp=heap[index];
             heap[index]=heap[n];
             heap[n]=temp;

         }
         n--;
         return heap[n+1];
    }

    public static void main(String[] args) {
        MinHeap mh=new MinHeap(4);
        System.out.println(mh.isEmpty());
        System.out.println(mh.size());
        mh.insert(1);
        mh.insert(2);
        mh.insert(3);
        mh.insert(4);
        mh.insert(5);
        mh.insert(6);
        mh.insert(7);
        mh.printheap();
        System.out.println("\nThe size of the deleted heap is:"+ mh.size());
        int deletednode =mh.delete(3);
        System.out.println("\nThe deleted node is "+" "+ deletednode);
        System.out.println("The size of the heap is "+mh.size());
     }

}
