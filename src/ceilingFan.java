import java.time.LocalDate;
/*
Author: Kenton Jones
Date: May 16 2024
Project Name: Ceiling Fan
Description: In Java, implement a simple ceiling fan which has two pull cords and the following characteristics:
	One cord increases the speed each time it is pulled. There are 3 speed settings, and an “off” (speed 0) setting.
	If the cord is pulled on speed 3, the fan returns to the “off” setting.
	One cord reverses the direction of the fan at the current speed setting.
	Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
	The ceiling fan should be “off” on December 25th all day even if the cords are pulled.
	You can assume the unit is always powered (no wall switch).
*/

    /*
    Descript: create the ceilingFan class as specified
    */
    public class ceilingFan {
        private int speed;
        private boolean reverse;
        private LocalDate currentDate;
    
    public ceilingFan() {
        speed = 0; //default speed set to 0
        reverse = false; //start off going forward            
        currentDate = LocalDate.now(); //todays date placeholder for the December 25th check
    }
    
    /*
    Descript: "Pulls" the cord that changes the speed of the fan. 
    Starts at 0. When fan is pulled moves to 1, 2, 3, then back to 0.
    in: none
    out: none
    */
    public void pullSpeedCord() {
        //check if it's december 25th
        if (currentDate.getMonthValue() == 12 && currentDate.getDayOfMonth() == 25) {
            System.out.println("Today is December 25th. The ceiling fan is deactivated.");
            return;
        }
        if (speed == 3) {
            System.out.println("Turning off fan.");
            speed = 0; // Turn off if speed is at maximum
        } else {
            System.out.println("Increasing speed!");
            speed++; // Increase speed
        }
        System.out.println("Speed set to " + speed);
    }
        
    /*
    Descript: "pulls" the cord that changes the direction of the fan. Logs which direction the fan is going.
    in: none
    out: none
    */
    public void pullDirectionCord() {
        //check if it's december 25th. If yes, 
        if (currentDate.getMonthValue() == 12 && currentDate.getDayOfMonth() == 25) {
            System.out.println("Today is December 25th. The ceiling fan is deactivated.");
            return;
        }
        reverse = !reverse; // switch direction
        //If reverse is true, fan is moving backwards, is reverse is false, fan is moving forwards
        if (reverse) {
            System.out.println("The fan is now going backwards.");
            return;
        }
        System.out.println("The fan is now going forwards.");
    }
    
    /*
    Descript: Set the current date
    in: none
    out: none
    */
    public void setCurrentDate(LocalDate date) {
        currentDate = date;
    }
    
}
