import java.util.Scanner;

public class Agent extends Sensors {
	public Agent(){
		double temperature = 0;
		String action = null;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your surface temperature: ");
		temperature = in.nextFloat();
		Sensors sensor1 = new Sensors();
		sensor1.percept(temperature);
		
		double normal_temperature = 37.5;
		
		if(temperature > normal_temperature){
			action = "It's hot.";
		}else{
			action= "It's cold.";
		}
		
		Actuators actuator1 = new Actuators();
		actuator1.actions(action);
	}
}
