package Encapsulation;

public class Test {
    public static void main(String[] args) {


        Student tanmay = new Student();

//        tanmay.age = 14;  After amking age variable private this will be unaccessible here
             tanmay.setAge(14);
            int Age =tanmay.getAge(); // these age getter and setters

//        System.out.println(tanmay.age);
        System.out.println(Age);
    }
}
