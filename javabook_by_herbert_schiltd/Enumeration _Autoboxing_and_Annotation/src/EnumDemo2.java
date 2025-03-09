import java.net.SocketTimeoutException;

public class EnumDemo2 {
    enum Apple {
        Jonathan, Goldendel, RedDel, Winesao, Cortland
    }
// Using of values() and valuesof()
//     Their genreal forms are shown here:
//    public static enum-type[]values()
//    public static enum-type valueof(String str)


    public static void main(String[] args) {
        Apple ap;
        System.out.println("Here are All apple constants:");

        // use values()
        Apple allapples[] = Apple.values();
//        for (Apple a: allapples){
//            System.out.println(a);
//        }
//             OR
        for (Apple a:  Apple.values())
                System.out.println(a);

        System.out.println();
        // use valueOf()
        ap =Apple.valueOf("Cortland");
        System.out.println("ap contains "+ ap );
    }
}
