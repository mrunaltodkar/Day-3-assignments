package main;

public class Date{
	int day;
	int month;
	int year;
	
	
	public Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public String toString(){
		return day +"/"+ month + "/" + year;
	}
	
	public boolean isSmaller(Date d){
		boolean compare=false;
		
		if(this.year<d.year){
			compare=true;
		}
		else if(this.year>this.year){
			compare=false;
		}
		else if(this.year==d.year){
			if(this.month<d.month){
				compare=true;
			}
			else if(this.month>d.month){
				compare=false;
			}
			else if(this.month==d.month){
				if(this.day<d.day){
					compare=true;
				}
				else if(this.day>=d.day){
					compare=false;
				}
			}
		}
		return compare;
	}
	
	public int[] diff(Date d){
		int [] arr= new int[3];
		arr[0]=this.day-d.day;
		arr[1]=this.month-d.month;
		arr[2]=this.year-d.year;
		
		return arr;
	}
}