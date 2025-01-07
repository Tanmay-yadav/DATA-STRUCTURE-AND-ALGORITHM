
class Box {
    double width;
    double height;
    double length;
//using object as parameters
    //here the object 'ob ' of type box is used as the parameter
    Box(Box ob){
        width=ob.width;
        length=ob.length;
        height=ob.height;

    }



    Box(double w,double h,double l){
        width=w;
        height=h;
        length =l;
    }

    Box(){
        height =-1;
        width=-1;
        length=-1;
    }
    Box(double len){
        height=width=length= len;
    }
    double volume(){
        return width*length*height;
    }
}
//class overloadcons{
//    public static void main(String[] args) {
//        Box mybox1=new Box(1,20,15);
//        Box mybox2=new Box();
//        Box mycube=new Box(7);
//        Box myclone =new Box(mybox1);
//        double vol;
//        vol =mybox1.volume();
//        System.out.println("volume of mybox1 is:"+vol);
//        vol=mybox2.volume();
//        System.out.println("volume of mybox2 is "+vol);
//
//        vol= mycube.volume();
//        System.out.println("volume of mycube is "+vol);
//
//        vol= myclone.volume();
//        System.out.println("volume of myclone is/will always same as mybox1 :"+vol);
//        myclone.length=100;
//        vol= myclone.volume();
//        System.out.println("volume of the myclone after explicitly changing lenght to 100: "+vol);
//    }
//}

// argument passing
//primitive types are passed by value.
//class test{
//    void meth(int i,int j){
//        i*=2;
//        j/=2;
//    }
//}
//class callbyvalue{
//    public static void main(String[] args) {
//        test ob =new test();
//        int a =15,b=20;
//        System.out.println("call by value :");
//        System.out.println("a and b before call:"+a +","+b);
//        ob.meth(a,b);
//        System.out.println("a and b after call:"+a+","+b);
//    }
//}
class test2{
    int a ,b;
    test2(int i,int j ){
        a=i;
        b=j;
    }
    void meth(test2 ob){ //pass an object
        ob.a*=2;
        ob.b/=2;
    }
}
class callbyreference{
    public static void main(String[] args) {
        test2 ob =new test2(15,20);
        System.out.println("call by refernce");
        System.out.println("a and b before call:"+ob.a +","+ob.b);
        ob.meth(ob);
        System.out.println("a and b after call:"+ob.a+","+ob.b);
    }
}