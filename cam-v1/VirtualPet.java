/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VirtualPet {
    
    VirtualPetFace face;
    // int hunger = 0;   // how hungry the pet is.
    boolean energized = true;
    int happiness = 5;
    boolean confident = true;
    int tricknum = 0;
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("default");
        face.setMessage("I am Blobl the magician!");
    }
    public void reset(){
        if(energized==false){
            face.setImage("tired");
        }
        else if(happiness > 5){
            face.setImage("happy");
        }
        else if(happiness == 5){
            face.setImage("default");
        }
        else{
            face.setImage("sad");
        }
    }
    public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(), q, "get a response",
                JOptionPane.PLAIN_MESSAGE);
            return s;

    }
    public void perform() {
        reset(); 
        String s = getResponse("What trick should I do? \n 1.Pull rabbit out of hat \n 2.Pull coin from behind an ear \n 3.Choose your card from deck");
       
        if(s.equals("1") && energized == true){
             face.setImage("rabbitgood");
             confident = true;
             happiness +=1; 
            face.setMessage("Presto!");
         }
         else if (s.equals("1") && energized == false){
            face.setImage("rabbitbad");
            confident = false;
            happiness -=1;
            face.setMessage("where did it go?");
         }
        if(s.equals("2") && energized == true) {
            face.setImage("coingood");
            confident = true;
            happiness +=1;
            face.setMessage("Ta Da!");
         }
        else if (s.equals("2") && energized == false){
            face.setImage("coinbad");
            confident = false;
            happiness -=1;
            face.setMessage("where is the coin?");
         }
        if(s.equals("3") && energized == true){
            face.setImage("cardgood");
            confident = true;
            happiness +=1;
            face.setMessage("is this your card?");
         }
         else if (s.equals("3") && energized == false){
            face.setImage("cardbad");
            confident = false;
            happiness -=1;
            face.setMessage("aw man");
         }
    tricknum +=1; 
   if (tricknum >1){
             energized = false;
            }
     }
    // public void feed() {
    //     if (hunger > 10) {
    //         hunger = hunger - 10;
    //     } else {
    //         hunger = 0;
    //     }
    //     face.setMessage("Yum, thanks");
    //     face.setImage("default");
    // }
    public void sleep(){
        face.setImage("sleep");
        energized = true;
    }
    

    // public void exercise() {
    //     hunger = hunger + 3;
        
    //     face.setMessage("1, 2, 3, jump.  Whew.");
    //     face.setImage("tired");
    // }
    
    // public void sleep() {
    //     hunger = hunger + 1;
    //     face.setImage("asleep");
    // }

} // end Virtual Pet
