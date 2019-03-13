package main;

public class Vehicle{

	private int currentSpeed;
	private double currentDirection;
	private String ownerName;
	private static int highestVehicleId=10010;
	private long vehicleId;
	public static final String TURN_LEFT="left";
	public static final String TURN_RIGHT="right";
	

	public Vehicle(){
		vehicleId=highestVehicleId++;
	}

	public Vehicle(int currentSpeed,double currentDirection,String ownerName){
		this();
		this.currentSpeed = currentSpeed;
		this.currentDirection = currentDirection;
		this.ownerName = ownerName;
	}

	public void setCurrentSpeed(int currentSpeed){
		this.currentSpeed=currentSpeed;
	}
	
	public double getCurrentSpeed(){
		return currentSpeed;
	}
	
	public void setCurrentDirection(double currentDirection){
		this.currentDirection=currentDirection;
	}

	public double getCurrentDirection(){
		return currentDirection;
	}

	public void setOwnerName(String ownerName){
		this.ownerName=ownerName;
	}

	public String getOwnerName(){
		return ownerName;
	}

	public long getVehicleId(){
		return vehicleId;
	}

	public static long getHighestVehicleId(){
		return highestVehicleId;
	}

	public int changeSpeed(int speed){
		return this.currentSpeed+speed;
	}

	public int stopSpeed(){
		return 0;
	}

	public double vehicleTurn(double degree, String leftOrRight){
		if(leftOrRight==TURN_LEFT){
			double afterRotation=this.currentDirection-degree;
			return afterRotation;
		}	
		else if(leftOrRight==TURN_RIGHT){
			double afterRotation=this.currentDirection+degree;
			return afterRotation;
		}
		else
			return 0.0;
	
	}

	public String toString(){
		return this.currentSpeed + " " + this.currentDirection + " " + this.ownerName;
	}
	
	
}