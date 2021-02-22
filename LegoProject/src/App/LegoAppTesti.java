package App;
import Data.*;

import lejos.hardware.Button;

public class LegoAppTesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float                range;
        UltraSonicSensor     uss = new UltraSonicSensor(SensorPort.S4);
        
        range = uss.getRange();

        Lcd.print(7, "range=");

        // run until we find an obstacle within 1/4 of a meter.
        
        while (range > .25)
        {
            Lcd.clear(7, 7, 10);
            Lcd.print(7, 7, "%.3f", range);
            Delay.msDelay(500);

            range = uss.getRange();
        }
        
        // free up resources.
        uss.close();
		
		System.out.println("Hei, tervetuloa kaikki!");
		
		System.out.println("Moi Jenni!");
		System.out.println("Moi Liisa!");
		System.out.println("Moi Alina!");
		System.out.println("Moi Sanna!");
	
		Button.waitForAnyPress();
		
		Motor moottori1 = new Motor("Moottori 1");
		//Distance distance1 = new Distance("Distance");
		
		Thread motorThread = new Thread(moottori1);
		//Thread measureDistance=new Thread(Distance);
		
		motorThread.start();
		Button.waitForAnyPress();
		

	}

}
