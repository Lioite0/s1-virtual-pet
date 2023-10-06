import javax.swing.*;

public class Runner {
    public Runner(){
        VirtualPet p = new VirtualPet();
        p.exercise();
        takeARest(1000);
        p.feed();
        takeARest(4000);
        p.exercise();
        String ans = getResponse("How was your day?");
        System.out.println(ans);
    }

    public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(), q, "get a response",
                JOptionPane.PLAIN_MESSAGE);
            return s;

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
