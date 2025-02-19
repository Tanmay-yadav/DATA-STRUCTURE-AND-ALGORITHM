package Animal;

public class Dog extends Animal {

    public static void main(String[] args) {
    String sound ="woof";
   Dog dog=new Dog();
        dog.sayhello(sound);
        dog.setAge(10);
        System.out.println(dog.getAge());
    }

}
