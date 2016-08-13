import java.util.*;
public class RobotMain {
public static void main(String[] args) {

	//Instances
	Scanner scan = new Scanner(System.in);
	Random gen=new Random();
	
	//Variables
	double Input = 0;
	double Turn = 0;
	double LeftMotor = 0;
	double RightMotor = 0;
	double gyro = 0;
	double fakegyro = 0;
	boolean turning = false;
	
	
	while(true){
		System.out.println("Gyro: ");
		gyro = scan.nextDouble();
		System.out.println("Input: ");
		Input = scan.nextDouble();
		System.out.println("Turn: ");
		Turn = scan.nextDouble();
		
		if(Turn == 0 || Turn == 0.0){
			turning = false;
		}
		else{
			turning = true;
		}
	
	
		if(turning==false){
			LeftMotor = (Input + (((gyro-fakegyro)/360)));
			RightMotor = (Input - (((gyro-fakegyro)/360)));
		}
		else{
			RightMotor = Turn;
			LeftMotor = (Turn*-1);
			fakegyro=gyro;
		}
		
		System.out.println("Input: " + Input);
		System.out.println("Left Motor: " + LeftMotor);
		System.out.println("Right Motor: " + RightMotor);
		System.out.println("Gyro: " + gyro);
		System.out.println("Fakegyro: " + fakegyro);
	}	
		
	
}
}
