package Encapsulation;
    // encapsulation is mainly used for better management/hiding  of the blocks of codes,variables,etc.

public class Student{
   private String name;

    private int rollno;

   private int age;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
       if(age<0){
           age=0;
       }else{
           this.age=age;
       }

   }
   public int getAge(){
       return this.age;
   }
}
