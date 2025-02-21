package Interface;

public class client implements callback{
    // implements callbacks interface
    public void callback(int p){
        System.out.println("callback called with"+ ":"+ p);
    }

}
