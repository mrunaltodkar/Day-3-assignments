package main;

public class Country{
	private String countryName;
	private long population;
	private long area;

	public Country(){

	}
	
	public Country(String countryName, long population, long area){
		this.countryName=countryName;
		this.population=population;
		this.area=area;
	
	}
	
	public String getCountryName(){
		return countryName;
	}
	
	public long getPopulation(){
		return population;
	}
	
	public long getArea(){
		return area;		
	}

	public Country largestArea(Country arr[]){
		long maxArea=arr[0].area;
		int index=0; 
		for(int i = 1; i < arr.length; i++){
             		if(maxArea < arr[i].area){
                    		maxArea = arr[i].area;
				index = i;
           		}
		}
		return arr[index] ; 
	}
	
	public Country largestPopulation(Country arr[]){
		long maxPopulation=arr[0].area;
		int index=0; 
		for(int i = 1; i < arr.length; i++){
             		if(maxPopulation < arr[i].population){
                    		maxPopulation = arr[i].population;
				index = i;
           		}
		}
		return arr[index] ; 
	}
	
	public Country largestPopulationDensity(Country arr[]){
		int index=0;
		double populationDensityMax = arr[0].population/arr[0].area;
		for(int i = 1; i < arr.length; i++){
        		double populationDensity = arr[i].population/arr[i].area;
       			
			if(populationDensityMax < populationDensity){
                		populationDensityMax = populationDensity;
				index = i;
           		}
		}
		
		return arr[index];
	}
}