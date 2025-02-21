//package mypackage;
public class Balance {
    String name;
    double bal;
    Balance(String n,double b){
        name =n;
        bal =b;
    }
    void show(){
        if(bal<0)
            System.out.println("-->");
        System.out.println(name+ ": $"+ bal );

    }
}
class AccountBAlance{
    public static void main(String[] args) {
        Balance current[] =new Balance[3];
        current[0]=new Balance("Tanmay",123.34);
        current[1]=new Balance("Tanu",1243.34);
        current[2]=new Balance("T",12.34);

        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}
