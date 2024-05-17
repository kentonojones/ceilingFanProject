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

public class Main {
    public static void main(String[] args) {
        // Create a new instance of the CeilingFan
        ceilingFan fan = new ceilingFan();

        // Pull the speed cord to show functionality
        try {

            //There are 3 speed settings, and an “off” (speed 0) setting
            fan.pullSpeedCord(); // Speed 1
            fan.pullSpeedCord(); // Speed 2
            fan.pullSpeedCord(); // Speed 3

            //If the cord is pulled on speed 3, the fan returns to the “off” setting.
            fan.pullSpeedCord(); // Speed 0 (Off)
            fan.pullSpeedCord(); // Starts increasing the speed again, Speed 1

            //Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
            fan.pullDirectionCord(); // Reverse direction
            fan.pullSpeedCord(); // Speed 2, to show speed continues while reversed

            //set the date then pull the cord on Christmas. An alert that it's Dec 25th should appear for both cords.
            fan.setCurrentDate(LocalDate.of(2024, 12, 25));
            fan.pullSpeedCord();
            fan.pullDirectionCord();
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }



    }
}