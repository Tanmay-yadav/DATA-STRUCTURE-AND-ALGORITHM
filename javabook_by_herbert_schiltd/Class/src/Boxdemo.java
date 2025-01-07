public class Boxdemo {


    public static void main(String[] args) {
        Box mybox1 =new Box(10,10,10);
        Box mybox2 =new Box(5,5,10);
        double vol;
//
//mybox1.width =100;
//mybox1.length=100;
//mybox1.height=100;
//calling the volume function for mybox1
  vol = mybox1.volume();
        System.out.println("the volume is :" +vol);


//        mybox2.width =5;
//        mybox2.length=5;
//        mybox2.height=10;
        //calling volume for mybox2
      vol=  mybox2.volume();


        System.out.println("the volume is :" +vol);


    }
}
class Box1{ // this is the declaration of the box class
    double width;
    double height;
    double length;
    // adding a constructor to the class box
    // so we won't be needing to intialize the object

//    Box(){ // this is the constructor of box class
//        System.out.println("constructing box");
//        width =10;
//        length =10;
//        height =10;
//    }
// The above constructor is good but what we need is the parameterised constructor
    Box1(double  l,double w,double h){
        length =l;
        width =w;
        height =h;
    }



    //adding method to the box class
    //    void volume(){ //display volume of the box
//        System.out.println("the volume of the box is ");
//        System.out.println(width*length*height);


    // this is the void method it doesnt return any value
    // but what if we want to return some value?
    // we use the following method of type other than void i.e double ,boolean,int,etc

    double volume(){
        return width*length*height;


    }
}


