// An enumeration of Apple varities
enum Apple {
    Jonathan, Goldendel, RedDel, Winesao, Cortland
}

public class EnuDemo {
    public static void main(String[] args) {
        Apple ap; // enumeration variable is declared and used in much a same way as
//                   the primitive types. it doesn't need new to declare it.
        ap = Apple.RedDel;

        //Output an enum value
        System.out.println("Vaalue of ap is: "+ ap);
        System.out.println();
        ap= Apple.Goldendel;
        // Compare two enum values.
        if (ap== Apple.Goldendel){
            System.out.println("ap contains GoldenDel.\n");
        }
            // use an enum to control a switch statement.
            switch(ap){
                case Jonathan:
                System.out.println("Jonathan is Red");
                break;
                case Goldendel:
                    System.out.println("GoldenDel is yellow");
                    break;
                case Cortland:
                    System.out.println("Cortland is Red");
                    break;
        }
    }
}
