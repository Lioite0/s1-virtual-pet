/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    boolean energized = true;
    int happiness = 10;
    boolean confident = true;
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("default");
        face.setMessage("I am Blobl the magician!");
    }
    public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(), q, "get a response",
                JOptionPane.PLAIN_MESSAGE);
            return s;

    }
    public void perform() {
        String s = getResponse("What trick should I do? \n 1.Pull rabbit out of hat \n 2.Pull coin from behind an ear \n 3.Choose your card from deck");
         if(s.equals("1") && energized == true){
             face.setImage("rabbitgood");
             confident = true;
             happiness +=1; 
         }
         else if (s.equals("1") && energized == false){
            face.setImage("rabbitbad");
            confident = false;
            happiness -=1;
         }
        if(s.equals("2") && energized == true) {
            face.setImage("coingood");
            confident = true;
            happiness +=1;
         }
        else if (s.equals("2") && energized == false){
            face.setImage("coinbad");
            confident = false;
            happiness -=1;
         }
        if(s.equals("3") && energized == true){
            face.setImage("cardgood");
            confident = true;
            happiness +=1;
         }
         else if (s.equals("3") && energized == false){
            face.setImage("cardbad");
            confident = false;
            happiness -=1;
         }

     }
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("default");
    }
    
    

    // public void exercise() {
    //     hunger = hunger + 3;
        
    //     face.setMessage("1, 2, 3, jump.  Whew.");
    //     face.setImage("tired");
    // }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

} // end Virtual Pet
