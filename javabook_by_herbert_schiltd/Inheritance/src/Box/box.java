package Box;
// this program uses inheritance to extend Box
public class box {
    double width;
    double height;
    double depth;

    // constructor clone of an object
    Box(Box ob){ // pass object to constructor
        width=ob.width;
        height= ob.height;
        depth =ob.depth;
    }
    //constructo used when all dimensions specified
    Box(double w, double h, double d){
        width =w;
        height=h;
        depth =d;
    }
    
}

