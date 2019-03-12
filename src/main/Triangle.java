package main;

public class Triangle{

	int side1;
	int side2;
	int side3;

	public Triangle(int side1, int side2, int side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public boolean isRight(){
		int side1Square = side1 * side1;
		int side2Square = side2 * side2;
		int side3Square = side3 * side3;

		if(side1Square == side2Square + side3Square){
			return true;	
		}	
		else if(side2Square == side1Square + side3Square){
			return true;
		}
		else if(side3Square == side2Square + side1Square){
			return true;
		}
		else
			return false;
	}

	public boolean isScalene(){
		if(side1==side2 || side1==side3 || side2==side3){
			return false;
		}
		else 
			return true;
	}

	public boolean isIsosceles(){
		if(side1==side2 || side1==side3 || side2==side3){
			return true;
		}
		else 
			return false;
	}
	public boolean isEquilateral(){
		if(side1==side2 && side1==side3){
			return true;
		}
		else 
			return false;
	
	}	
}