public class Generics {
    // A simple generics class
    // here,T is a type parameter that
    //will be replaced by a real type
    // when an object of type Gen is created
    class Gen<T>{
        T ob; // declare an object of type T
        //pass the constructor a reference to
        // an object of type T

        public Gen(T ob) {
            this.ob = ob;
        }

    }
}
