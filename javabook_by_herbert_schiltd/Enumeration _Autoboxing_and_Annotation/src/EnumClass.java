// Demostrate ordinal(), compareTo() and equals()
public class EnumClass {
   // An enumeration of apples varities.
    enum Apple{
        Jonathan,GoldenDel,REDDel,Winesap,Cortland
   }

    public static void main(String[] args) {
        Apple ap,ap2,ap3;
        // obtain all ordinal values using ordinal().
        System.out.println("Here are all apple constant and their ordinal values" );
        for(Apple a: Apple.values())
            System.out.println(a + " "+ a.ordinal());

        ap =Apple.REDDel;
        ap2 =Apple.GoldenDel;
        ap3= Apple.REDDel;
        System.out.println();

        // Demostrate compareTo() and Equals()
        if(ap.compareTo(ap2)<0)
            System.out.println(ap+" comes before "+ap2);
        if(ap.compareTo(ap2)>0)
            System.out.println(ap2+" comes before "+ap);
        if(ap.compareTo(ap3)==0)
            System.out.println(ap+" equals "+ap3);
        System.out.println();
        if(ap.equals(ap2))
            System.out.println(" Error! ");
        if(ap.equals(ap3))
            System.out.println(ap+" equals "+ap3);
        if(ap==ap3)
            System.out.println(ap+" == "+ap3);

    }
}
