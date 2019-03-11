public class Date{
	private int day;
	private int month;
	private int year;

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
	
}