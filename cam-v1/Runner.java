import javax.swing.*;

public class Runner {
    public Runner(){
        VirtualPet p = new VirtualPet();
        // p.exercise();
        // takeARest(1000);
        // p.feed();
        // takeARest(4000);
        // p.exercise();
        p.perform();
        takeARest(1500);
        p.perform();
        takeARest(1500);
        p.perform();
        takeARest(1500);
        p.sleep();
        takeARest(1500);
        p.perform();
   
    }

    
   

    public void takeARest (int milliseconds){
try {
    Thread.sleep(milliseconds);
} catch (Exception e){

}
    }
    public static void main(String[] args) {
       new Runner();
    }
}
