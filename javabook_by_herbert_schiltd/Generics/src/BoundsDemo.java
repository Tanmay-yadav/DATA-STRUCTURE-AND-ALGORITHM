// in this version of stats, the type argument for
//T must be either Number, or a class derived
// from number.
class stats<T extends Number>{
    T[]nums; // array of number or subclass
    // Pass the constructor a reference to
    // an Array of type Number or subclass.
    stats(T[] o){
        nums =o;
    }
    // Return type double in all cases.
    double average(){
        double sum =0.0;
        for (int i=0;i< nums.length;i++)
            sum+=nums[i].doubleValue();
        return sum/nums.length;
    }
}
//Demonstrate stats.
public class BoundsDemo {
    public static void main(String[] args) {
        Integer inum[]={1,2,3,4,5};
        stats<Integer> iob =new stats<Integer>(inum);
        double v =iob.average();
        System.out.println("iob average is "+ v);

        Double dnums[]={1.1,2.2,3.3,4.4,5.5};
        stats<Double> dob =new stats<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is "+ w);

        // THis won't compile because String is not a
        // subclass of Number.
//         String str[]={"1","2","3","4","5"};
//        stats<String> Strob=new stats<String>(strs);
//        double x = strob.average();
//        System.out.println("stob average is "+ v);

    }
}
