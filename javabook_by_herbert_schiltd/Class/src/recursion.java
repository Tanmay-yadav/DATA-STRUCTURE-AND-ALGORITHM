class rectest{
    int values [];
    rectest (int i ){
        values =new int [i];
    }
    //display array -- recursively
    void printarray(int i){
        if(i==0) return;
        else printarray(i-1);
        System.out.println("["+(i-1)+"]"+values[i-1]);
    }
} class recursion2{
    public static void main(String[] args) {
        rectest ob =new rectest(10);
        for (int i=0; i<10;i++) ob.values[i]=i;
        ob.printarray(10);
    }
}