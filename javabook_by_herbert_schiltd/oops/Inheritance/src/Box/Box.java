package Box;

public class Box {
    double width;
    double height;
    double depth;

    // construct clone of the object
    Box(Box ob) {// pass object to the constructor

        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // constructor used when all the dimensions specified
    Box(double w, double h,double d){
        width =w;
        height =h;
        depth=d;
    }
    // constructor used when no dimensions specified
//    Box(){
//        width=-1; // use -1 to indicate an
//        height=-1; // uninitialized
//        depth =-1; // box
//    }
    // constructor when cube is created
    Box(double len){
        width=height=depth=len;
    }
    //compute and return the volume

    double volume (){
        return width*height*depth;
    }
}

//Here ,Box is extended to include weight.
    class Boxweigth extends Box{
    private double weight;
    Boxweigth(double w,double h,double d,double m){
//        width =w; // Now lets simplify and use the super keyword here
//        height=h;
//        depth =d;
        super(w,h,d);
        weight =m;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class DemoBoxWeight{
    public static void main(String[] args) {
        Boxweigth b1 =new Boxweigth(2,3,4,10);
        Boxweigth b2 =new Boxweigth(10,10,10,10);
        double vol;
        vol = b1.volume();
        System.out.println("The volume of box1 is"+" "+vol);
//        System.out.println("The weight of box1 is "+" "+ b1.weight); // when the weight is not private
        System.out.println("The weight of box1 is "+" "+ b1.getWeight());
        b1.setWeight(100);
        System.out.println("The weight after setweight method is "+" "+ b1.getWeight());
        System.out.println();


    }
}